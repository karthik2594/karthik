/*
 * This file is generated by jOOQ.
 */
package com.movie.movieApplication.Model;


import com.movie.movieApplication.Model.tables.Crew;
import com.movie.movieApplication.Model.tables.Films;
import com.movie.movieApplication.Model.tables.Language;
import com.movie.movieApplication.Model.tables.MovieRef;
import com.movie.movieApplication.Model.tables.Ratings;

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

    private static final long serialVersionUID = 1290894866;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.crew</code>.
     */
    public final Crew CREW = com.movie.movieApplication.Model.tables.Crew.CREW;

    /**
     * The table <code>public.films</code>.
     */
    public final Films FILMS = com.movie.movieApplication.Model.tables.Films.FILMS;

    /**
     * The table <code>public.language</code>.
     */
    public final Language LANGUAGE = com.movie.movieApplication.Model.tables.Language.LANGUAGE;

    /**
     * The table <code>public.movie_ref</code>.
     */
    public final MovieRef MOVIE_REF = com.movie.movieApplication.Model.tables.MovieRef.MOVIE_REF;

    /**
     * The table <code>public.ratings</code>.
     */
    public final Ratings RATINGS = com.movie.movieApplication.Model.tables.Ratings.RATINGS;

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
            Sequences.CREW_CREW_ID_SEQ,
            Sequences.FILMS_FILM_ID_SEQ,
            Sequences.LANGUAGE_LANG_ID_SEQ,
            Sequences.MOVIE_REF_ID_SEQ,
            Sequences.RATINGS_RATING_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Crew.CREW,
            Films.FILMS,
            Language.LANGUAGE,
            MovieRef.MOVIE_REF,
            Ratings.RATINGS);
    }
}
