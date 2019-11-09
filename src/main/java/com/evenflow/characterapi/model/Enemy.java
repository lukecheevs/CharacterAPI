package com.evenflow.characterapi.model;

public abstract class Enemy extends Character {

	private String allegiance; 
	private boolean boss;
	private String weapon;
	
	public String getAllegiance() {
		return allegiance;
	}
	public void setAllegiance(String allegiance) {
		this.allegiance = allegiance;
	}
	public boolean isBoss() {
		return boss;
	}
	public void setBoss(boolean boss) {
		this.boss = boss;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
}
