package com.sps.javaVersionUpdate;
//java 12: Switch Update
//give null object in switch example
public class Java12SwitchExample3 {
	public static void main(String[] args) {
		Object obj=null;
		String r=switch(obj) {
		case Integer i->"Integer Value";
		case String s->"String Value";
		case null->"Null Value";
		default ->"Unknown";
		};
		System.out.println(r);
	}
}
