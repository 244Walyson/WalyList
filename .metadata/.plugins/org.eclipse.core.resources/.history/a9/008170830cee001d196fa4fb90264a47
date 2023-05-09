package com.walyproject.walylist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walyproject.walylist.Game;
import com.walyproject.walylist.dt.GameMinDto;
import com.walyproject.walylist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDto> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x->new GameMinDto(x)).toList();
		return dto;
	}
}
