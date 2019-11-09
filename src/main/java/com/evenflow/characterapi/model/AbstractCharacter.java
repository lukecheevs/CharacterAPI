package com.evenflow.characterapi.model;

import java.util.Random;

public class AbstractCharacter {

	private static final Random RANDOM = new Random();

	private int id;
	private String name;
	private GenderList gender;
	private int age;
	private int height;
	private int weight;
	private int health;

	public AbstractCharacter() {
		id = RANDOM.nextInt();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GenderList getGender() {
		return gender;
	}

	public void setGender(GenderList gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
