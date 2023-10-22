package com.carlos.desafiodioapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.desafiodioapi.entities.Score;
import com.carlos.desafiodioapi.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
