//program to demonstrate Constructor overloading - Compile time polymorphism
package com.cg.dayseven.overloading;

public class Point {
	private float x;
	private float y;
	
	//default constructor
	public Point() {
		System.out.println("Default constructor");
		x = 0.0f;
		y = 0.0f;
	}
	
	public Point(float x) {
		this.x = x;
		this.y = x;
	}
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

}
