package com.sps.javaVersionUpdate;
//anonymous inner classes in diamond operator
abstract class work1<T>{
	abstract T calc(T a, T b);
}
public class Java8DiamondOperatorExample1 {
	public static void main(String[] args) {
		work1<Integer> obj=new work1<>() {
			public Integer calc(Integer a, Integer b) {
				return a+b;
			}
		};
		System.out.println("Result= "+obj.calc(10, 20));
	}
}
