package com.poly.run;

import java.util.Date;
import java.util.Scanner;

import com.poly.controller.PolyController;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Student;
import com.poly.model.vo.Teacher;

public class Main {
	
	public static void main(String[] args) {
		Person p = new Person("�⺻",20,"�����");
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddress());
		
		Student s = new Student("������",19,"��⵵ �����",1,3,3);
		Employee e = new Employee("�����",29,"����� ���α�","������","���",100);
		
		System.out.println(s);
		System.out.println(e);
		
		//������: �θ� ������ �ڽ� ��ü�� �����ϴ� ��!
		p = s;
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddress());
		//�θ� ���� p�� �ڷ����� �ٸ� s ��ü�� �����Ͽ� s��ü�� ���� ��µ�
		p = e;
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddress());
		Person p1 = new Employee();
		p1 = new Student();
		//P1 = new Scanner();//error: ��Ӱ���� �ƴϱ� ������ ������ �� ����
		p1 = new Teacher();
		//s = e;//error: s�� e�� �θ� �ƴϰ�, e ���� s�� ����� ���� �ʱ� ������ ������ ���� �ȵ�
        //       ���� ���� �ڷ����� �ٸ��Ƿ� ���� ������ �� ����
		
		
		
		//�θ� Ÿ���� ������ �ڽ� ��ü�� �������� �� �� ������ �θ� Ŭ�������� ������ ���븸 ���� ����
		//p.getPart();//error: ���� �Ұ�
		
		//�ڽ� ��ü�� ���뿡 �����Ϸ��� �ݵ�� ������ ����ȯ�� �ؾ� ��
		//(Employee)p.getPart();//error: �������� �켱������ .�� ���� ����ȯ���� ���� ������ �ȵ�
		((Employee)p).getPart();
		System.out.println(((Employee)p).getPart());
		
		
		//Person p: Person, Employee, Student, Teacher�� �� ����
		//�θ� ��ü�� �ڽ� ��ü�� � ������ Ȯ���ϰ� ���� ��: instanceof ������ Ȯ��
		//�θ𺯼��� instanceof Ȯ��Ŭ������ -> �θ� ������ �ִ� ���� Ȯ�� Ŭ������? true/false
		System.out.println(p instanceof Student);//���� p�� Student��?//false
		System.out.println(p instanceof Teacher);//false
		System.out.println(p instanceof Employee);//true
		System.out.println(p instanceof Person);
		//�� ���� �̿��� �б� ó�� ����
		
		Object obj;//��� ��ü�� �θ�
		obj = new Scanner(System.in);
		obj = new Date();
		obj = "�ȳ��ϼ���";
		
		System.out.println(s.equals("������"));
		//error:ClassCastException
		//instanceof�� Ȱ���� equals �ż��忡 �б�ó�� �ߴ��� ���� �����
		
		System.out.println();
		
		PolyController pc = new PolyController();
		pc.printStudent(s);
		pc.printEmployee(e);
		pc.printTeacher(new Teacher("�ڹ�","����"));
		
		System.out.println();
		
		pc.printObject(s);
		pc.printObject(e);
		
		System.out.println();
		
		
		//�������� �̿��ϸ� ������ ������ ���������� ���ϰ� �� �� �ִ�.
		Student[] students = new Student[10];
		Employee[] emps = new Employee[10];
		Teacher[] teachers = new Teacher[10];
		
		students[0] = new Student("������",19,"��⵵ ����",1,2,3);
		students[1] = new Student("ȫ����",27,"�����",2,3,13);
		emps[0] = new Employee("�迹��",26,"�����","������","������",200);
		emps[1] = new Employee("������",26,"�����","������","��������",100);
		
		//���α׷����� �����ϰ� �ִ� data�� ���ϼ���
		int count = 0;
		for(int i=0 ; i<students.length ; i++) {
			if (students[i]!=null) count++;//if���๮�� 1���̸� �߰�ȣ ���� �̷��� �ᵵ ��!
		}
		for(int i=0 ; i<emps.length ; i++) {
			if (emps[i]!=null) count++;
		}
		for(int i=0 ; i<teachers.length ; i++) {
			if (teachers[i]!=null) count++;
		}
		System.out.println("�����ǰ� �ִ� ��� : "+count);
		
		//�������� �̿��ؼ� �Ѱ� �ڷ������� ��ü �迭�� �����ϸ� ���ϰ� ���� ����
		//�Ѱ��� �ڷ����� �����ϴ� return �� ���� ���ϰ� ��� ����
		Person[] persons = new Person[40];
		persons[0] = new Student("������",19,"��⵵ ����",1,2,3);
		persons[1] = new Student("ȫ����",27,"�����",2,3,13);
		persons[2] = new Employee("�迹��",26,"�����","������","������",200);
		persons[3] = new Employee("������",26,"�����","������","��������",100);
		count = 0;
		for(int i=0 ; i<persons.length ; i++) {
			if(persons[i]!=null) count++;
		}
		System.out.println("�����ǰ� �ִ� ��� : "+count);
		
		
		
		//�θ��ڷ��� �迭���� �ڽ� ��ü�� ����غ���
		for(int i=0 ; i<persons.length ; i++) {
			if(persons[i] instanceof Student) {
				Student s1 = (Student)persons[i];
				System.out.println(s1.getName()+" "+s1.getGrade());
			} else if (persons[i] instanceof Employee) {
				Employee e1 = (Employee)persons[i];
				System.out.println(e1.getName()+" "+e1.getPart());
			} else if (persons[i] instanceof Teacher) {
				Teacher t1 = (Teacher)persons[i];
				System.out.println(t1.getName()+" "+t1.getSubject());
			}
		}
		//for.each��: �ڵ����� ��ü�� ����������ŭ �˾Ƽ� ����. persons�迭�� ��ü�� �ϳ��� p2�� ���� ���ư�
		for(Person p2 : persons) {
			System.out.println(p2);
			if(p2 instanceof Student) {
				Student s1 = (Student)p2;
				System.out.println(s1.getName()+" "+s1.getGrade());
			} else if (p2 instanceof Employee) {
				Employee e1 = (Employee)p2;
				System.out.println(e1.getName()+" "+e1.getPart());
			} else if (p2 instanceof Teacher) {
				Teacher t1 = (Teacher)p2;
				System.out.println(t1.getName()+" "+t1.getSubject());
			}
		}
		
		
		
		
//		for(int i=0 ; i<persons.length ; i++) {
//			System.out.println(persons[i]);
//		}//�������ε�: �θ�ü�� ��ӹް� �ִ� �ڽİ�ü�� �޼ҵ带 �ڵ����� ��������->���߿� ���!
	}
}
