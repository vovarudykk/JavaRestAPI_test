package com.ua.kpi.lab7.service;

import com.ua.kpi.lab7.entity.Jury;

import java.util.List;

public interface JuryService {
    Jury createJury(Jury jury);

    Jury updateJuryById(Jury jury, long id);

    List<Jury> getJuries();

    Jury getJuryById(long id);

    void deleteJuryById(long id);
}
