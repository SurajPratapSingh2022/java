package com.sps.javaCollection;

import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>(); // Corrected variable name
        nameList.add("Ankit");
        nameList.add("Ankkush");
        nameList.add("Altaf");
        System.out.println(nameList);
        //for add
        nameList.add("Anish");
        System.out.println(nameList);
        nameList.add(1, "Rohit");  // Adding element at index 1
        System.out.println(nameList);
        nameList.add(0, "Suraj");  // Adding element at index 0
        System.out.println(nameList);
        //for remove
        nameList.remove(3);
        System.out.println(nameList);
        //for replace
        nameList.set(0, "Ramesh");
        System.out.println(nameList);
        //for remove all
        nameList.clear();
        System.out.println(nameList);
    }
}
