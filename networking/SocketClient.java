package com.sps.javaNetworking;
//socket client code
import java.io.*;
import java.net.*;
public class SocketClient {
    public static void main(String[] args) {
        try {
            // Connect to the server on local host and port 1212
            Socket socket = new Socket("localhost", 1212);
            System.out.println("Connected to the server!");
            // Create DataOutputStream to send data to server
            DataOutputStream dataOutput = new DataOutputStream(socket.getOutputStream());
            dataOutput.writeUTF("Hello from client!"); // Send message
            dataOutput.flush(); // Ensure all data is sent
            // Close streams and socket
            dataOutput.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
