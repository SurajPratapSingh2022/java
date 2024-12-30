package com.sps;

import java.util.ArrayList;

public class GetSetArrayList {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		//accessing the elements
		System.out.println("Returning Element: "+al.get(1));
		//changing the elements
		al.set(1, "Dates");
		//traversing the list
		for(String fruit:al) {
			System.out.println(fruit);
		}
	}
}
