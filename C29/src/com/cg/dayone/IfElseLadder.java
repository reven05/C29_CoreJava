package com.cg.dayone;

public class IfElseLadder {

	public static void main(String[] args) {
		//greatest among 3 numbers
		int a = 3, b = 7, c = 4, d = 8;  
		if ((a>b)&&(a>c)&&(a>d)) {
			System.out.println("A is Greater");
		}
		else if ((b>c)&&(b>d)) {
			System.out.println("B is Greater");
		}
		else if (c>d){
			System.out.println("C is Greater");
		}
		else {
			System.out.println("D is Greater");
		}
		
	}

}
