/*
 * This file is generated by jOOQ.
 */
package com.example.roles.model;


import javax.annotation.processing.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.ref_details_ref_id_seq</code>
     */
    public static final Sequence<Integer> REF_DETAILS_REF_ID_SEQ = new SequenceImpl<Integer>("ref_details_ref_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));
}
