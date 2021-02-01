package com.test.model.vo;

public abstract class Animal {//추상 클래스로 바뀜
//public class Animal {
	
	private String species;
	private String name;
	private int age;
	private int legs;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String species, String name, int age, int legs) {
		super();
		this.species = species;
		this.name = name;
		this.age = age;
		this.legs = legs;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
	
	
	
	
	
	
	
	
	//alt+s+s+s+enter+enter
		@Override
		public String toString() {
			return "Animal [species=" + species + ", name=" + name + ", age=" + age + ", legs=" + legs + "]";
		}
	
	
	//자식객체에서 구현해서 써야하는 매소드 -> 추상매소드로 만듦
	//why? 이 클래스를 상속받는 즉시 무조건 이 매소드를 쓰기 때문=>이 매소드를 강제할 수 있음
	public abstract String bark();//추상메소드 선언
	//	public String bark() {
//		return "동물 울음소리";
//	}

	

}
