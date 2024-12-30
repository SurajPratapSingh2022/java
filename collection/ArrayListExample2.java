package com.sps.javaCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<String> lst1=new ArrayList<String>();
		lst1.add("Anuj");
		lst1.add("komal");
		for(String n:lst1) {
			System.out.println(n);
		}
		System.out.println("----------------");
		List<String> lst2=new ArrayList<>();
		lst2.add("Dhananjay");
		lst2.add("Devang");
		for(String n:lst2) {
			System.out.println(n);
		}
	}
}
