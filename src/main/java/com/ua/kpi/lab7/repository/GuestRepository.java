package com.ua.kpi.lab7.repository;

import com.ua.kpi.lab7.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
