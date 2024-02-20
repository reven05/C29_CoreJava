package com.cg.dayseven.overloading;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		
		Scanner sc = new Scanner(System.in);
		
		String name, city;
		int age;
		System.out.println("Enter person details: Name, Age, City");
		name = sc.nextLine();
		age = sc.nextInt();
		city = sc.nextLine();
		sc.next();
		Person p1 = new Person(name, age, city);
		System.out.println(p1);
		
		System.out.println("Enter person details: Name, Age, City");
		name = sc.nextLine();
		age = sc.nextInt();
		city = sc.nextLine();
		Person p2 = new Person(name, age, city);
		System.out.println(p2);
		
		sc.close();
		
	}

}
