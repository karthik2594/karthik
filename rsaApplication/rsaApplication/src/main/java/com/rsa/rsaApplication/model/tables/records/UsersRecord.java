/*
 * This file is generated by jOOQ.
 */
package com.rsa.rsaApplication.model.tables.records;


import com.rsa.rsaApplication.model.tables.Users;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = 1208233904;

    /**
     * Setter for <code>public.users.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.users.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.users.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.users.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.users.phone</code>.
     */
    public void setPhone(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.users.phone</code>.
     */
    public String getPhone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.users.mail</code>.
     */
    public void setMail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.users.mail</code>.
     */
    public String getMail() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Users.USERS.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return Users.USERS.NAME;
    }

    @Override
    public Field<String> field3() {
        return Users.USERS.PHONE;
    }

    @Override
    public Field<String> field4() {
        return Users.USERS.MAIL;
    }

    @Override
    public Integer component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getPhone();
    }

    @Override
    public String component4() {
        return getMail();
    }

    @Override
    public Integer value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getPhone();
    }

    @Override
    public String value4() {
        return getMail();
    }

    @Override
    public UsersRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public UsersRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public UsersRecord value3(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public UsersRecord value4(String value) {
        setMail(value);
        return this;
    }

    @Override
    public UsersRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Integer userId, String name, String phone, String mail) {
        super(Users.USERS);

        set(0, userId);
        set(1, name);
        set(2, phone);
        set(3, mail);
    }
}
