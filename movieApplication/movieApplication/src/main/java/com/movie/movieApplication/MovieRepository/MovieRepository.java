package com.movie.movieApplication.MovieRepository;

import com.movie.movieApplication.Model.tables.pojos.Crew;
import com.movie.movieApplication.Model.tables.pojos.Films;
import com.movie.movieApplication.Model.tables.pojos.Language;
import com.movie.movieApplication.Model.tables.pojos.Ratings;
import com.movie.movieApplication.Validator.MovieFetch;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import static com.movie.movieApplication.Model.tables.Crew.CREW;
import static com.movie.movieApplication.Model.tables.Films.FILMS;
import static com.movie.movieApplication.Model.tables.Language.LANGUAGE;
import static com.movie.movieApplication.Model.tables.MovieRef.MOVIE_REF;
import static com.movie.movieApplication.Model.tables.Ratings.RATINGS;

@Repository
@RequiredArgsConstructor
public class MovieRepository {

    private final DSLContext db;
    
    public MovieFetch movieFetch(Integer id) {
        Films films = db.selectFrom(FILMS).where(FILMS.FILM_ID.eq(id))
                .fetchOneInto(Films.class);
        List<Crew> crews = db.select(CREW.LEAD_ROLE,CREW.CREW_ID,CREW.OTHERS)
                .from(CREW)
                .join(MOVIE_REF)
                .on(MOVIE_REF.CR_ID.eq(id))
                .where(CREW.CREW_ID.eq(MOVIE_REF.CR_ID))
                .fetchInto(Crew.class);
        List<Language> languages = db.select(LANGUAGE.LANG_ID,LANGUAGE.LANGUAGE_)
                .from(LANGUAGE)
                .join(MOVIE_REF)
                .on(MOVIE_REF.LA_ID.eq(id))
                .where(LANGUAGE.LANG_ID.eq(MOVIE_REF.LA_ID))
                .fetchInto(Language.class);
        List<Ratings> ratings = db.select(RATINGS.RATING_ID,RATINGS.RATING)
                .from(RATINGS)
                .join(MOVIE_REF)
                .on(MOVIE_REF.RA_ID.eq(id))
                .where(RATINGS.RATING_ID.eq(MOVIE_REF.RA_ID))
                .fetchInto(Ratings.class);
        return new MovieFetch(films.getFilmId(), films.getName(), films.getDescription(),crews, languages, ratings);

    }
}
