package com.sps.javaVersionUpdate;
@FunctionalInterface
interface operation{
	public int calc(int a, int b);
}
class calc{
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
}
public class Java8MethodReferencesExample1 {
	public static void main(String[] args) {
//		operation obj=(a,b)->{
//			return a+b;
//		};
		//static method reference
		operation obj=calc::sub;
		System.out.println(+obj.calc(10,20));
	}
}
