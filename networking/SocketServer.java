package com.sps.javaNetworking;
//socket server code
import java.io.*;
import java.net.*;
public class SocketServer {
    public static void main(String[] args) {
        try {
            // Create a ServerSocket listening on port 1212
            ServerSocket serverSocket = new ServerSocket(1212);
            System.out.println("Server is waiting for a client...");
            // Accept an incoming connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");
            // Create DataInputStream to read data from client
            DataInputStream dataInput = new DataInputStream(socket.getInputStream());
            String message = dataInput.readUTF(); // Read message from client
            // Print the received message
            System.out.println("Message from client: " + message);
            // Close streams and sockets
            dataInput.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}
