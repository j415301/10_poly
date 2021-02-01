package com.test.run;

import com.test.model.vo.Animal;
import com.test.model.vo.Cat;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상클래스 적용하기
		
				//Animal ani = new Animal();//error:추상클래스는 생성이 불가능함
				
				//자료형으로 사용이 가능함-> 자식 객체만 받는 변수 만들 수 있음
				Animal cat = new Cat();
				
				Object[] objs = new Object[10];
				
				
				//추상메소드를 선언하려면 무조건 추상클래스로 선언해야 함
				Animal[] animals = new Animal[10];
				for (Animal a: animals) {
					System.out.println(a.bark());
				}

	}

}
