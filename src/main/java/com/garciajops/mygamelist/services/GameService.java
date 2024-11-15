package com.garciajops.mygamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.garciajops.mygamelist.dtos.GameDTO;
import com.garciajops.mygamelist.dtos.GameMinDTO;
import com.garciajops.mygamelist.entities.Game;
import com.garciajops.mygamelist.repositories.GameRepository;

@Service
public class GameService {


    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }
}
