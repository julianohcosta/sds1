package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.enums.Platform;

public class GameDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private Platform platform;
	
	
	public GameDTO() {}

	public GameDTO(Game game) {
		id = game.getId();
		title = game.getTitle();
		platform = game.getPlatform();
	}

	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public Platform getPlatform() {
		return platform;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	
	
}
