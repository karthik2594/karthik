package com.movie.movieApplication.Validator;


import com.movie.movieApplication.Model.tables.pojos.Crew;
import com.movie.movieApplication.Model.tables.pojos.Language;
import com.movie.movieApplication.Model.tables.pojos.Ratings;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieFetch {

    private Integer filmId;
    private String  name;
    private String  description;

    private List<Crew> crews;
    private List<Language> languages;
    private List<Ratings> ratings;

}
