package com.dnd.data.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CharacterClassEmbed {

	@Column(name = "class_id")
	private Integer id;

	@Column(name = "class_name")
	private String name;

	public CharacterClassEmbed() {
		// Blank for Hibernate
	}

	public CharacterClassEmbed(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "CharacterClassEmbed [id=" + id + ", name=" + name + "]";
	}

}
