package com.project.dslist1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dslist1.dto.GameDTO;
import com.project.dslist1.entities.Game;
import com.project.dslist1.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repo;
	
	public List<GameDTO> findAll(){
		List<Game> result = repo.findAll();
		List<GameDTO> dto = result.stream().map(x -> new GameDTO(x)).toList();
		return dto;
	}
	
	public GameDTO findById(Long id) {
		Optional<Game> obj = repo.findById(id);
		GameDTO objdto = obj.map(x-> new GameDTO(x)).get();
		return objdto;
	}
}
