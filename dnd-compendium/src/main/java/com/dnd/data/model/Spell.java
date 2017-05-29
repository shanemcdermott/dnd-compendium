package com.dnd.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spell_list")
public class Spell {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String name;

	@Column
	private Integer level;

	@Column
	private String type;

	@Column
	private Boolean ritual;

	@Column
	private String description;

	public Spell() {
		super();
	}

	public Spell(Integer id, String name, Integer level, String type, Boolean ritual, String description) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.type = type;
		this.ritual = ritual;
		this.description = description;
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

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getRitual() {
		return ritual;
	}

	public void setRitual(Boolean ritual) {
		this.ritual = ritual;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Spell [id=" + id + ", name=" + name + ", level=" + level + ", type=" + type + ", ritual=" + ritual
				+ ", description=" + description + "]";
	}

}
