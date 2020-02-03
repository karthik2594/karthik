/*
 * This file is generated by jOOQ.
 */
package com.movie.movieApplication.Model.tables.daos;


import com.movie.movieApplication.Model.tables.Language;
import com.movie.movieApplication.Model.tables.records.LanguageRecord;

import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class LanguageDao extends DAOImpl<LanguageRecord, com.movie.movieApplication.Model.tables.pojos.Language, Integer> {

    /**
     * Create a new LanguageDao without any configuration
     */
    public LanguageDao() {
        super(Language.LANGUAGE, com.movie.movieApplication.Model.tables.pojos.Language.class);
    }

    /**
     * Create a new LanguageDao with an attached configuration
     */
    public LanguageDao(Configuration configuration) {
        super(Language.LANGUAGE, com.movie.movieApplication.Model.tables.pojos.Language.class, configuration);
    }

    @Override
    public Integer getId(com.movie.movieApplication.Model.tables.pojos.Language object) {
        return object.getLangId();
    }

    /**
     * Fetch records that have <code>lang_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.movie.movieApplication.Model.tables.pojos.Language> fetchRangeOfLangId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Language.LANGUAGE.LANG_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>lang_id IN (values)</code>
     */
    public List<com.movie.movieApplication.Model.tables.pojos.Language> fetchByLangId(Integer... values) {
        return fetch(Language.LANGUAGE.LANG_ID, values);
    }

    /**
     * Fetch a unique record that has <code>lang_id = value</code>
     */
    public com.movie.movieApplication.Model.tables.pojos.Language fetchOneByLangId(Integer value) {
        return fetchOne(Language.LANGUAGE.LANG_ID, value);
    }

    /**
     * Fetch records that have <code>language BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.movie.movieApplication.Model.tables.pojos.Language> fetchRangeOfLanguage(String lowerInclusive, String upperInclusive) {
        return fetchRange(Language.LANGUAGE.LANGUAGE_, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>language IN (values)</code>
     */
    public List<com.movie.movieApplication.Model.tables.pojos.Language> fetchByLanguage(String... values) {
        return fetch(Language.LANGUAGE.LANGUAGE_, values);
    }
}