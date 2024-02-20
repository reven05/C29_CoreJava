//super class or parent class
package com.cg.dayfive.single;

public class Citizen {
	private String name;
	private String address;
	private int phone;
	public Citizen() {
		System.out.println("Object created for parent class");
		// TODO Auto-generated constructor stub
	}
	public Citizen(String name, String address, int phone) {
		
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	

}
