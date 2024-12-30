package com.sps.javaVersionUpdate;
//Addition of 2 number from lambda expression
interface task{
	public int add(int a, int b);
}
public class Java8LambdaExpressionExample2 {
	public static void main(String[] args) {
		task obj=(int a, int b)->a+b;
		System.out.println("Sum= "+obj.add(10, 20));
	}
}
