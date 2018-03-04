package com.arivu.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arivu.constants.CountriesAPIConstant;
import com.arivu.exception.ResourceNotFoundException;
import com.arivu.model.AbstractDomainModel;
import com.arivu.service.IBaseService;

/**
 * @author Arivuselvan
 *
 * @param <D>
 * @param <S>
 */
public abstract class AbstractDatabaseRestV1Controller<P extends AbstractDomainModel,
	S extends IBaseService<P>> {
	
	protected final Logger logger;
	
	@Autowired
	protected S dbService;
	
	
	protected final Class<P> entityType;
	
	protected String resourceName;
	
	protected String controllerMappingFullString;
	
	@SuppressWarnings("unchecked")
	public AbstractDatabaseRestV1Controller() {
		this.logger = LoggerFactory.getLogger(this.getClass());
		Class<?>[] classArray = GenericTypeResolver.resolveTypeArguments(getClass(), AbstractDatabaseRestV1Controller.class);
		this.entityType = (Class<P>) classArray[0];
		controllerMappingFullString = "/"+this.getClass().getAnnotation(RequestMapping.class).value()[0];
		int lastIndex = controllerMappingFullString.lastIndexOf('/');
		this.resourceName = controllerMappingFullString.substring(lastIndex+1);
	}
	
    @GetMapping()
    public ResponseEntity<Page<P>> listAll(Pageable pageable){    	
     	pageable= (pageable == null ? new PageRequest(0, 10) : pageable);
     	logger.debug("pageable {}", pageable);
    	return ResponseEntity.ok(this.dbService.getPage(pageable));
    }
    
    @GetMapping(CountriesAPIConstant.CODE_URL)
    public ResponseEntity<P> getByCode(@PathVariable(CountriesAPIConstant.CODE) String code) {
    	P pojo = this.dbService.getByCode(code);
    	if (pojo == null) {
			throw new ResourceNotFoundException(String.format("Unable to find %s by given code %s ", this.resourceName,code));
		}
    	return ResponseEntity.ok(pojo);
    }    
}
