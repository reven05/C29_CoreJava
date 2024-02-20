package com.cg.daytwentyone.userdefinedannotations;

import java.lang.annotation.Annotation;

public class AnnotationDemo {

	public static void main(String[] args) {
		AndroidSeries obj = new AndroidSeries("Nord CE 2", 15);
		System.out.println(obj.model);
		System.out.println(obj.screenSize);
		
		System.out.println("SmartPhone Details");
		@SuppressWarnings("rawtypes")
		Class c = obj.getClass();
		
		@SuppressWarnings("unchecked")
		Annotation an = c.getAnnotation(SmartPhone.class);
		
		//interface
		SmartPhone sp = (SmartPhone) an;
		
		System.out.println(sp.os());
		System.out.println(sp.version());
		
		System.out.println("Smart TV Details");
		@SuppressWarnings("unchecked")
		Annotation an1 = c.getAnnotation(SmartTV.class);
		
		SmartTV st = (SmartTV) an1;
		
		System.out.println(st.os());
		System.out.println(st.height());
		System.out.println(st.width());
		
	}

}
