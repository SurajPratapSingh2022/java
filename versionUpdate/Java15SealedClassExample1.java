package com.sps.javaVersionUpdate;
//java 15: sealed class example
sealed class Human permits Anuj,Anjali{
	public void info() {
		System.out.println("Human Class");
	}
}
non-sealed class Anuj extends Human{
	public void info() {
		System.out.println("Hi Friends, I am Anuj.");
	}
}
non-sealed class Anjali extends Human{
	public void info() {
		System.out.println("Hi Friends, I am Anjali");
	}
}
public class Java15SealedClassExample1 {
	public static void main(String[] args) {
		Human h1=new Anuj();
		Human h2=new Anjali();
		h1.info();
		h2.info();
	}
}
