//Demonstrate method overriding - run time polymorphism
package com.cg.dayseven.methodoverriding;

public class RBI {
	public float getRateOfIntrest() {
		return 8.9f;
	}
}

class SBI extends RBI{
	@Override
	public float getRateOfIntrest() {
		return 8.5f;
	}
}

class ICICI extends RBI{
	@Override
	public float getRateOfIntrest() {
		return 9.4f;
	}
}

class HDFC extends RBI{
	@Override
	public float getRateOfIntrest() {
		return 7.3f;
	}
}