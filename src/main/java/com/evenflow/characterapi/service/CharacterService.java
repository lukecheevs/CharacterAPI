package com.evenflow.characterapi.service;

import java.util.List;

import com.evenflow.characterapi.model.AbstractCharacter;
import com.evenflow.characterapi.model.PlayableCharacter;

public interface CharacterService {

	List<AbstractCharacter> searchCharactersByName(String name);
	
	AbstractCharacter retrieveCharacter(int id);
	
	void addPlayableCharacter(PlayableCharacter playableCharacter);
	
	void updateWeaponForPlayableCharacter(String weapon, int id);
	
	void deletePlayableCharacter(int id);
	
	void createOrc(String name, boolean boss);
}
