package com.sps.javaGenerics;

class Demo1<T> {
    T v;
    public Demo1(T v) {
        this.v = v;  
    }
    public T getValue() {
        return v;
    }
}
public class GenericsExample2 {
    public static void main(String[] args) {
        Demo1<String> obj = new Demo1<String>("Shohan");
        System.out.println(obj.getValue());
    }
}

