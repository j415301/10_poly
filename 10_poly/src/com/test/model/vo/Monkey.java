package com.test.model.vo;

public class Monkey extends Animal{
	
	public Monkey() {
		// TODO Auto-generated constructor stub
	}
	
	public Monkey(String species, String name, int age, int legs) {
		super(species, name, age, legs);
	}
	
	public String monkeyBark() {
		return "원숭이는 키키킥";
	}
	
	@Override//상속받은 abstract 메소드는 반드시! 무조건! 선언해야 한다
	public String bark() {
		return monkeyBark();
	}


}
