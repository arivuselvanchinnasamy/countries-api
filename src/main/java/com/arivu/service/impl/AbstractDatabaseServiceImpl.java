package com.arivu.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.SortField;
import org.jooq.SortOrder;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import org.jooq.impl.DSL;
import org.jooq.types.ULong;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.support.PageableExecutionUtils;

import com.arivu.model.AbstractDomainModel;
import com.arivu.service.IBaseService;

public abstract class AbstractDatabaseServiceImpl <R extends UpdatableRecord<R>, 
		P extends AbstractDomainModel> implements IBaseService<P> {

	@Autowired
	protected DSLContext dslContext;

	protected Logger logger;

	protected final Table<R> table;
	
	protected final Field<ULong> idField;

	protected final Class<P> pojoClass;

	@SuppressWarnings("unchecked")
	public AbstractDatabaseServiceImpl(Table<R> table, Field<ULong> idField) {
		logger = LoggerFactory.getLogger(this.getClass());
		Class<?>[] classArray = GenericTypeResolver.resolveTypeArguments(getClass(), AbstractDatabaseServiceImpl.class);
		this.pojoClass = (Class<P>) classArray[1];
		this.table = table;
		this.idField = idField;
	}
	
	@Override
	public Page<P> getPage(Pageable pageable) {
		return getPage(pageable,null);
	}

	@Override
	public Page<P> getPage(Pageable pageable, Map<String, Object> filterQuery) {
		filterQuery = (filterQuery != null ? filterQuery : new HashMap<>());
		List<SortField<?>> orderBy = new ArrayList<>();
		if (pageable.getSort() != null) {
			pageable.getSort().forEach(order -> {
				Field<?> field = table.field(order.getProperty().replaceAll("([A-Z])", "_$1").toLowerCase());
				if (field != null)
					orderBy.add(field.sort(order.getDirection() == Direction.ASC ? SortOrder.ASC : SortOrder.DESC));
			});
		}
		Condition filterCondition = filter(filterQuery);
		List<P> results = dslContext.selectFrom(table)
				.where(filterCondition)
				.orderBy(orderBy)
				.limit(pageable.getPageSize())
				.offset(pageable.getOffset())
				.fetchInto(pojoClass);
		return PageableExecutionUtils.getPage(results, pageable, () -> dslContext.fetchCount(table, filterCondition));
	}


	protected Condition filter(Map<String, Object> filterQuery) {
		Condition condition = DSL.trueCondition();
		filterQuery.entrySet().forEach(f -> {
			Field<?> tableField = table.field(f.getKey());
			condition.and(tableField.like(f.getValue().toString()));
		});
		return condition;
	}
}
