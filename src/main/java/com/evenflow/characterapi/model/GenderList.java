package com.evenflow.characterapi.model;

public enum GenderList {

	MALE("Male"), FEMALE("Female");

	private String value;

	private GenderList(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}
}
