//program to demonstrate method overloading - Compile time polymorphism
package com.cg.dayseven.overloading;

public class MethodOverloading {
	void print() {
		System.out.println("Print method");
	}
	
	public static int add(int a, int b) {
		return a+b;		
	}
	public static int add(int a, int b, int c) {
		return a+b+c;		
	}
	public static float add(float a, float b) {
		return a+b;		
	}
	public static float add(float a, int b) {
		return a+b;		
	}
	public static float add(int a, float b) {
		return a+b;		
	}

}
