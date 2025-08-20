package com.intensivao.spring.dslist.services;

import com.intensivao.spring.dslist.DTOs.GameDTO;
import com.intensivao.spring.dslist.DTOs.GameMinDTO;
import com.intensivao.spring.dslist.entities.Game;
import com.intensivao.spring.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dtos = result.stream().map(g -> new GameMinDTO(g)).toList();
        return dtos;
    }

}
