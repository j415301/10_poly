package com.test.model.vo;

public class Circle extends Shape{
	
	private int radius;
	public double pi = Math.PI;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public String draw() {
		double area = radius*radius*pi;
		double line = radius*2*pi;
		return "반지름은 "+radius+"이고 넓이는 "+area+" 둘레는 "+line;
	}
	
	
	
	
	

}
