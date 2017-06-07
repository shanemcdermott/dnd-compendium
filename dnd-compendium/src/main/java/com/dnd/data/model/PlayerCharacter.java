package com.dnd.data.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "player_character")
public class PlayerCharacter {

	@Id
	@Column(name = "character_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "character_name")
	private String name;

	@Column(name = "character_max_level")
	private Integer maxLevel;

	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "player_character_class", joinColumns = @JoinColumn(name = "player_character_id"))
	@MapKeyJoinColumn(name = "character_class_id")
	@Column(name = "player_character_class_level")
	private Map<CharacterClass, Integer> classLevelMap = new HashMap<>();

	@ManyToOne
	@JoinColumn(name = "character_race")
	private CharacterRace race;

	@Column(name = "character_alignment")
	private String alignment;

	@Column(name = "character_exp_points")
	private Long expPoints;

	public PlayerCharacter() {
		// blank for JPA / Hibernate
	}

	public PlayerCharacter(Integer id, String name, Integer maxLevel, Map<CharacterClass, Integer> classLevelMap,
			CharacterRace race, String alignment, Long expPoints) {
		super();
		this.id = id;
		this.name = name;
		this.maxLevel = maxLevel;
		this.classLevelMap = classLevelMap;
		this.race = race;
		this.alignment = alignment;
		this.expPoints = expPoints;
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

	public Integer getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(Integer maxLevel) {
		this.maxLevel = maxLevel;
	}

	public Map<CharacterClass, Integer> getClassLevelMap() {
		return classLevelMap;
	}

	public void setClassLevelMap(Map<CharacterClass, Integer> classLevelMap) {
		this.classLevelMap = classLevelMap;
	}

	public CharacterRace getRace() {
		return race;
	}

	public void setRace(CharacterRace race) {
		this.race = race;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public Long getExpPoints() {
		return expPoints;
	}

	public void setExpPoints(Long expPoints) {
		this.expPoints = expPoints;
	}

	@Override
	public String toString() {
		return "PlayerCharacter [id=" + id + ", name=" + name + ", maxLevel=" + maxLevel + ", classLevelMap="
				+ classLevelMap + ", race=" + race + ", alignment=" + alignment + ", expPoints=" + expPoints + "]";
	}

}
