package com.test.controller;

import com.test.model.vo.Circle;
import com.test.model.vo.Rectangle;
import com.test.model.vo.Shape;

public class Controller {
	
	public static void main(String[] args) {
		Circle[] carr = new Circle[3];
		carr[0] = new Circle(5);
		carr[1] = new Circle(8);
		carr[2] = new Circle(4);
		for(int i=0 ; i<carr.length ; i++) {
			System.out.println(carr[i].draw());
		}
		
		Rectangle[] rarr = new Rectangle[3];
		rarr[0] = new Rectangle(4,6);
		rarr[1] = new Rectangle(7,5);
		rarr[2] = new Rectangle(5,6);
		for(int i=0 ; i<rarr.length ; i++) {
			System.out.println(rarr[i].draw());
		}
		
		System.out.println();
		
		Shape[] sarr = new Shape[6];
		for(int i=0 ; i<sarr.length ; i++) {
			if(i<3) {
				for (int j=0 ; j<3 ; j++) {
					sarr[i] = carr[j];
				}
			} else {
				for (int j=0 ; j<3 ; j++) {
					sarr[i] = rarr[j];
				}
			}
		}
		for (int i=0 ; i<sarr.length ; i++) {
			System.out.println(sarr[i].draw());
		}
	}

}
