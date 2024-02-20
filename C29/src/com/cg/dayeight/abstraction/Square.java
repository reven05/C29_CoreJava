package com.cg.dayeight.abstraction;

public class Square extends Shape {

	float side;
	public Square() {
		side = 2.6f;
	}
	public Square(float side) {
		this.side = side;
	}
	@Override
	void calArea() {
		System.out.println("Abstact method");
		super.area = side*side;
	}

}
