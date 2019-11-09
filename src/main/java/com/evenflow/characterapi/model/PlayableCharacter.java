package com.evenflow.characterapi.model;

public class PlayableCharacter extends AbstractCharacter {

	private int level;
	private String weapon;
	private String armor;

	public PlayableCharacter() {
		super();
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getArmor() {
		return armor;
	}

	public void setArmor(String armor) {
		this.armor = armor;
	}

	public void attack(AbstractCharacter character) {
		if (Enemy.class.isInstance(character)) {
			character.setHealth(character.getHealth() - 1);
		}
	}
}
