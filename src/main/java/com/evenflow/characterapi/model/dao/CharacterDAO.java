package com.evenflow.characterapi.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.evenflow.characterapi.model.AbstractCharacter;
import com.evenflow.characterapi.model.GenderList;
import com.evenflow.characterapi.model.Orc;
import com.evenflow.characterapi.model.PlayableCharacter;

public class CharacterDAO {

	private List<AbstractCharacter> characters = new ArrayList<>();

	public CharacterDAO() {
		createCharacters();
	}

	public AbstractCharacter retrieveCharacterById(int id) {
		// @formatter:off
		return characters.stream()
					.filter(character -> id == character.getId())
					.findFirst()
					.orElseThrow(() -> new RuntimeException("Character not found"));
		// @formatter:on
	}
	
	public void addCharacter(AbstractCharacter character) {
		characters.add(character);
	}

	private void createCharacters() {
		PlayableCharacter playableCharacter = new PlayableCharacter();
		playableCharacter.setName("Alex Canjim");
		playableCharacter.setAge(23);
		playableCharacter.setLevel(1);
		playableCharacter.setHealth(100);
		playableCharacter.setWeapon("Fists");
		playableCharacter.setWeight(140);
		playableCharacter.setHeight(69);
		playableCharacter.setGender(GenderList.MALE);
		characters.add(playableCharacter);

		Orc orc1 = new Orc();
		orc1.setName("Jacob Sterlingson");
		orc1.setAge(28);
		orc1.setHealth(10);
		orc1.setTusks(true);
		orc1.setWeight(120);
		orc1.setHeight(60);
		orc1.setWeapon("Hand Axe");
		orc1.setGender(GenderList.MALE);
		characters.add(orc1);

		PlayableCharacter playableCharacter2 = new PlayableCharacter();
		playableCharacter2.setName("Jasmine");
		playableCharacter2.setAge(34);
		playableCharacter2.setLevel(98);
		playableCharacter2.setWeapon("Sword");
		playableCharacter2.setWeight(120);
		playableCharacter2.setHeight(63);
		playableCharacter2.setGender(GenderList.FEMALE);
		characters.add(playableCharacter2);

		Orc orc2 = new Orc();
		orc2.setName("Carneluius St Gingamal");
		orc2.setBoss(true);
		orc2.setAge(100);
		orc2.setHealth(200);
		orc2.setWeapon("Battering Ram");
		orc2.setWeight(250);
		orc2.setHeight(72);
		orc2.setGender(GenderList.MALE);
		characters.add(orc2);
	}
}
