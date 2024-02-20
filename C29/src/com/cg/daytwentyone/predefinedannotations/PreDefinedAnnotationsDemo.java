package com.cg.daytwentyone.predefinedannotations;

import java.util.ArrayList;
import java.util.List;

public class PreDefinedAnnotationsDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		List al = new ArrayList();//Heterogeneous list(Raw List)
		Student s1 = new Student(23, "Rev", "IT");
		al.add(s1);
		al.add(21);
		al.add("ECE");
		al.add(true);
		
	}

}
