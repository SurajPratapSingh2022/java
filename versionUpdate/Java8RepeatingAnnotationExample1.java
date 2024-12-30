package com.sps.javaVersionUpdate;
//Repeatable example
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@interface Employee1{
	String name();
	int salary();
}
@Employee1(name="Anuj", salary=50000)
public class Java8RepeatingAnnotationExample1 {	
	public static void main(String[] args) {
		Employee1 obj=Java8RepeatingAnnotationExample1.class.getAnnotation(Employee1.class);
		System.out.println(obj.name()+"\t"+obj.salary());
	}
}
