package com.cg.daysix.usingfinal;

class ParentClass {
	void show() {
		System.out.println("Parent Class");
	}
}

//cannot extends final class
class ChildClass extends ParentClass{
	void print() {
		System.out.println("Child Class");
	}	
}
public class FinalClass{
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		//c.show();
		c.print();
	}
}
