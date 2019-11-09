package com.evenflow.characterapi;

import java.util.List;

import com.evenflow.characterapi.model.AbstractCharacter;
import com.evenflow.characterapi.model.GenderList;
import com.evenflow.characterapi.model.PlayableCharacter;
import com.evenflow.characterapi.service.CharacterService;
import com.evenflow.characterapi.service.DefaultCharacterServiceImpl;

public class Main {

	public static void main(String[] args) {
		CharacterService characterService = new DefaultCharacterServiceImpl();
		
		PlayableCharacter playableCharacter = new PlayableCharacter();
		playableCharacter.setName("Jasmine Tun");
		playableCharacter.setGender(GenderList.MALE);
		
		characterService.addPlayableCharacter(playableCharacter);
		
		List<AbstractCharacter> characters = characterService.searchCharactersByName("Jasmine");
		
		System.out.println(characters.size());
	}
}
