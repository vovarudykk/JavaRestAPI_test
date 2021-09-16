package com.ua.kpi.lab7.service;

import com.ua.kpi.lab7.entity.Participant;

import java.util.List;

public interface ParticipantService {
    Participant createParticipant(Participant participant);

    Participant updateParticipantById(Participant participant, long id);

    List<Participant> getParticipants();

    Participant getParticipantById(long id);

    void deleteParticipantById(long id);
}
