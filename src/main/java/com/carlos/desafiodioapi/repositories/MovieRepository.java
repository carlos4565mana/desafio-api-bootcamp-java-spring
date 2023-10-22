package com.carlos.desafiodioapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.desafiodioapi.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
