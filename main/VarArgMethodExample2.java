package com.sps.main;

public class VarArgMethodExample2 {
	public static void m1(int...i) {
		System.out.println("Abc");
	}
	public static void main(String[] args) {
		m1();
		m1(12);
		m1(12,14);
		//here how much argument given doesn't matter, Always result comes Abc
	}
}
