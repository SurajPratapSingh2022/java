package com.sps.javaVersionUpdate;
//property file writer example
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class JavaPropertyClassExample3 {
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		p.setProperty("name", "Dhananjay Sharma");
		p.setProperty("email", "dhananjaysharma@united.ac.in");
		p.store(new FileWriter("info.properties"), "About Me");
	}
}
