package com.dnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dnd.repository.SpellRepository;
import com.dnd.service.SpellService;

@Controller
public class DemoController {

	@Autowired
	private SpellRepository spellRepository;

	@Autowired
	private SpellService spellService;

	@RequestMapping(value = "/spells", method = RequestMethod.GET)
	public String spellListDemo(Model model) {
		model.addAttribute("spells", spellRepository.findAll());
		return "spellListTemplate";
	}

	@RequestMapping(value = "/spells/level/{level}", method = RequestMethod.GET)
	public String spellListDemoByLevel(Model model, @PathVariable Integer level) {

		if (level < 0 || level > 9) {
			return "redirect:/spells";
		}

		model.addAttribute("spells", spellRepository.findByLevel(level));
		return "spellListTemplate";
	}

	@RequestMapping(value = "spells/school/{school}", method = RequestMethod.GET)
	public String spellListDemoByType(Model model, @PathVariable String school) {
		model.addAttribute("spells", spellRepository.findBySchool(school));
		return "spellListTemplate";
	}

	@RequestMapping(value = "spells/class/{characterClass}", method = RequestMethod.GET)
	public String spellListByClass(Model model, @PathVariable String characterClass) {

		model.addAttribute("spells", spellService.findSpellsByClass(characterClass));

		return "spellListTemplate";
	}

}
