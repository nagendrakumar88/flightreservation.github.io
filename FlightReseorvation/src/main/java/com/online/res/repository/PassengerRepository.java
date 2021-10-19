package com.online.res.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.res.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
