package com.test.model.vo;

public class Monkey extends Animal{
	
	public Monkey() {
		// TODO Auto-generated constructor stub
	}
	
	public Monkey(String species, String name, int age, int legs) {
		super(species, name, age, legs);
	}
	
	public String monkeyBark() {
		return "�����̴� ŰŰű";
	}
	
	@Override//��ӹ��� abstract �޼ҵ�� �ݵ��! ������! �����ؾ� �Ѵ�
	public String bark() {
		return monkeyBark();
	}


}
