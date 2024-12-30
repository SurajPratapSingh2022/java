package com.sps.javaVersionUpdate;

@FunctionalInterface
interface work{
	public void info(String n);
}
public class Java8LambdaExpressionExample1 {
	public static void main(String[] args) {
		work obj=(String n)->{
			System.out.println("Hello "+n);
		};
		obj.info("Suraj");
	}
}
