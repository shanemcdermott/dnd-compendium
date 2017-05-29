package com.dnd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dnd.data.model.Spell;

public interface SpellRepository extends CrudRepository<Spell, Integer> {

	// SELECT * FROM __DATABASE__;
	List<Spell> findAll();

	List<Spell> findByName(String name);

	List<Spell> findByLevel(Integer level);

	List<Spell> findByType(String type);

}
