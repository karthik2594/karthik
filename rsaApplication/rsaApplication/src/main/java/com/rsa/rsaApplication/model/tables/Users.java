/*
 * This file is generated by jOOQ.
 */
package com.rsa.rsaApplication.model.tables;


import com.rsa.rsaApplication.model.Indexes;
import com.rsa.rsaApplication.model.Keys;
import com.rsa.rsaApplication.model.Public;
import com.rsa.rsaApplication.model.tables.records.UsersRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = 1586744291;

    /**
     * The reference instance of <code>public.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>public.users.user_id</code>.
     */
    public final TableField<UsersRecord, Integer> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('users_user_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.users.name</code>.
     */
    public final TableField<UsersRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.users.phone</code>.
     */
    public final TableField<UsersRecord, String> PHONE = createField(DSL.name("phone"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.users.mail</code>.
     */
    public final TableField<UsersRecord, String> MAIL = createField(DSL.name("mail"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>public.users</code> table reference
     */
    public Users() {
        this(DSL.name("users"), null);
    }

    /**
     * Create an aliased <code>public.users</code> table reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>public.users</code> table reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    private Users(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Users(Table<O> child, ForeignKey<O, UsersRecord> key) {
        super(child, key, USERS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USERS_PKEY);
    }

    @Override
    public Identity<UsersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USERS;
    }

    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.USERS_PKEY;
    }

    @Override
    public List<UniqueKey<UsersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.USERS_PKEY);
    }

    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
