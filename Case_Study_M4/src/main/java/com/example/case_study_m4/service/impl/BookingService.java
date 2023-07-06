package com.example.case_study_m4.service.impl;

import com.example.case_study_m4.model.Booking;
import com.example.case_study_m4.repository.IBookingRepository;
import com.example.case_study_m4.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookingService implements IBookingService {
    @Autowired
    private IBookingRepository iBookingRepository;
    @Override
    public Iterable<Booking> findAll() {
        return iBookingRepository.findAll();
    }

    @Override
    public Optional<Booking> findOne(Long id) {
        return iBookingRepository.findById(id);
    }

    @Override
    public Booking save(Booking booking) {
        return iBookingRepository.save(booking);
    }

    @Override
    public void remove(Long id) {
        iBookingRepository.deleteById(id);
    }
}
