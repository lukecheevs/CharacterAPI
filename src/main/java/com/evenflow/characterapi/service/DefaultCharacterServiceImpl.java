package com.evenflow.characterapi.service;

import java.util.List;
import java.util.Objects;

import com.evenflow.characterapi.dao.CharacterDAO;
import com.evenflow.characterapi.model.AbstractCharacter;
import com.evenflow.characterapi.model.Orc;
import com.evenflow.characterapi.model.PlayableCharacter;

public class DefaultCharacterServiceImpl implements CharacterService {

	private static final String DEFAULT_ORC_ALLEGIANCE = "The Orc Society";
	private CharacterDAO characterDAO;

	public DefaultCharacterServiceImpl() {
		characterDAO = new CharacterDAO();
	}

	@Override
	public List<AbstractCharacter> searchCharactersByName(String name) {
		if(Objects.isNull(name)) {
			throw new RuntimeException("Name can not be null");
		}
		
		return characterDAO.searchCharacters(name);
	}

	@Override
	public AbstractCharacter retrieveCharacter(int id) {
		return characterDAO.retrieveCharacterById(id);
	}

	@Override
	public void addPlayableCharacter(PlayableCharacter playableCharacter) {
		characterDAO.addCharacter(playableCharacter);
	}

	@Override
	public void updateWeaponForPlayableCharacter(String weapon, int id) {
		characterDAO.updateWeaponForPlayableCharacter(weapon, id);
	}

	@Override
	public void deletePlayableCharacter(int id) {
		characterDAO.deleteCharacter(id);
	}

	@Override
	public void createOrc(String name, boolean boss) {
		Orc orc = new Orc();
		orc.setName(name);
		orc.setBoss(boss);

		if (boss) {
			orc.setHealth(150);
			orc.setWeapon("Halberd");
			orc.setTemper("Angry");
		} else {
			orc.setHealth(25);
			orc.setWeapon("Club");
			orc.setTemper("Scared at sight of danger");
			orc.setAllegiance(DEFAULT_ORC_ALLEGIANCE);
		}

		characterDAO.addCharacter(orc);
	}

}
