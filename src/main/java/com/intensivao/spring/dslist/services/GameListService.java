package com.intensivao.spring.dslist.services;

import com.intensivao.spring.dslist.DTOs.GameListDTO;
import com.intensivao.spring.dslist.entities.GameList;
import com.intensivao.spring.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dtos = result
                .stream()
                .map(GameListDTO::new)
                .toList();
        return dtos;
    }

}
