package com.intensivao.spring.dslist.repositories;

import com.intensivao.spring.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE game_list = :listId AND game_id = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);

}
