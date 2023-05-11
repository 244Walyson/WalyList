package com.walyproject.walylist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walyproject.walylist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	
}
