package com.dnd.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player_character")
public class PlayerCharacter {

	private Integer id;
	private String name;
	private Integer maxLevel;
	private String charClass;
	private String race;
	private String alignment;
	private Long expPoints;

	public PlayerCharacter() {
		// blank for JPA / Hibernate
	}

	public PlayerCharacter(Integer id, String name, Integer maxLevel, String charClass, String race, String alignment,
			Long expPoints) {
		super();
		this.id = id;
		this.name = name;
		this.maxLevel = maxLevel;
		this.charClass = charClass;
		this.race = race;
		this.alignment = alignment;
		this.expPoints = expPoints;
	}

	@Id
	@Column(name = "character_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "character_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "character_max_level")
	public Integer getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(Integer maxLevel) {
		this.maxLevel = maxLevel;
	}

	@Column(name = "character_class")
	public String getCharClass() {
		return charClass;
	}

	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}

	@Column(name = "character_race")
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Column(name = "character_alignment")
	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	@Column(name = "character_exp_points")
	public Long getExpPoints() {
		return expPoints;
	}

	public void setExpPoints(Long expPoints) {
		this.expPoints = expPoints;
	}

}
