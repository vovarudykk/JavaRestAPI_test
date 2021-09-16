package com.ua.kpi.lab7.controllers;

import com.ua.kpi.lab7.entity.Film;
import com.ua.kpi.lab7.service.FilmService;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FilmController {
    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @PostMapping("/film")
    public ResponseEntity<?> createNewFilm(@RequestBody Film film) {
        Film resultFilm = filmService.createFilm(film);
        return ResponseEntity.ok(resultFilm);
    }

    @GetMapping("/film")
    public ResponseEntity<?> getFilms() {
        List<Film> resultFilms = filmService.getFilms();
        return ResponseEntity.ok(resultFilms);
    }

    @GetMapping("/film/{id}")
    public ResponseEntity<?> getFilmById(@PathVariable("id") long id) {
        Film resultFilm = filmService.getFilmById(id);
        return ResponseEntity.ok(resultFilm);
    }

    @DeleteMapping("/film/{id}")
    public ResponseEntity<?> deleteFilmById(@PathVariable("id") long id) {
        filmService.deleteFilmById(id);
        return ResponseEntity.ok("delete");
    }

    @PutMapping("/film/{id}")
    public ResponseEntity<?> updateFilmById(@PathVariable("id") long id, @RequestBody Film film) {
        Film resultFilm = filmService.updateFilmById(film, id);
        return ResponseEntity.ok(resultFilm);
    }
}
