package com.cg.daysix.staticmethod;

public class MyClass {
	private int id;
	private static int a;
	
	//static block
	static {
		System.out.println("------This is Static block--------");
		a = 23;
	}

	//default constructor
	public MyClass() {
		System.out.println("-----Inside Default Constructor-----");
		id++;
		a++;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "a=" +a+"]";
	}
	
	//static method
	static void display(int b) {
		//cannot access not static variable
		//System.out.println("ID: "+id);
		System.out.println("A: "+a);
		System.out.println(b);
		
	}
	
	//instance method
	void print() {
		System.out.println("Printing Method");
	}
	
	
}
