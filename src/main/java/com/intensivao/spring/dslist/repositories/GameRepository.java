package com.intensivao.spring.dslist.repositories;

import com.intensivao.spring.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
