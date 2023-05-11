package com.walyproject.walylist.dt;

import com.walyproject.walylist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO() {}

	public GameListDTO(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public String getName() {
		return name;
	}


	public Long getId() {
		return id;
	}
	
	
}
