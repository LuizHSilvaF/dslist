package com.project.dslist1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dslist1.dto.GameListDTO;
import com.project.dslist1.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameController {

	@Autowired
	private GameListService service;

	@GetMapping
	public ResponseEntity<List<GameListDTO>> findAll(){
		List<GameListDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<GameListDTO> findById(@PathVariable Long id){
		GameListDTO obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
