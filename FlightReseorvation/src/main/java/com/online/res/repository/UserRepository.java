package com.online.res.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.res.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
