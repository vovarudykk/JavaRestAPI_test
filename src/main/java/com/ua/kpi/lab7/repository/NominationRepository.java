package com.ua.kpi.lab7.repository;

import com.ua.kpi.lab7.entity.Nomination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NominationRepository extends JpaRepository<Nomination, Long> {
}
