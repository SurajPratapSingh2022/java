package com.sps.javaCollection;

import java.util.Stack;
public class StackExample {
	public static void main(String[] args) {
		Stack<String> Name=new Stack<>();//LIFO
		Name.push("Ankit");
		Name.push("Ankush");
		Name.push("Altaf");
		System.out.println(Name);
		Name.pop();				
		System.out.println(Name);
	}
}
