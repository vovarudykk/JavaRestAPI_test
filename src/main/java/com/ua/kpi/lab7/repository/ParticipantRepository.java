package com.ua.kpi.lab7.repository;

import com.ua.kpi.lab7.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
