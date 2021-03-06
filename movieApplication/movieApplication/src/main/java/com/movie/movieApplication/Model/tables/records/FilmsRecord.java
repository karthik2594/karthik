/*
 * This file is generated by jOOQ.
 */
package com.movie.movieApplication.Model.tables.records;


import com.movie.movieApplication.Model.tables.Films;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmsRecord extends UpdatableRecordImpl<FilmsRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1142948692;

    /**
     * Setter for <code>public.films.film_id</code>.
     */
    public void setFilmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.films.film_id</code>.
     */
    public Integer getFilmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.films.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.films.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.films.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.films.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Films.FILMS.FILM_ID;
    }

    @Override
    public Field<String> field2() {
        return Films.FILMS.NAME;
    }

    @Override
    public Field<String> field3() {
        return Films.FILMS.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getFilmId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Integer value1() {
        return getFilmId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public FilmsRecord value1(Integer value) {
        setFilmId(value);
        return this;
    }

    @Override
    public FilmsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public FilmsRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FilmsRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmsRecord
     */
    public FilmsRecord() {
        super(Films.FILMS);
    }

    /**
     * Create a detached, initialised FilmsRecord
     */
    public FilmsRecord(Integer filmId, String name, String description) {
        super(Films.FILMS);

        set(0, filmId);
        set(1, name);
        set(2, description);
    }
}
