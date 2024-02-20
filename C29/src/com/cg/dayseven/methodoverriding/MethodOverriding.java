package com.cg.dayseven.methodoverriding;

public class MethodOverriding {
	public static void main(String arg[]) {
		//Reference variable
		RBI rbi; 
		
		SBI sbi;
		//sbi = new RBI();
		//Dynamic Binding
		rbi = new SBI();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi = new IndianBank();
		System.out.println(rbi.getRateOfIntrest());
	}
	
}
