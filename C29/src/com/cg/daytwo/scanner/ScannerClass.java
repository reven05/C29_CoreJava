package com.cg.daytwo.scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of A: ");
		a = sc.nextInt();
		System.out.println("Enter value of B: ");
		b = sc.nextInt();
		
		c = a + b;
		System.out.println("Added Value is : "+c);
		sc.close();
	}

}
