package com.ua.kpi.lab7.controllers;

import com.ua.kpi.lab7.service.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    private final FilmService filmService;

    public ViewController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listFilms", filmService.getFilms());
        return "index";
    }
}
