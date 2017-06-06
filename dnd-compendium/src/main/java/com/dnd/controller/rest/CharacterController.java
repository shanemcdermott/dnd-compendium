package com.dnd.controller.rest;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dnd.data.model.PlayerCharacter;
import com.dnd.repository.PlayerCharacterRepository;

@RestController
@RequestMapping("/api")
public class CharacterController {

	@Autowired
	private PlayerCharacterRepository playerCharacterRepository;
	
	// Grab all characters in PLAYER_CHARACTER table.
	@RequestMapping(value = "/characters", method = RequestMethod.GET)
	public ResponseEntity<Collection<PlayerCharacter>> restfulGetAllCharacters() {
		List<PlayerCharacter> playerCharacters = playerCharacterRepository.findAll();
		if (playerCharacters.isEmpty()) {
			return new ResponseEntity<Collection<PlayerCharacter>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>((Collection<PlayerCharacter>) playerCharacters,
				HttpStatus.OK);
	}

	// Grab single character from PLAYER_CHARACTER table via id.
	@RequestMapping(value = "/character/{id}", method = RequestMethod.GET)
	public ResponseEntity<PlayerCharacter> restfulGetIndividualCharacter(@PathVariable Integer id) {
		PlayerCharacter playerCharacter = playerCharacterRepository.findById(id);
		if (playerCharacter == null) {
			return new ResponseEntity<PlayerCharacter>(HttpStatus.NO_CONTENT);
		}
	    return new ResponseEntity<PlayerCharacter>(playerCharacter, HttpStatus.OK);
	}
	
}
