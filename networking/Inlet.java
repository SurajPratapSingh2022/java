package com.sps.javaNetworking;
//example of inlet
import java.net.*;
public class Inlet {
    public static void main(String[] args) {
        try {
            // Use InetAddress instead of InletAddress
            InetAddress ip = InetAddress.getByName("www.ssl2buy.com");

            // Display hostname and IP address
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unable to resolve host: " + e.getMessage());
        }
    }
}
