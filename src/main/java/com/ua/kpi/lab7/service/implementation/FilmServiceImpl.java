package com.ua.kpi.lab7.service.implementation;

import com.ua.kpi.lab7.entity.Film;
import com.ua.kpi.lab7.repository.FilmRepository;
import com.ua.kpi.lab7.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    private final FilmRepository filmRepo;

    public FilmServiceImpl(FilmRepository filmRepo) {
        this.filmRepo = filmRepo;
    }

    @Override
    public Film createFilm(Film film) {
        return filmRepo.save(film);
    }

    @Override
    public Film updateFilmById(Film film, long id) {
        Film filmFromDB = filmRepo.findById(id).orElseThrow(null);
        filmFromDB.setName(film.getName());
        filmFromDB.setScore((film.getScore()));
        filmRepo.save(filmFromDB);
        return filmFromDB;
    }

    @Override
    public List<Film> getFilms() {
        return filmRepo.findAll();
    }

    @Override
    public Film getFilmById(long id) {
        return filmRepo.findById(id).orElseThrow(null);
    }

    @Override
    public void deleteFilmById(long id) {
        filmRepo.deleteById(id);
    }
}
