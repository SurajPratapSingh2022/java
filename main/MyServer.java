package com.sps;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) {
		try {
			ServerSocket sos=new ServerSocket(6666);
			Socket soc=sos.accept();
			
			ObjectInputStream ois=new ObjectInputStream(soc.getInputStream());
			String str=(String)ois.readUTF();
			
			System.out.println("message="+str);
			
			sos.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
