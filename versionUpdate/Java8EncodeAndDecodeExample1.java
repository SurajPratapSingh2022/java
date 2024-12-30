package com.sps.javaVersionUpdate;
//java 8: encoder & decoder example
import java.util.Base64;
public class Java8EncodeAndDecodeExample1 {
	public static void main(String[] args) {
		String msg="This is a secret message";
		String encmsg=Base64.getEncoder().encodeToString(msg.getBytes());
		System.out.println("Encrypted Message= "+encmsg);
		byte []dm=Base64.getDecoder().decode(encmsg);
		String decmsg=new String(dm);
		System.out.println("Decrypted Message= "+decmsg);
	}
}
