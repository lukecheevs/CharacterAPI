package com.evenflow.characterapi.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.evenflow.characterapi.model.AbstractCharacter;
import com.evenflow.characterapi.model.GenderList;
import com.evenflow.characterapi.model.PlayableCharacter;

public class CharacterDAO {

	private List<AbstractCharacter> characters = new ArrayList<>();

	public CharacterDAO() {
		createCharacters();

	}

	private void createCharacters() {
		PlayableCharacter playableCharacter = new PlayableCharacter();
		playableCharacter.setName("Alex Canjim");
		playableCharacter.setAge(23);
		playableCharacter.setLevel(1);
		playableCharacter.setWeapon("Fists");
		playableCharacter.setWeight(140);
		playableCharacter.setHeight(69);
		playableCharacter.setGender(GenderList.MALE);

		characters.add(playableCharacter);
	}
}
