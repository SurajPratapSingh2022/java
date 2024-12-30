package com.sps.javaVersionUpdate;
//java 12: Switch Update
//passing object as a expression in switch example
public class Java12SwitchExample2 {
	public static void main(String[] args) {
		Object obj="suraj";
		String r=switch(obj) {
		case Integer i->"Integer Value";
		case String s->"String Value";
		default->"Unknown";
		};
		System.out.println(r);
	}
}
