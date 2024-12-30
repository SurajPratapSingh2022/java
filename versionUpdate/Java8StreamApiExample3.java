package com.sps.javaVersionUpdate;
//stream api example
import java.util.Arrays;
import java.util.List;

public class Java8StreamApiExample3 {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(1,3,2,4,5);
		int r=lst.stream()
				.filter(n->n%2==0)
				.reduce(0, (sum,i)->sum+i);
		System.out.println("Result= "+r);
	}
}
