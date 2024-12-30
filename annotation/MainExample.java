package com.sps.javaAnnotation;
//create user-defined annotation
public class MainExample {
	public static void main(String[] args) {
		Student d=new Student();
		Class c = d.getClass();
		System.out.println(c.getName());
		
		MyAnno an=(MyAnno) c.getAnnotation(MyAnno.class);
		System.out.println(an.myValue());
		System.out.println(an.name());
		System.out.println(an.city());
	}
}
