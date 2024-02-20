package com.cg.daysix.staticvariables;

public class Student {
	//declare instance variable
	private String name;
	private int id;
	//private String college;
	
	//static variable
	static String college = "ECE";
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		//this.college = college;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ","
				+ " college=" + college + "]";
	}
	
	

}
