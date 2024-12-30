package com.sps.javaVersionUpdate;
//constructor references example
interface operation1{
	public info message(String s);
}
class info{
	public info(String s) {
		System.out.println("Hello "+s);
	}
}
public class Java8ConstructorReferencesExample1 {
	public static void main(String[] args) {
		operation1 obj=info::new;
		obj.message("Dhananjay");
	}
}
