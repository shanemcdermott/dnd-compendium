package com.dnd.controller.rest;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dnd.data.model.Spell;
import com.dnd.repository.SpellRepository;

@RestController
@RequestMapping("/api")
public class SpellController {

	@Autowired
	private SpellRepository spellRepository;
	
	@RequestMapping(value = "/spells", method = RequestMethod.GET)
	public ResponseEntity<Collection<Spell>> restfulGetAllSpells() {
		List<Spell> spells = spellRepository.findAll();
		if (spells.isEmpty()) {
			return new ResponseEntity<Collection<Spell>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>((Collection<Spell>) spells, HttpStatus.OK);
	}
	
}
