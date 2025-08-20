package com.intensivao.spring.dslist.controllers;

import com.intensivao.spring.dslist.DTOs.GameDTO;
import com.intensivao.spring.dslist.DTOs.GameMinDTO;
import com.intensivao.spring.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    GameService gs;

    @GetMapping(value = "/{id}")
    public GameDTO findByid(@PathVariable Long id){
        return gs.findById(id);
    }


    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gs.findAll();
        return result;
    }
}
