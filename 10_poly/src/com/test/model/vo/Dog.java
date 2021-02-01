package com.test.model.vo;

public class Dog extends Animal{
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String species, String name, int age, int legs) {
		super(species, name, age, legs);
	}
	
	public String dogBark() {
		return "°­¾ÆÁö´Â ¿Ð¿Ð¿Ð";
	}
	
	@Override
	public String bark() {
		return dogBark();
	}

	@Override
	public String toString() {
		return "Dog [getSpecies()=" + getSpecies() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getLegs()=" + getLegs() + "]";
	}

	

}
