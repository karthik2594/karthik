/*
 * This file is generated by jOOQ.
 */
package com.example.roles.model;


import com.example.roles.model.tables.RefDetails;
import com.example.roles.model.tables.Roles;
import com.example.roles.model.tables.Users;

import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index REF_DETAILS_PKEY = Indexes0.REF_DETAILS_PKEY;
    public static final Index ROLES_PKEY = Indexes0.ROLES_PKEY;
    public static final Index USERS_PKEY = Indexes0.USERS_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index REF_DETAILS_PKEY = Internal.createIndex("ref_details_pkey", RefDetails.REF_DETAILS, new OrderField[] { RefDetails.REF_DETAILS.REF_ID }, true);
        public static Index ROLES_PKEY = Internal.createIndex("roles_pkey", Roles.ROLES, new OrderField[] { Roles.ROLES.ROLE_ID }, true);
        public static Index USERS_PKEY = Internal.createIndex("users_pkey", Users.USERS, new OrderField[] { Users.USERS.USER_ID }, true);
    }
}
