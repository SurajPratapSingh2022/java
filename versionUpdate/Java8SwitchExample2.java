package com.sps.javaVersionUpdate;
//java 8: Switch Update
//enum as a expression in switch example
import java.util.Scanner;
public class Java8SwitchExample2 {
	public static void main(String[] args) {
		int a=10, b=20, r;
		enum c{Add,Sub,Mul,Div};
		r=switch(c.Sub){
		case Add->a+b;
		case Sub->a-b;
		case Mul->a*b;
		case Div->a/b;
		default->-1;
		};
		System.out.println("Result= "+r);
	}
}
