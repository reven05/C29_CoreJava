package com.cg.daythree.encapsulation;

public class StudentDemo2 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Reventh");
		s.setRollno(1234);
		s.setAge(25);
		System.out.println(s);
		System.out.println(s.getName());
		Student s1 = new Student();
		s1.setName("Jana");
		s1.setRollno(4321);
		s1.setAge(53);
		System.out.println(s1);
		System.out.println(s.getName());
	}

}
