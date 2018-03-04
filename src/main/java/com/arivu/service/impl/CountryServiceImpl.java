/**
 * 
 */
package com.arivu.service.impl;

import org.springframework.stereotype.Service;

import com.arivu.jooq.tables.Country;
import com.arivu.jooq.tables.records.CountryRecord;
import com.arivu.model.CountryDTO;
import com.arivu.service.ICountryService;

/**
 * @author Arivuselvan
 *
 */
@Service(CountryServiceImpl.BEAN_NAME)
public class CountryServiceImpl extends AbstractDatabaseServiceImpl<CountryRecord, CountryDTO>
			implements ICountryService {

	public static final String BEAN_NAME = "countryService";
	
	public CountryServiceImpl() {
		super(Country.COUNTRY, Country.COUNTRY.ID);
	}

	@Override
	public CountryDTO getByCode(String code) {
		return dslContext.selectFrom(table).where(Country.COUNTRY.ISO_2.eq(code)).fetchOneInto(pojoClass);
	}

	@Override
	public CountryDTO getByName(String name) {
		return dslContext.selectFrom(table).where(Country.COUNTRY.NAME.eq(name)).fetchOneInto(pojoClass);
	}

}
