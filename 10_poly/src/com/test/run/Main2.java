package com.test.run;

import com.test.model.vo.Animal;
import com.test.model.vo.Cat;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�߻�Ŭ���� �����ϱ�
		
				//Animal ani = new Animal();//error:�߻�Ŭ������ ������ �Ұ�����
				
				//�ڷ������� ����� ������-> �ڽ� ��ü�� �޴� ���� ���� �� ����
				Animal cat = new Cat();
				
				Object[] objs = new Object[10];
				
				
				//�߻�޼ҵ带 �����Ϸ��� ������ �߻�Ŭ������ �����ؾ� ��
				Animal[] animals = new Animal[10];
				for (Animal a: animals) {
					System.out.println(a.bark());
				}

	}

}
