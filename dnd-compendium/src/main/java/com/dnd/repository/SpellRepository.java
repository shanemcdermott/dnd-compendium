package com.dnd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dnd.data.model.Spell;

public interface SpellRepository extends CrudRepository<Spell, Long> {

	//Spell findById(Integer id);
	
	//Spell findByName(String name);

	// SELECT * FROM __DATABASE__;
	List<Spell> findAll();

	List<Spell> findByLevel(Integer level);

	List<Spell> findBySchool(String school);
	
//	List<Spell> findByRitual();
//
//	List<Spell> findByBardTrue();
//
//	List<Spell> findByClericTrue();
//
//	List<Spell> findByDruidTrue();
//
//	List<Spell> findByPaladinTrue();
//
//	List<Spell> findByRangerTrue();
//
//	List<Spell> findBySorcererTrue();
//
//	List<Spell> findByWarlockTrue();
//
//	List<Spell> findByWizardTrue();
	
}
