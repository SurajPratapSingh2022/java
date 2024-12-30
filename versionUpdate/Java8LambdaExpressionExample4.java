package com.sps.javaVersionUpdate;
//lambda expression in collection
import java.util.*;
public class Java8LambdaExpressionExample4 {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.forEach((n)->System.out.println(n));;
	}
}
