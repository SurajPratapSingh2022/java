package com.sps.javaCollection;

import java.util.LinkedList;
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> Name=new LinkedList<String>();
		//add order wise
		Name.add("Ankit");
		Name.add("Ankush");
		Name.add("altaf");
		System.out.println(Name);
		
		Name.addFirst("Rohit");	//add at first
		Name.addLast("Amir");	//add at last
		System.out.println(Name);
		Name.add(3,"Anish");	//add at particular index
		System.out.println(Name);
		Name.remove();			//remove from beginning
		System.out.println(Name);
		Name.removeFirst();		//remove from beginning
		System.out.println(Name);
		Name.removeLast();		//remove from last
		for(String str:Name) {
			System.out.println(str);
		}
	}
}
