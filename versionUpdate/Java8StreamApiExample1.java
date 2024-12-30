package com.sps.javaVersionUpdate;

import java.util.Arrays;
import java.util.List;

public class Java8StreamApiExample1 {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(10,2,3,6,70,90);
		lst.stream()
		.map(n->n*n)
		.forEach(n->System.out.print(n+" "));
		System.out.println("\nThe List Element are: ");
		lst.forEach(n->System.out.print(n+" "));
		
	}
}
