package com.arivu.configuration;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

@Configuration
public class CountriesAPIConfiguration {

	@Autowired
	private ObjectMapper objectMapper;
	
	@PostConstruct
	public void initialize() {
		this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		this.objectMapper.setPropertyInclusion(JsonInclude.Value.construct(Include.NON_NULL, Include.ALWAYS));
		this.objectMapper.setPropertyInclusion(JsonInclude.Value.construct(Include.NON_EMPTY, Include.ALWAYS));
		this.objectMapper.setDateFormat(new ISO8601DateFormat());
	}

}
