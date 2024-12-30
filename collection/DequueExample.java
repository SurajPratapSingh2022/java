package com.sps.javaCollection;

import java.util.ArrayDeque;

public class DequueExample {
	public static void main(String[] args) {
		ArrayDeque<String> Name=new ArrayDeque<String>();//FIFO
		Name.push("Ankit");
		Name.push("Ankush");
		Name.push("Altaf");
		System.out.println(Name);
		Name.pop();
		System.out.println(Name);
	}
}
