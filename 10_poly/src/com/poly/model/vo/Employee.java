package com.poly.model.vo;

import java.util.Objects;

public class Employee extends Person{
	
	private String part;
	private String position;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String part, String position, int salary) {
		super();
		this.part = part;
		this.position = position;
		this.salary = salary;
	}
	
	public Employee(String name, int age, String address, String part, String position,
			int salary) {
		super(name, age, address);
		//this(part, position, salary);
		this.part = part;
		this.position = position;
		this.salary = salary;
	}
	
//	@Override
//	public boolean equals (Object obj) {
//		if (obj instanceof Employee) {
//			Employee e = (Employee)obj;
//			if (getName().equals(e.getName()) && getAge()==e.getAge() &&
//					getAddress().equals(e.getAddress()) && part.equals(e.part) &&
//					position.equals(e.position) && salary==e.salary){
//				return true;
//			}
//		}
//		return false;
//	}
	
	@Override
	public boolean equals (Object obj) {
		Employee e = (Employee)obj;
		if (getName().equals(e.getName()) && getAge()==e.getAge() &&
				getAddress().equals(e.getAddress()) && part.equals(e.part) &&
				position.equals(e.position) && salary==e.salary){
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getName(),getAge(),getAddress(),part,position,salary);
	}
	
	@Override
	public String toString() {
		return getName()+" "+getAge()+" "+getAddress()+" "+part+" "+position+" "+salary;
	}

}
