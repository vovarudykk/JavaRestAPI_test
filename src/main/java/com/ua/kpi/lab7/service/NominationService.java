package com.ua.kpi.lab7.service;

import com.ua.kpi.lab7.entity.Nomination;

import java.util.List;

public interface NominationService {
    Nomination createNomination(Nomination nomination);

    Nomination updateNominationById(Nomination nomination, long id);

    List<Nomination> getNominations();

    Nomination getNominationById(long id);

    void deleteNominationById(long id);
}
