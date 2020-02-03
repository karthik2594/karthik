/*
 * This file is generated by jOOQ.
 */
package com.example.roles.model.tables.daos;


import com.example.roles.model.tables.RefDetails;
import com.example.roles.model.tables.records.RefDetailsRecord;

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
public class RefDetailsDao extends DAOImpl<RefDetailsRecord, com.example.roles.model.tables.pojos.RefDetails, Integer> {

    /**
     * Create a new RefDetailsDao without any configuration
     */
    public RefDetailsDao() {
        super(RefDetails.REF_DETAILS, com.example.roles.model.tables.pojos.RefDetails.class);
    }

    /**
     * Create a new RefDetailsDao with an attached configuration
     */
    public RefDetailsDao(Configuration configuration) {
        super(RefDetails.REF_DETAILS, com.example.roles.model.tables.pojos.RefDetails.class, configuration);
    }

    @Override
    public Integer getId(com.example.roles.model.tables.pojos.RefDetails object) {
        return object.getRefId();
    }

    /**
     * Fetch records that have <code>ref_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.example.roles.model.tables.pojos.RefDetails> fetchRangeOfRefId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(RefDetails.REF_DETAILS.REF_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ref_id IN (values)</code>
     */
    public List<com.example.roles.model.tables.pojos.RefDetails> fetchByRefId(Integer... values) {
        return fetch(RefDetails.REF_DETAILS.REF_ID, values);
    }

    /**
     * Fetch a unique record that has <code>ref_id = value</code>
     */
    public com.example.roles.model.tables.pojos.RefDetails fetchOneByRefId(Integer value) {
        return fetchOne(RefDetails.REF_DETAILS.REF_ID, value);
    }

    /**
     * Fetch records that have <code>rol_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.example.roles.model.tables.pojos.RefDetails> fetchRangeOfRolId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(RefDetails.REF_DETAILS.ROL_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rol_id IN (values)</code>
     */
    public List<com.example.roles.model.tables.pojos.RefDetails> fetchByRolId(Integer... values) {
        return fetch(RefDetails.REF_DETAILS.ROL_ID, values);
    }

    /**
     * Fetch records that have <code>use_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.example.roles.model.tables.pojos.RefDetails> fetchRangeOfUseId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(RefDetails.REF_DETAILS.USE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>use_id IN (values)</code>
     */
    public List<com.example.roles.model.tables.pojos.RefDetails> fetchByUseId(Integer... values) {
        return fetch(RefDetails.REF_DETAILS.USE_ID, values);
    }
}
