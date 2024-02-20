package com.cg.dayfifteen.userdefined;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Student> sl = new ArrayList<Student>();
		Student s = new Student("Rev", 23, 67);
		System.out.println(sl);
		
		sl.add(s);
		System.out.println(sl);
		
		s = new Student("Raj", 12, 59);
		sl.add(s);
		
		s = new Student("Arun", 1, 55);
		sl.add(s);
		
		s = new Student("Priya", 8, 57);
		sl.add(s);
		
		s = new Student("Kumar", 2, 77);
		sl.add(s);
		
		s = new Student("Devi", 22, 47);
		sl.add(s);
		
		System.out.println(sl);
		
		//Collections.sort(sl);			CTE
		
	}

}
