package com.sps.javaVersionUpdate;
//java 7: try with resources example
import java.util.Scanner;
public class Java7TryWithResourcesExample1 {
	public static void main(String[] args) {
//		Scanner sc=null;
//		try {
//			sc=new Scanner(System.in);
//			String s;
//			System.out.print("Enter Name: ");
//			s=sc.nextLine();
//			System.out.println("Hello "+s);
//		}catch(Exception e) {
//			System.out.println(e.toString());
//		}finally {
//			sc.close();
//		}
		try(Scanner sc=new Scanner(System.in)){
			String s;
			System.out.print("Enter Name: ");
			s=sc.nextLine();
			System.out.println("Hello "+s);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
