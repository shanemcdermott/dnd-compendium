package com.dnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dnd.repository.SpellRepository;

@Controller
public class DemoController {

	@Autowired
	private SpellRepository spellRepository;

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

	@RequestMapping(value = "spells/type/{type}", method = RequestMethod.GET)
	public String spellListDemoByType(Model model, @PathVariable String type) {
		model.addAttribute("spells", spellRepository.findByType(type));
		return "spellListTemplate";
	}

}
