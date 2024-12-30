package com.sps.javaVersionUpdate;
//property file reader example
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class JavaPropertyClassExample2 {
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileReader reader=new FileReader("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\src\\com\\sps\\javaVersionUpdate\\db.properties");
		p.load(reader);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}
}
