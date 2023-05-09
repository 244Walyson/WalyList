package com.walyproject.walylist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walyproject.walylist.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	
}
