package com.poly.model.vo;

import java.util.Objects;

public class Student extends Person{
	
	private int grade;
	private int group;
	private int number;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String address, int grade, int group, int number) {
		super(name, age, address);
		this.grade = grade;
		this.group = group;
		this.number = number;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

//	@Override
//	public boolean equals (Object obj) {
//		if (obj instanceof Student) {
//			Student s = (Student)obj;
//			if (getName().equals(s.getName()) && getAge()==s.getAge() &&
//					getAddress().equals(s.getAddress()) && grade==s.grade &&
//					group==s.group && number==s.number){
//				return true;
//			}
//		}
//		return false;
//	}
	
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if (getName().equals(s.getName()) && getAge()==s.getAge() && group==s.group &&
					number==s.number){
				return true;
			}
		}
		
		return false;
	}
	
	public int hashcode() {
		return Objects.hash(getName(),getAge(),getAddress(),grade,group,number);
	}
	
	public String toString() {
		return getName()+" "+getAge()+" "+getAddress()+" "+grade+" "+group+" "+number;
	}

}
