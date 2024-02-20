package com.cg.dayseven.overloading;

public class Demo {

	public static void main(String[] args) {
		
		Point p = new Point();
		System.out.println(p);
		
		p = new Point(5.5f);
		System.out.println(p);
		
		p = new Point(3.5f, 2.7f);
		System.out.println(p);
		
		System.out.println("-------Method Overloading-------");
		System.out.println(MethodOverloading.add(3, 5));
		System.out.println(MethodOverloading.add(3, 5, 7));
		System.out.println(MethodOverloading.add(3.5f, 5.8f));
		System.out.println(MethodOverloading.add(3, 5.6f));
		System.out.println(MethodOverloading.add(3.1f, 5));
		
	}

}
