package com.sps.javaVersionUpdate;
//java 15: code block example
public class Java15TextBlockExample2 {
	public static void main(String[] args) {
		String s="""
				Hello %s your salary is %d
				""".formatted("Dhananjay",90000);
		System.out.println(s);
	}
}
