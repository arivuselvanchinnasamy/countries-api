package com.arivu.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arivu.constants.CountriesAPIConstant;
import com.arivu.model.CountryDTO;
import com.arivu.service.ICountryService;

@RestController
@RequestMapping(CountriesAPIConstant.REST_V1_COUNTRIES_URL)
public class CountryRestV1Controller 
		extends AbstractDatabaseRestV1Controller<CountryDTO, ICountryService> {

	public CountryRestV1Controller() {
		super();
	}
}
