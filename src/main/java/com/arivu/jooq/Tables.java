/*
 * This file is generated by jOOQ.
*/
package com.arivu.jooq;


import com.arivu.jooq.tables.Continent;
import com.arivu.jooq.tables.Country;
import com.arivu.jooq.tables.SchemaVersion;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in countries
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * World Continent's information
     */
    public static final Continent CONTINENT = com.arivu.jooq.tables.Continent.CONTINENT;

    /**
     * Countries information
     */
    public static final Country COUNTRY = com.arivu.jooq.tables.Country.COUNTRY;

    /**
     * The table <code>countries.schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = com.arivu.jooq.tables.SchemaVersion.SCHEMA_VERSION;
}