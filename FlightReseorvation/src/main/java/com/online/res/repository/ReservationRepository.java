package com.online.res.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.res.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
