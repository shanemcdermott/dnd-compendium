package com.dnd.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spell")
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
	private String school;

	@Column
	private Boolean ritual;

	@Column(name = "cast_time")
	private String castTime;

	@Column
	private String range;

	@Column
	private Boolean verbal;

	@Column
	private Boolean somatic;

	@Column
	private Boolean material;

	@Column
	private String components;

	@Column
	private String duration;

	@Column
	private String description;

	@Column
	private Boolean bard;

	@Column
	private Boolean cleric;

	@Column
	private Boolean druid;

	@Column
	private Boolean paladin;

	@Column
	private Boolean ranger;

	@Column
	private Boolean sorcerer;

	@Column
	private Boolean warlock;

	@Column
	private Boolean wizard;

	public Spell() {
		super();
	}

	public Spell(Integer id, String name, Integer level, String type, Boolean ritual, String castTime, String range,
			Boolean verbal, Boolean somatic, Boolean material, String components, String duration, String description,
			Boolean bard, Boolean cleric, Boolean druid, Boolean paladin, Boolean ranger, Boolean sorcerer,
			Boolean warlock, Boolean wizard) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.school = type;
		this.ritual = ritual;
		this.castTime = castTime;
		this.range = range;
		this.verbal = verbal;
		this.somatic = somatic;
		this.material = material;
		this.components = components;
		this.duration = duration;
		this.description = description;
		this.bard = bard;
		this.cleric = cleric;
		this.druid = druid;
		this.paladin = paladin;
		this.ranger = ranger;
		this.sorcerer = sorcerer;
		this.warlock = warlock;
		this.wizard = wizard;
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

	public String getSchool() {
		return school;
	}

	public void setSchool(String type) {
		this.school = type;
	}

	public Boolean getRitual() {
		return ritual;
	}

	public void setRitual(Boolean ritual) {
		this.ritual = ritual;
	}

	public String getCastTime() {
		return castTime;
	}

	public void setCastTime(String castTime) {
		this.castTime = castTime;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public Boolean getVerbal() {
		return verbal;
	}

	public void setVerbal(Boolean verbal) {
		this.verbal = verbal;
	}

	public Boolean getSomatic() {
		return somatic;
	}

	public void setSomatic(Boolean somatic) {
		this.somatic = somatic;
	}

	public Boolean getMaterial() {
		return material;
	}

	public void setMaterial(Boolean material) {
		this.material = material;
	}

	public String getComponents() {
		return components;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getBard() {
		return bard;
	}

	public void setBard(Boolean bard) {
		this.bard = bard;
	}

	public Boolean getCleric() {
		return cleric;
	}

	public void setCleric(Boolean cleric) {
		this.cleric = cleric;
	}

	public Boolean getDruid() {
		return druid;
	}

	public void setDruid(Boolean druid) {
		this.druid = druid;
	}

	public Boolean getPaladin() {
		return paladin;
	}

	public void setPaladin(Boolean paladin) {
		this.paladin = paladin;
	}

	public Boolean getRanger() {
		return ranger;
	}

	public void setRanger(Boolean ranger) {
		this.ranger = ranger;
	}

	public Boolean getSorcerer() {
		return sorcerer;
	}

	public void setSorcerer(Boolean sorcerer) {
		this.sorcerer = sorcerer;
	}

	public Boolean getWarlock() {
		return warlock;
	}

	public void setWarlock(Boolean warlock) {
		this.warlock = warlock;
	}

	public Boolean getWizard() {
		return wizard;
	}

	public void setWizard(Boolean wizard) {
		this.wizard = wizard;
	}

	@Override
	public String toString() {
		return "Spell [id=" + id + ", name=" + name + ", level=" + level + ", school=" + school + ", ritual=" + ritual
				+ ", castTime=" + castTime + ", range=" + range + ", verbal=" + verbal + ", somatic=" + somatic
				+ ", material=" + material + ", components=" + components + ", duration=" + duration + ", description="
				+ description + ", bard=" + bard + ", cleric=" + cleric + ", druid=" + druid + ", paladin=" + paladin
				+ ", ranger=" + ranger + ", sorcerer=" + sorcerer + ", warlock=" + warlock + ", wizard=" + wizard + "]";
	}

}
