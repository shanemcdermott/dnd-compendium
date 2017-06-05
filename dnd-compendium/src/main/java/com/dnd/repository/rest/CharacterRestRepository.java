package com.dnd.repository.rest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dnd.data.model.PlayerCharacter;

@RepositoryRestResource(collectionResourceRel = "characters", path = "characters")
public interface CharacterRestRepository extends PagingAndSortingRepository<PlayerCharacter, Long> {
	
	List<PlayerCharacter> findByName(@Param("name") String name);
	
}
