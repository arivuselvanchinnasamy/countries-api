package com.arivu.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arivu.constants.CountriesAPIConstant;
import com.arivu.model.ContinentDTO;
import com.arivu.service.IContinentService;

@RestController
@RequestMapping(CountriesAPIConstant.REST_V1_CONTINENTS_URL)
public class ContinentRestV1Controller 
		extends AbstractDatabaseRestV1Controller<ContinentDTO, IContinentService> {

	public ContinentRestV1Controller() {
		super();
	}
}
