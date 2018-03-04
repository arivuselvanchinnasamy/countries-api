package com.arivu.service;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.arivu.model.AbstractDomainModel;

public interface IBaseService<P extends AbstractDomainModel> {

	/**
	 * retrieve page of information based on given pageable
	 * 
	 * @param pageable
	 * @return
	 */
	Page<P> getPage(Pageable pageable);

	/**
	 * retrieve page of information based on given pageable and filterQuery
	 * 
	 * @param pageable
	 * @param filterQuery
	 * @return
	 */
	Page<P> getPage(Pageable pageable, Map<String, Object> filterQuery);

	/**
	 * @param code
	 * @return
	 */
	P getByCode(String code);
	
	/**
	 * @param name
	 * @return
	 */
	P getByName(String name);

}
