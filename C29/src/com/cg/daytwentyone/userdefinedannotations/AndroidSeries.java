//to demonstrate a class to use user defined annotations
package com.cg.daytwentyone.userdefinedannotations;

@SmartPhone()
@SmartTV(os="Android", height=21, width=30)
public class AndroidSeries {
	String model;
	int screenSize;
	
	public AndroidSeries(String model, int screenSize) {
		super();
		this.model = model;
		this.screenSize = screenSize;
	}

}
