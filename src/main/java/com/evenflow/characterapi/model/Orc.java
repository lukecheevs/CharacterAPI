package com.evenflow.characterapi.model;

public class Orc extends Enemy {

	private String temper;
	private boolean tusks;
	
	public String getTemper() {
		return temper;
	}

	public void setTemper(String temper) {
		this.temper = temper;
	}

	public boolean isTusks() {
		return tusks;
	}

	public void setTusks(boolean tusks) {
		this.tusks = tusks;
	}
	
	public void attack(Character character) {
		character.setHealth(character.getHealth() - 1);
	}
}