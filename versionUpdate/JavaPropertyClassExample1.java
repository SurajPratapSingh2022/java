package com.sps.javaVersionUpdate;
//property class example
import java.util.Properties;
public class JavaPropertyClassExample1 {
	public static void main(String[] args) {
		Properties p=new Properties();
		p.put(101, "Anuj");
		p.put(102, "Alok");
		p.put(103, "Pawan");
		p.put(104, "Manoj");
		p.put(105, "Anuj");
		p.forEach((k,v)->{
			System.out.println(k+"\t"+v);
		});
	}
}
