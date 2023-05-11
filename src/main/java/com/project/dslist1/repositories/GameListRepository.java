package com.project.dslist1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.dslist1.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
