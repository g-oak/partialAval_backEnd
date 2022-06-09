package com.dh.movie.controller;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.entity.Movie;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")

public class MovieController {
    @Autowired
    private MovieService service;

    @PostMapping
    public ResponseEntity <Void> save(@RequestBody MovieDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{genre}")
    public Movie findByGenre(@PathVariable String genre){
        return service.findByGenre(genre);
    }
}

