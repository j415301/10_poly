package com.test.model.vo;

public class Bird extends Animal{
	
	public Bird(String species, String name, int age, int legs) {
		super(species, name, age, legs);
	}
	
	
	public String birdBark() {
		return "���� ±±";
	}
	
	@Override
	public String bark() {
		return "";
	}

}
