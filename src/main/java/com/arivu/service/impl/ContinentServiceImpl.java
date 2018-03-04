package com.arivu.service.impl;

import org.springframework.stereotype.Service;

import com.arivu.jooq.tables.Continent;
import com.arivu.jooq.tables.records.ContinentRecord;
import com.arivu.model.ContinentDTO;
import com.arivu.service.IContinentService;

@Service(ContinentServiceImpl.BEAN_NAME)
public class ContinentServiceImpl extends AbstractDatabaseServiceImpl<ContinentRecord, ContinentDTO> 
				implements IContinentService {

	public static final String BEAN_NAME = "continentService";
	
	public ContinentServiceImpl() {
		super(Continent.CONTINENT, Continent.CONTINENT.ID);
	}

	@Override
	public ContinentDTO getByCode(String code) {
		return dslContext.selectFrom(table).where(Continent.CONTINENT.CONTINENT_CODE.eq(code)).fetchOneInto(pojoClass);
	}

	@Override
	public ContinentDTO getByName(String name) {
		return dslContext.selectFrom(table).where(Continent.CONTINENT.CONTINENT_NAME.eq(name)).fetchOneInto(pojoClass);
	}

}
