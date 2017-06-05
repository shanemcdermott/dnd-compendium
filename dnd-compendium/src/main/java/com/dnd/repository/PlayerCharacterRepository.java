package com.dnd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dnd.data.model.PlayerCharacter;

public interface PlayerCharacterRepository extends CrudRepository<PlayerCharacter, Long> {

	public List<PlayerCharacter> findAll();
	public List<PlayerCharacter> findByName(String name);
	
}
