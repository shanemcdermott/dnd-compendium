package com.dnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnd.data.model.Spell;
import com.dnd.repository.SpellRepository;

@Service
public class SpellService {

	@Autowired
	private SpellRepository spellRepository;

	public List<Spell> findSpellsByClass(String characterClass) {

		switch (characterClass) {
		case "bard":
			return spellRepository.findByBardTrue();
		case "cleric":
			return spellRepository.findByClericTrue();
		case "druid":
			return spellRepository.findByDruidTrue();
		case "fighter":
			break;	// exit switch; partial table schema issue
		case "monk":
			break;	// exit switch; partial table schema issue
		case "paladin":
			return spellRepository.findByPaladinTrue();
		case "ranger":
			return spellRepository.findByRangerTrue();
		case "sorcerer":
			return spellRepository.findBySorcererTrue();
		case "warlock":
			return spellRepository.findByWarlockTrue();
		case "wizard":
			return spellRepository.findByWizardTrue();
		}
		// Default return if a switch case isn't found
		return spellRepository.findAll();
	}

}
