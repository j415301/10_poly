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
		Person p = new Person("기본",20,"서울시");
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddress());
		
		Student s = new Student("유병승",19,"경기도 기흥시",1,3,3);
		Employee e = new Employee("김상현",29,"서울시 구로구","개발팀","사원",100);
		
		System.out.println(s);
		System.out.println(e);
		
		//다형성: 부모 변수가 자식 객체를 보관하는 것!
		p = s;
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddress());
		//부모 변수 p가 자료형이 다른 s 객체를 보관하여 s객체의 값이 출력됨
		p = e;
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddress());
		Person p1 = new Employee();
		p1 = new Student();
		//P1 = new Scanner();//error: 상속관계까 아니기 때문에 대입할 수 없음
		p1 = new Teacher();
		//s = e;//error: s가 e의 부모가 아니고, e 또한 s의 상속을 받지 않기 때문에 다형성 적용 안됨
        //       따라서 서로 자료형이 다르므로 값을 대입할 수 있음
		
		
		
		//부모 타입의 변수에 자식 객체를 대입했을 때 그 변수는 부모 클래스에서 선언한 내용만 접근 가능
		//p.getPart();//error: 접근 불가
		
		//자식 객체의 내용에 접근하려면 반드시 강제적 형변환을 해야 함
		//(Employee)p.getPart();//error: 연산자의 우선순위가 .가 강제 형변환보다 높기 때문에 안됨
		((Employee)p).getPart();
		System.out.println(((Employee)p).getPart());
		
		
		//Person p: Person, Employee, Student, Teacher가 들어가 있음
		//부모 객체에 자식 객체가 어떤 것인지 확인하고 싶을 때: instanceof 예약어로 확인
		//부모변수명 instanceof 확인클래스명 -> 부모 변수에 있는 값이 확인 클래스니? true/false
		System.out.println(p instanceof Student);//변수 p는 Student니?//false
		System.out.println(p instanceof Teacher);//false
		System.out.println(p instanceof Employee);//true
		System.out.println(p instanceof Person);
		//이 예약어를 이용해 분기 처리 가능
		
		Object obj;//모든 객체의 부모
		obj = new Scanner(System.in);
		obj = new Date();
		obj = "안녕하세요";
		
		System.out.println(s.equals("유병승"));
		//error:ClassCastException
		//instanceof를 활용해 equals 매서드에 분기처리 했더니 에러 사라짐
		
		System.out.println();
		
		PolyController pc = new PolyController();
		pc.printStudent(s);
		pc.printEmployee(e);
		pc.printTeacher(new Teacher("자바","음악"));
		
		System.out.println();
		
		pc.printObject(s);
		pc.printObject(e);
		
		System.out.println();
		
		
		//다형성을 이용하면 데이터 관리를 더더더더더 편하게 할 수 있다.
		Student[] students = new Student[10];
		Employee[] emps = new Employee[10];
		Teacher[] teachers = new Teacher[10];
		
		students[0] = new Student("유병승",19,"경기도 시흥",1,2,3);
		students[1] = new Student("홍서연",27,"서울시",2,3,13);
		emps[0] = new Employee("김예진",26,"서울시","개발팀","개발자",200);
		emps[1] = new Employee("김태희",26,"서울시","영업팀","영업부장",100);
		
		//프로그램에서 관리하고 있는 data를 구하세요
		int count = 0;
		for(int i=0 ; i<students.length ; i++) {
			if (students[i]!=null) count++;//if실행문이 1줄이면 중괄호 없이 이렇게 써도 됨!
		}
		for(int i=0 ; i<emps.length ; i++) {
			if (emps[i]!=null) count++;
		}
		for(int i=0 ; i<teachers.length ; i++) {
			if (teachers[i]!=null) count++;
		}
		System.out.println("관리되고 있는 사람 : "+count);
		
		//다형성을 이용해서 한개 자료형으로 객체 배열에 보관하면 편리하게 관리 가능
		//한개의 자료형만 리턴하는 return 할 때도 편리하게 사용 가능
		Person[] persons = new Person[40];
		persons[0] = new Student("유병승",19,"경기도 시흥",1,2,3);
		persons[1] = new Student("홍서연",27,"서울시",2,3,13);
		persons[2] = new Employee("김예진",26,"서울시","개발팀","개발자",200);
		persons[3] = new Employee("김태희",26,"서울시","영업팀","영업부장",100);
		count = 0;
		for(int i=0 ; i<persons.length ; i++) {
			if(persons[i]!=null) count++;
		}
		System.out.println("관리되고 있는 사람 : "+count);
		
		
		
		//부모자료형 배열에서 자식 객체를 출력해보기
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
		//for.each문: 자동으로 객체의 변수개수만큼 알아서 돈다. persons배열의 객체가 하나씩 p2로 들어가며 돌아감
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
//		}//동적바인딩: 부모객체가 상속받고 있는 자식객체의 메소드를 자동으로 실행해줌->나중에 배움!
	}
}
