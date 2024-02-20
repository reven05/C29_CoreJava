package com.cg.dayfive.single;

public class SingleInheritance {

	public static void main(String[] args) {
		/*Citizen c = new Citizen();
		//passing values using constructor
		c = new Citizen("Rev", "Chennai", 987654);
		//passing values using setter
		c.setAddress("Tirunelveli");
		
		//System.out.println(c.toString());
		System.out.println("Name: "+c.getName());
		System.out.println("Address: "+c.getAddress());
		System.out.println("Phone: "+c.getPhone());
		
		*/
		
		Student s = new Student();
		s = new Student(23, "ECE", "Rev", "Tiruneveli", 987654);
		
		System.out.println(s);
		
		
	}

}
