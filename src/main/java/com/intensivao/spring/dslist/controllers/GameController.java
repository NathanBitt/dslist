package com.intensivao.spring.dslist.controllers;

import com.intensivao.spring.dslist.DTOs.GameMinDTO;
import com.intensivao.spring.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    GameService gs;


    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gs.findAll();
        return result;
    }
}
