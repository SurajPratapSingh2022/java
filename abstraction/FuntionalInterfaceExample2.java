package com.sps.javaAbstraction;
//functional interface example 2
@FunctionalInterface
interface work1{
	public void info(String n);
}
public class FuntionalInterfaceExample2 {
	public static void main(String[] args) {
		work1 obj=new work1() {
			public void info(String n) {
				System.out.println("Hello "+n);
			}
		};
		obj.info("Shivam");
	}
}
