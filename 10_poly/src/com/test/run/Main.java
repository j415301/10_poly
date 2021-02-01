package com.test.run;

import com.test.model.vo.Animal;
import com.test.model.vo.Cat;
import com.test.model.vo.Dog;
import com.test.model.vo.Monkey;

public class Main {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Cat c = new Cat("����̰�","�߿���",1,4);
		Dog d = new Dog("����","�۸���",2,4);
		Monkey m = new Monkey("�����̰�","������",3,2);
		
		a = c;
		c.catBark();
		a = d;
		d.dogBark();
		a = m;
		m.monkeyBark();
		
		System.out.println();
		
		Animal[] arr = new Animal[6];
		arr[0] = new Cat("����̰�","�߿���",1,4);
		arr[1] = new Cat("����̰�","����",5,4);
		arr[2] = new Dog("����","�۸���",2,4);
		arr[3] = new Dog("����","����",3,4);
		arr[4] = new Monkey("�����̰�","����",3,2);
		arr[5] = new Monkey("�����̰�","��Ű",10,2);
		
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
		//�θ�Ÿ�����δ� �ڽĿ� �ִ� �޼ҵ忡 �������� ����.
		//�ڽĿ� �����ҷ��� �ڽ����� ��������ȯ�ؾ� ��
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
		
		//���� ���ε��� �̿��ϸ� ��������ȯ ���̵� ���� ����� �� ����
		for(Animal aa : arr) {
			//null���� ���� ����ó��
			if(aa!=null) {
				//System.out.println(aa.bark());
				System.out.println(aa);
			}
		}
	}
	

}
