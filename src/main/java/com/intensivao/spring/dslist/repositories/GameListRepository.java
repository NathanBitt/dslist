package com.intensivao.spring.dslist.repositories;

import com.intensivao.spring.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
