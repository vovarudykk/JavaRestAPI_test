package com.ua.kpi.lab7.service;

import com.ua.kpi.lab7.entity.Guest;

import java.util.List;

public interface GuestService {
    Guest createGuest(Guest guest);

    Guest updateGuestById(Guest guest, long id);

    List<Guest> getGuests();

    Guest getGuestById(long id);

    void deleteGuestById(long id);
}
