/*
 * This file is generated by jOOQ.
*/
package com.arivu.jooq.tables.records;


import com.arivu.jooq.tables.Country;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * Countries information
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountryRecord extends UpdatableRecordImpl<CountryRecord> implements Record9<ULong, String, String, String, BigDecimal, BigDecimal, String, String, String> {

    private static final long serialVersionUID = -1661343282;

    /**
     * Setter for <code>countries.country.ID</code>. Primary key
     */
    public CountryRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>countries.country.ID</code>. Primary key
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>countries.country.ISO_2</code>. ISO 3166-1 alpha-2 two-letter code
     */
    public CountryRecord setIso_2(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>countries.country.ISO_2</code>. ISO 3166-1 alpha-2 two-letter code
     */
    public String getIso_2() {
        return (String) get(1);
    }

    /**
     * Setter for <code>countries.country.NAME</code>. Name of the Country
     */
    public CountryRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>countries.country.NAME</code>. Name of the Country
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>countries.country.CAPITAL</code>. Capital of the Country
     */
    public CountryRecord setCapital(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>countries.country.CAPITAL</code>. Capital of the Country
     */
    public String getCapital() {
        return (String) get(3);
    }

    /**
     * Setter for <code>countries.country.LATITUDE</code>. Latitue information of the Country
     */
    public CountryRecord setLatitude(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>countries.country.LATITUDE</code>. Latitue information of the Country
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>countries.country.LONGITUDE</code>. Longitude information of the Country
     */
    public CountryRecord setLongitude(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>countries.country.LONGITUDE</code>. Longitude information of the Country
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>countries.country.CONTINENT_NAME</code>. Continent Name
     */
    public CountryRecord setContinentName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>countries.country.CONTINENT_NAME</code>. Continent Name
     */
    public String getContinentName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>countries.country.CURRENCY_NAME</code>. Name of currency being used in that Country
     */
    public CountryRecord setCurrencyName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>countries.country.CURRENCY_NAME</code>. Name of currency being used in that Country
     */
    public String getCurrencyName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>countries.country.LANGUAGE</code>. Official Languages of that Country
     */
    public CountryRecord setLanguage(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>countries.country.LANGUAGE</code>. Official Languages of that Country
     */
    public String getLanguage() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, String, String, String, BigDecimal, BigDecimal, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, String, String, String, BigDecimal, BigDecimal, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return Country.COUNTRY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Country.COUNTRY.ISO_2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Country.COUNTRY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Country.COUNTRY.CAPITAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Country.COUNTRY.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Country.COUNTRY.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Country.COUNTRY.CONTINENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Country.COUNTRY.CURRENCY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Country.COUNTRY.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getIso_2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCapital();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getContinentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCurrencyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value2(String value) {
        setIso_2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value4(String value) {
        setCapital(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value5(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value6(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value7(String value) {
        setContinentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value8(String value) {
        setCurrencyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord value9(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryRecord values(ULong value1, String value2, String value3, String value4, BigDecimal value5, BigDecimal value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CountryRecord
     */
    public CountryRecord() {
        super(Country.COUNTRY);
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    public CountryRecord(ULong id, String iso_2, String name, String capital, BigDecimal latitude, BigDecimal longitude, String continentName, String currencyName, String language) {
        super(Country.COUNTRY);

        set(0, id);
        set(1, iso_2);
        set(2, name);
        set(3, capital);
        set(4, latitude);
        set(5, longitude);
        set(6, continentName);
        set(7, currencyName);
        set(8, language);
    }
}