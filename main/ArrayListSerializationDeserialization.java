package com.sps;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerializationDeserialization {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		//Serialization
		try {
			FileOutputStream fos=new FileOutputStream("file");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			//Deserialization
			FileInputStream fis=new FileInputStream("file");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ArrayList list=(ArrayList) ois.readObject();
			System.out.println(list);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
