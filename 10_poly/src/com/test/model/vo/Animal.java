package com.test.model.vo;

public abstract class Animal {//�߻� Ŭ������ �ٲ�
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
	
	
	//�ڽİ�ü���� �����ؼ� ����ϴ� �żҵ� -> �߻�żҵ�� ����
	//why? �� Ŭ������ ��ӹ޴� ��� ������ �� �żҵ带 ���� ����=>�� �żҵ带 ������ �� ����
	public abstract String bark();//�߻�޼ҵ� ����
	//	public String bark() {
//		return "���� �����Ҹ�";
//	}

	

}
