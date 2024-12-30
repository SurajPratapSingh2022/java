package com.sps.javaNetworking;
//java Networking example
import java.net.*;
public class JavaNet {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL obj = new URL("https://www.tspolice.gov.in/jsp/homePage?method=getHomePageElements");

            // Print different components of the URL
            System.out.println("Protocol: " + obj.getProtocol());
            System.out.println("Host: " + obj.getHost());
            System.out.println("Port: " + obj.getPort());  // -1 if no port is specified
            System.out.println("File: " + obj.getFile());
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}
