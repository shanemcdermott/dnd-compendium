package com.dnd.controller.rest;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dnd.data.model.PlayerCharacter;
import com.dnd.repository.PlayerCharacterRepository;

@RestController
@RequestMapping("/api")
public class CharacterController {

	@Autowired
	private PlayerCharacterRepository pcRepo;
	
	// what are we doing Erik?
	// TODO: Oh Goodness, do I need this?
	@RequestMapping(value = "/characters", method = RequestMethod.GET)
	public ResponseEntity<Collection<PlayerCharacter>> restfulGetAllCharacters() {
		List<PlayerCharacter> playerCharacters = pcRepo.findAll();
		if (playerCharacters.isEmpty()) {
			return new ResponseEntity<Collection<PlayerCharacter>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>((Collection<PlayerCharacter>) playerCharacters,
				HttpStatus.OK);
	}

}
