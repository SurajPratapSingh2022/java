package com.sps.javaVersionUpdate;
//java 8: anonymous inner class
abstract class work2{
	abstract public void calc(int a, int b);
}
public class Java8AnonymousInnerClassExample1 {
	public static void main(String[] args) {
		work2 obj=new work2() {
			public void calc(int a, int b) {
				System.out.println("Sum= "+(a+b));
			}
		};
		obj.calc(10,10);
	}
}
