package com.carlos.desafiodioapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.desafiodioapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
