package com.dnd.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class CharacterClass {

	@Id
	@Column(name = "class_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "class_name")
	private String name;

	public CharacterClass() {
		// Blank for Hibernate
	}

	public CharacterClass(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CharacterClass [id=" + id + ", name=" + name + "]";
	}

}
