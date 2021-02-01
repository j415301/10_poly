package com.test.run;

import com.test.model.vo.Animal;
import com.test.model.vo.Cat;
import com.test.model.vo.Dog;
import com.test.model.vo.Monkey;

public class Main {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Cat c = new Cat("고양이과","야옹이",1,4);
		Dog d = new Dog("개과","멍멍이",2,4);
		Monkey m = new Monkey("원숭이과","원숭이",3,2);
		
		a = c;
		c.catBark();
		a = d;
		d.dogBark();
		a = m;
		m.monkeyBark();
		
		System.out.println();
		
		Animal[] arr = new Animal[6];
		arr[0] = new Cat("고양이과","야옹이",1,4);
		arr[1] = new Cat("고양이과","나비",5,4);
		arr[2] = new Dog("개과","멍멍이",2,4);
		arr[3] = new Dog("개과","번개",3,4);
		arr[4] = new Monkey("원숭이과","원숭",3,2);
		arr[5] = new Monkey("원숭이과","몽키",10,2);
		
		for(int i=0 ; i<arr.length ; i++) {
			if (arr[i] instanceof Cat) {
				Cat c1 = (Cat)arr[i];
				System.out.println(c1.getSpecies()+" "+c1.getName()+" "+c1.getAge()+" "+
				c1.getLegs());
				c1.bark();
			} else if (arr[i] instanceof Dog) {
				Dog d1 = (Dog)arr[i];
				System.out.println(d1.getSpecies()+" "+d1.getName()+" "+d1.getAge()+" "+
				d1.getLegs());
				d1.bark();
			} else if (arr[i] instanceof Monkey) {
				Monkey m1 = (Monkey)arr[i];
				System.out.println(m1.getSpecies()+" "+m1.getName()+" "+m1.getAge()+" "+
						m1.getLegs());
				m1.bark();
			}
		}
		
		
		
		
		
		

		//arr[0].catBark();
		//부모타입으로는 자식에 있는 메소드에 접근하지 못함.
		//자식에 접근할려면 자식으로 강제형변환해야 함
		((Cat)arr[0]).catBark();
		((Dog)arr[2]).dogBark();
		((Monkey)arr[4]).monkeyBark();
		System.out.println();
		
		for (Animal aa : arr) {
			if(a instanceof Cat) {
				System.out.println(((Cat)aa).catBark());
			} else if(a instanceof Dog) {
				System.out.println(((Dog)aa).dogBark());
			} //else if(a instanceof Monkey) {
				//System.out.println(((Monkey)aa).monkeyBark());
			//}
		}
		System.out.println();
		
		//동적 바인딩을 이용하면 강제형변환 없이도 쉽게 출력할 수 있음
		for(Animal aa : arr) {
			//null값에 대한 예외처리
			if(aa!=null) {
				//System.out.println(aa.bark());
				System.out.println(aa);
			}
		}
	}
	

}
