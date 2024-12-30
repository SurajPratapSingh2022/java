package com.sps.javaVersionUpdate;
//stream api example
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Java8StreamApiExample2 {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(10,2,3,6,75,90);
		List<Integer> sqr=lst.stream()
		.map(n->n*n)
		.filter(n->n%2==0)	//filtering based on condition
//		.sorted()		//default sort in ascending order
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		System.out.println("\n");
		sqr.forEach(n->System.out.print(n+" "));
	}
}
