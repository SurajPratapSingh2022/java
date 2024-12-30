package com.sps.javaVersionUpdate;
@FunctionalInterface
interface operation2{
	public int calc(int a, int b);
}
class calc2{
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
}
public class Java8MethodReferencesExample2 {
	public static void main(String[] args) {
		//non static method references
		calc2 cobj=new calc2();
		operation2 obj=cobj::sub;
		System.out.println(+obj.calc(10,20));
	}
}
