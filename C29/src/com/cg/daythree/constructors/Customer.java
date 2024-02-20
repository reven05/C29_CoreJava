package com.cg.daythree.constructors;

public class Customer {
	private String name;
	private int id;
	private String city;
	
	//default constructor
	public Customer() {
		System.out.println("Default Constructor");
	}

	//parameterized constructor
	public Customer(int a) {
		System.out.println(a);
	}
	
	public Customer(int a, int b) {
		System.out.println(a+b);
	}
	
	public Customer(String a) {
		System.out.println(a);
	}
	
	public Customer(String a, int b) {
		System.out.println(a+b);
	}
	public Customer(int a, String b) {
		System.out.println(a+b);
	}

	public Customer(String name, int id, String city) {
		super();
		
		this.name = name;
		this.id = id;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
	
}
