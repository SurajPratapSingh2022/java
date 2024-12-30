package com.sps.javaAbstraction;
//Default & Static Method Example
interface work{
	public void calc(int a,int b);
	//default method can't be inforced & but public method can inforced
	default void info() {
		System.out.println("Developer Information");
	}
	public static void copyright() {
		System.out.println("All Right Reserved by Dhananjay Sharma");
	}
}
class amar implements work{
	public void calc(int a,int b) {
		System.out.println("Subtraction: "+(a-b));
	}
}
class anuj implements work{
	public void calc(int a, int b) {
		System.out.println("Multiplication: "+(a*b));
	}
	//default method can be changed as public but its vice versa is false
	public void info() {
		System.out.println("Developed by Anuj");
	}
}
public class DefaultAndStaticInterfaceExample1 {
	public static void main(String[] args) {
		amar amarobj=new amar();
		amarobj.calc(10,20);
		amarobj.info();
		amit amitobj=new amit();
		amitobj.calc(10, 20);
//		amitobj.info();
		anuj anujobj=new anuj();
		anujobj.calc(10, 20);
		anujobj.info();
		work.copyright();
	}
}
