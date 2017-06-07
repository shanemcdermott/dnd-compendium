package com.dnd.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "character_race")
public class CharacterRace {

	@Id
	@Column(name = "race_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "race_name")
	private String name;

	@Column(name = "race_phb")
	private Boolean playersHandBook;

	@Column(name = "race_base")
	private String baseRace;

	public CharacterRace() {
		// Blank for Hibernate
	}

	public CharacterRace(Integer id, String name, Boolean playersHandBook, String baseRace) {
		super();
		this.id = id;
		this.name = name;
		this.playersHandBook = playersHandBook;
		this.baseRace = baseRace;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getPlayersHandBook() {
		return playersHandBook;
	}

	public void setPlayersHandBook(Boolean playersHandBook) {
		this.playersHandBook = playersHandBook;
	}

	public String getBaseRace() {
		return baseRace;
	}

	public void setBaseRace(String baseRace) {
		this.baseRace = baseRace;
	}

	@Override
	public String toString() {
		return "CharacterRace [id=" + id + ", name=" + name + ", playersHandBook=" + playersHandBook + ", baseRace="
				+ baseRace + "]";
	}

}
