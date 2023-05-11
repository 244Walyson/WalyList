package com.walyproject.walylist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.walyproject.walylist.dt.GameDTO;
import com.walyproject.walylist.dt.GameMinDto;
import com.walyproject.walylist.entities.Game;
import com.walyproject.walylist.projection.GameMinProjection;
import com.walyproject.walylist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	@Transactional(readOnly = true)
	public List<GameMinDto> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x->new GameMinDto(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x->new GameMinDto(x)).toList();
	}
}
