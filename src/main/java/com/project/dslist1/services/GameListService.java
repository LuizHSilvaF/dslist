package com.project.dslist1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dslist1.dto.GameListDTO;
import com.project.dslist1.entities.GameList;
import com.project.dslist1.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository repo;
	
	public List<GameListDTO> findAll(){
		List<GameList> result = repo.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
}
