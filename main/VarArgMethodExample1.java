package com.sps.main;

public class VarArgMethodExample1 {
	public static void m1(int...i) {
		int total=0;
		for(int y:i) {
			total = total+y;
		}
		System.out.println("Total is : "+total);
	}
	public static void main(String[] args) {
		m1(10,20,30);
	}
}
