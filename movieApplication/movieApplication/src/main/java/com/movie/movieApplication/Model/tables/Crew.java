/*
 * This file is generated by jOOQ.
 */
package com.movie.movieApplication.Model.tables;


import com.movie.movieApplication.Model.Indexes;
import com.movie.movieApplication.Model.Keys;
import com.movie.movieApplication.Model.Public;
import com.movie.movieApplication.Model.tables.records.CrewRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Crew extends TableImpl<CrewRecord> {

    private static final long serialVersionUID = 933953175;

    /**
     * The reference instance of <code>public.crew</code>
     */
    public static final Crew CREW = new Crew();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CrewRecord> getRecordType() {
        return CrewRecord.class;
    }

    /**
     * The column <code>public.crew.crew_id</code>.
     */
    public final TableField<CrewRecord, Integer> CREW_ID = createField(DSL.name("crew_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('crew_crew_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.crew.lead_role</code>.
     */
    public final TableField<CrewRecord, String> LEAD_ROLE = createField(DSL.name("lead_role"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.crew.others</code>.
     */
    public final TableField<CrewRecord, String> OTHERS = createField(DSL.name("others"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>public.crew</code> table reference
     */
    public Crew() {
        this(DSL.name("crew"), null);
    }

    /**
     * Create an aliased <code>public.crew</code> table reference
     */
    public Crew(String alias) {
        this(DSL.name(alias), CREW);
    }

    /**
     * Create an aliased <code>public.crew</code> table reference
     */
    public Crew(Name alias) {
        this(alias, CREW);
    }

    private Crew(Name alias, Table<CrewRecord> aliased) {
        this(alias, aliased, null);
    }

    private Crew(Name alias, Table<CrewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Crew(Table<O> child, ForeignKey<O, CrewRecord> key) {
        super(child, key, CREW);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CREW_PKEY);
    }

    @Override
    public Identity<CrewRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CREW;
    }

    @Override
    public UniqueKey<CrewRecord> getPrimaryKey() {
        return Keys.CREW_PKEY;
    }

    @Override
    public List<UniqueKey<CrewRecord>> getKeys() {
        return Arrays.<UniqueKey<CrewRecord>>asList(Keys.CREW_PKEY);
    }

    @Override
    public Crew as(String alias) {
        return new Crew(DSL.name(alias), this);
    }

    @Override
    public Crew as(Name alias) {
        return new Crew(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Crew rename(String name) {
        return new Crew(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Crew rename(Name name) {
        return new Crew(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
