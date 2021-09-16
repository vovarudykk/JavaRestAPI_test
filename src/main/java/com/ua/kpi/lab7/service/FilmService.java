package com.ua.kpi.lab7.service;

import com.ua.kpi.lab7.entity.Film;

import java.util.List;

public interface FilmService {
    Film createFilm(Film film);

    Film updateFilmById(Film film, long id);

    List<Film> getFilms();

    Film getFilmById(long id);

    void deleteFilmById(long id);
}
