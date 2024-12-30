package com.sps.javaVersionUpdate;
//java 7: try with resources example
import java.io.FileInputStream;
import java.util.Scanner;

public class Java7TryWithResourcesExample2 {
	public static void main(String[] args) {
		try(
				Scanner sc=new Scanner(System.in);
				FileInputStream fin=new FileInputStream("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\src\\com\\sps\\javaVersionUpdate\\test.txt")
				){
			String s;
			s=new String(fin.readAllBytes());
			System.out.println(s);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
