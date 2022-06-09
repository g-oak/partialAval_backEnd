package com.dh.movie.repository;

import com.dh.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MovieRepository extends JpaRepository <Movie,Long> {
    Movie findByGenre(String genre);
}
