package com.cloud.cloudserver.services;

import com.cloud.cloudserver.entities.Movie;
import com.cloud.cloudserver.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    public Movie Add(Movie movie){
        return movieRepository.save(movie);
    }
}
