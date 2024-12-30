package com.sps.javaAbstraction;
//Functional interface example 1
@FunctionalInterface
interface work1{
	public void info(String n);
}
class usr implements work1{
	public void info(String s) {
		System.out.println("Hello "+s);
	}
}
public class FunctionalInterfaceExample1 {
	public static void main(String[] args) {
		work1 obj=new usr();
		obj.info("Dhananjay");
	}
}
