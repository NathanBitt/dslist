package com.intensivao.spring.dslist.controllers;

import com.intensivao.spring.dslist.DTOs.GameListDTO;
import com.intensivao.spring.dslist.DTOs.GameMinDTO;
import com.intensivao.spring.dslist.DTOs.ReplacementDTO;
import com.intensivao.spring.dslist.entities.Game;
import com.intensivao.spring.dslist.services.GameListService;
import com.intensivao.spring.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/game_list")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{id}/games")
    public List<GameMinDTO> findByList(@PathVariable Long id) {
        List<GameMinDTO> result = gameService.findByList(id);
        return result;
    }

    @PostMapping(value = "/{id}/replacement")
    public void move(@PathVariable Long id, @RequestBody ReplacementDTO body) {
        gameListService.move(id, body.getSourceIndex(), body.getDestinationIndex());
    }
}