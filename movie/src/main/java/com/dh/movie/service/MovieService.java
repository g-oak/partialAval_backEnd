package com.dh.movie.service;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.entity.Movie;

public interface MovieService {
    void save (MovieDTO dto);
    Movie findByGenre(String genre);

}
