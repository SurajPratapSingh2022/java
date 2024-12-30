package com.sps.javaGenerics;

class Demo<T> {
    public void show(T v) {
        System.out.println(v);
    }
}

public class GenericsExample1 {
    public static void main(String[] args) {
        Demo<Integer> obj1 = new Demo<>();
        obj1.show(10);  // Corrected syntax

        Demo<String> obj2 = new Demo<>();
        obj2.show("Dhananjay");  // Corrected syntax
    }
}
