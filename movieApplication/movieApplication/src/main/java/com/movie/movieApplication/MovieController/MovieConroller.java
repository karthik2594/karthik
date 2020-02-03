package com.movie.movieApplication.MovieController;


import com.movie.movieApplication.MovieRepository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieConroller {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movie/{id}")
    public Object movieFetch(@PathVariable Integer id) {
    return movieRepository.movieFetch(id);
    }
}