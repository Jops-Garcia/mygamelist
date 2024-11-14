package com.garciajops.mygamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garciajops.mygamelist.dtos.GameMinDTO;
import com.garciajops.mygamelist.repositories.GameRepository;

@Service
public class GameService {


    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }
}
