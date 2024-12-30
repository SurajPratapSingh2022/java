package com.sps.javaVersionUpdate;
//java 10: var example
import java.util.Arrays;
public class Java10LocalVariableTypeInferenceExample1 {
	public static void main(String[] args) {
		var a=Arrays.asList(10,20,30,40,50);
		a.forEach((n)->System.out.print(n+" "));
	}
}
