package com.cg.daythree.constructors;

public class CunstructorDemo {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		c = new Customer(1);
		c = new Customer(5, 6);
		c = new Customer("Hi Hello");
		c = new Customer("Rev", 123);
		c = new Customer(145, "Welcome");
		//c = new Customer(12, 4, 6);
	}

}
