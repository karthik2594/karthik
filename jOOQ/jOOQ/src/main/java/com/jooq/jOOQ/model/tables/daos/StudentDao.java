/*
 * This file is generated by jOOQ.
 */
package com.jooq.jOOQ.model.tables.daos;


import com.jooq.jOOQ.model.tables.Student;
import com.jooq.jOOQ.model.tables.records.StudentRecord;

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
public class StudentDao extends DAOImpl<StudentRecord, com.jooq.jOOQ.model.tables.pojos.Student, Integer> {

    /**
     * Create a new StudentDao without any configuration
     */
    public StudentDao() {
        super(Student.STUDENT, com.jooq.jOOQ.model.tables.pojos.Student.class);
    }

    /**
     * Create a new StudentDao with an attached configuration
     */
    public StudentDao(Configuration configuration) {
        super(Student.STUDENT, com.jooq.jOOQ.model.tables.pojos.Student.class, configuration);
    }

    @Override
    public Integer getId(com.jooq.jOOQ.model.tables.pojos.Student object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Student.STUDENT.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchById(Integer... values) {
        return fetch(Student.STUDENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.jooq.jOOQ.model.tables.pojos.Student fetchOneById(Integer value) {
        return fetchOne(Student.STUDENT.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Student.STUDENT.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchByName(String... values) {
        return fetch(Student.STUDENT.NAME, values);
    }

    /**
     * Fetch records that have <code>dob BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchRangeOfDob(String lowerInclusive, String upperInclusive) {
        return fetchRange(Student.STUDENT.DOB, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>dob IN (values)</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchByDob(String... values) {
        return fetch(Student.STUDENT.DOB, values);
    }

    /**
     * Fetch records that have <code>department BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchRangeOfDepartment(String lowerInclusive, String upperInclusive) {
        return fetchRange(Student.STUDENT.DEPARTMENT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>department IN (values)</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchByDepartment(String... values) {
        return fetch(Student.STUDENT.DEPARTMENT, values);
    }

    /**
     * Fetch records that have <code>college BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchRangeOfCollege(String lowerInclusive, String upperInclusive) {
        return fetchRange(Student.STUDENT.COLLEGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>college IN (values)</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchByCollege(String... values) {
        return fetch(Student.STUDENT.COLLEGE, values);
    }

    /**
     * Fetch records that have <code>place BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchRangeOfPlace(String lowerInclusive, String upperInclusive) {
        return fetchRange(Student.STUDENT.PLACE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>place IN (values)</code>
     */
    public List<com.jooq.jOOQ.model.tables.pojos.Student> fetchByPlace(String... values) {
        return fetch(Student.STUDENT.PLACE, values);
    }
}
