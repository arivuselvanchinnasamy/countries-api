package com.arivu.constants;

public class CountriesAPIConstant {

	private CountriesAPIConstant() {
		
	}
	
	public static final String API ="api/";
	public static final String V1 ="v1/";
	public static final String REST_V1_URL = API + V1;
	public static final String CONTINENTS = "continents";
	public static final String COUNTRIES = "countries";
	public static final String CODE = "code";
	public static final String NAME = "name";
	public static final String REST_V1_CONTINENTS_URL = REST_V1_URL + CONTINENTS;
	public static final String REST_V1_COUNTRIES_URL = REST_V1_URL + COUNTRIES;
	public static final String CODE_URL = "/{" + CODE + "}";
	public static final String NAME_URL = "/{" + NAME + "}";
}
