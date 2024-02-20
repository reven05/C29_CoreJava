package com.cg.dayeight.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		Square s = new Square();
		s.calArea();
		s.show();
		
		//dynamic binding
		Shape a;
		a = new Square(5.0f);
		a.calArea();
		a.show();
	}

}
