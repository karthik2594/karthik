/*
 * This file is generated by jOOQ.
 */
package com.rsa.rsaApplication.model;


import com.rsa.rsaApplication.model.tables.PriKey;
import com.rsa.rsaApplication.model.tables.PubKey;
import com.rsa.rsaApplication.model.tables.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1313809374;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.pri_key</code>.
     */
    public final PriKey PRI_KEY = com.rsa.rsaApplication.model.tables.PriKey.PRI_KEY;

    /**
     * The table <code>public.pub_key</code>.
     */
    public final PubKey PUB_KEY = com.rsa.rsaApplication.model.tables.PubKey.PUB_KEY;

    /**
     * The table <code>public.users</code>.
     */
    public final Users USERS = com.rsa.rsaApplication.model.tables.Users.USERS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.PRI_KEY_ID_SEQ,
            Sequences.PUB_KEY_ID_SEQ,
            Sequences.USERS_USER_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            PriKey.PRI_KEY,
            PubKey.PUB_KEY,
            Users.USERS);
    }
}
