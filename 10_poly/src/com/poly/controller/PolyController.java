package com.poly.controller;

import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Student;
import com.poly.model.vo.Teacher;

public class PolyController {
	
	public void printObject(Person p) {
		if(p instanceof Student) {
			Student s = (Student)p;
			System.out.println(s.getName()+" "+s.getGrade()+" "+s.getGroup());
		} else if (p instanceof Employee) {
			Employee e = (Employee)p;
			System.out.println(e.getName()+" "+e.getPart()+" "+e.getPosition());
		}
	}
	
	//public void printObject()
	public void printStudent(Student s) {
		System.out.println(s.getName()+" "+s.getGrade()+" "+s.getGroup()+" "+s.getNumber());
	}
	
	public void printEmployee(Employee e) {
		System.out.println(e);
	}
	
	public void printTeacher(Teacher t) {
		System.out.println(t.getName()+" "+t.getSubject()+" "+t.getMajor());
	}
	
	public void  printPerson(Person p) {
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddress());
	}

}
