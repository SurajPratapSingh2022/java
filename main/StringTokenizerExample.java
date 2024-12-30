package com.sps.main;
import java.util.*;
public class StringTokenizerExample {
	public static void main(String[] args) {
		StringTokenizer s1=new StringTokenizer("EEC Classes");
		while(s1.hasMoreElements()) {
			System.out.println(s1.nextToken());
		}
				
	}
}
