package com.garciajops.mygamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garciajops.mygamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
