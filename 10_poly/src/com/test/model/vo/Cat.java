package com.test.model.vo;

public class Cat extends Animal{
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String species, String name, int age, int legs) {
		super(species, name, age, legs);
	}
	
	public String catBark() {
		return "�߿��̴� �߿˾߿�";
	}
	
	@Override
	public String bark() {
		return catBark();
	}

}
