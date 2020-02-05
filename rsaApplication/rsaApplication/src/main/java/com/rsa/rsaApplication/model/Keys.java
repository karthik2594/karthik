/*
 * This file is generated by jOOQ.
 */
package com.rsa.rsaApplication.model;


import com.rsa.rsaApplication.model.tables.PriKey;
import com.rsa.rsaApplication.model.tables.PubKey;
import com.rsa.rsaApplication.model.tables.Users;
import com.rsa.rsaApplication.model.tables.records.PriKeyRecord;
import com.rsa.rsaApplication.model.tables.records.PubKeyRecord;
import com.rsa.rsaApplication.model.tables.records.UsersRecord;

import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<PriKeyRecord, Integer> IDENTITY_PRI_KEY = Identities0.IDENTITY_PRI_KEY;
    public static final Identity<PubKeyRecord, Integer> IDENTITY_PUB_KEY = Identities0.IDENTITY_PUB_KEY;
    public static final Identity<UsersRecord, Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PriKeyRecord> PRI_KEY_PKEY = UniqueKeys0.PRI_KEY_PKEY;
    public static final UniqueKey<PubKeyRecord> PUB_KEY_PKEY = UniqueKeys0.PUB_KEY_PKEY;
    public static final UniqueKey<UsersRecord> USERS_PKEY = UniqueKeys0.USERS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<PriKeyRecord, UsersRecord> PRI_KEY__PRI_KEY_USR_ID_FKEY = ForeignKeys0.PRI_KEY__PRI_KEY_USR_ID_FKEY;
    public static final ForeignKey<PubKeyRecord, UsersRecord> PUB_KEY__PUB_KEY_USR_ID_FKEY = ForeignKeys0.PUB_KEY__PUB_KEY_USR_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<PriKeyRecord, Integer> IDENTITY_PRI_KEY = Internal.createIdentity(PriKey.PRI_KEY, PriKey.PRI_KEY.ID);
        public static Identity<PubKeyRecord, Integer> IDENTITY_PUB_KEY = Internal.createIdentity(PubKey.PUB_KEY, PubKey.PUB_KEY.ID);
        public static Identity<UsersRecord, Integer> IDENTITY_USERS = Internal.createIdentity(Users.USERS, Users.USERS.USER_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<PriKeyRecord> PRI_KEY_PKEY = Internal.createUniqueKey(PriKey.PRI_KEY, "pri_key_pkey", PriKey.PRI_KEY.ID);
        public static final UniqueKey<PubKeyRecord> PUB_KEY_PKEY = Internal.createUniqueKey(PubKey.PUB_KEY, "pub_key_pkey", PubKey.PUB_KEY.ID);
        public static final UniqueKey<UsersRecord> USERS_PKEY = Internal.createUniqueKey(Users.USERS, "users_pkey", Users.USERS.USER_ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<PriKeyRecord, UsersRecord> PRI_KEY__PRI_KEY_USR_ID_FKEY = Internal.createForeignKey(com.rsa.rsaApplication.model.Keys.USERS_PKEY, PriKey.PRI_KEY, "pri_key__pri_key_usr_id_fkey", PriKey.PRI_KEY.USR_ID);
        public static final ForeignKey<PubKeyRecord, UsersRecord> PUB_KEY__PUB_KEY_USR_ID_FKEY = Internal.createForeignKey(com.rsa.rsaApplication.model.Keys.USERS_PKEY, PubKey.PUB_KEY, "pub_key__pub_key_usr_id_fkey", PubKey.PUB_KEY.USR_ID);
    }
}
