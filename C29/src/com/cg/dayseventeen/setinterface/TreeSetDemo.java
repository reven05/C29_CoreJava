package com.cg.dayseventeen.setinterface;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//String TreeSet
		TreeSet<String> courses = new TreeSet<String>();
		courses.add("Core Java");
		courses.add("Python");
		courses.add("Spring");
		courses.add("SpringBoot");
		courses.add("React");
		courses.add("JavaScript");
		courses.add("Core Java");//Cannot add Duplicate values
		//courses.add(null);//RTE cannot add Null values
		
		System.out.println(courses);
	}

}
