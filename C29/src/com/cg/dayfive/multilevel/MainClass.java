package com.cg.dayfive.multilevel;

public class MainClass {

	public static void main(String[] args) {
		//Country c = new Country();
		//State s = new State();
		City c = new City();
		c.setCapital("Delhi");
		c.setCountryName("India");
		c.setStateName("TamilNadu");
		c.setLanguage("Tamil");
		c.setCityName("tirunelveli");
		c.setPinCode(600100);
		
		System.out.println(c);
	}

}
