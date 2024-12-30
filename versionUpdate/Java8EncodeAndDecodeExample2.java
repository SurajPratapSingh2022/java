package com.sps.javaVersionUpdate;
//java 8: encoder & decoder url example
import java.util.Base64;
public class Java8EncodeAndDecodeExample2 {
	public static void main(String[] args) {
		String url="http://www.google.com";
		String encurl=Base64.getUrlEncoder().encodeToString(url.getBytes());
		System.out.println(encurl);
		
		byte[] du=Base64.getUrlDecoder().decode(encurl);
		System.out.println(new String(du));
	}
}
