package com.ua.kpi.lab7.service.implementation;

import com.ua.kpi.lab7.entity.Film;
import com.ua.kpi.lab7.entity.Guest;
import com.ua.kpi.lab7.repository.GuestRepository;
import com.ua.kpi.lab7.service.GuestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {
    private final GuestRepository guestRepo;

    public GuestServiceImpl(GuestRepository guestRepo) {
        this.guestRepo = guestRepo;
    }

    @Override
    public Guest createGuest(Guest guest) {
        return guestRepo.save(guest);
    }

    @Override
    public Guest updateGuestById(Guest guest, long id) {
        Guest guestFromDB = guestRepo.findById(id).orElseThrow(null);
        guestFromDB.setName(guest.getName());
        guestFromDB.setSurname((guest.getSurname()));
        guestRepo.save(guestFromDB);
        return guestFromDB;
    }

    @Override
    public List<Guest> getGuests() {
        return guestRepo.findAll();
    }

    @Override
    public Guest getGuestById(long id) {
        return guestRepo.findById(id).orElseThrow(null);
    }

    @Override
    public void deleteGuestById(long id) {
        guestRepo.deleteById(id);
    }
}
