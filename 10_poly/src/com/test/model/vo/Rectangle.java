package com.test.model.vo;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String draw() {
		return "가로 "+width+" 세로 "+height+" 넓이 "+width*height/2;
	}

}
