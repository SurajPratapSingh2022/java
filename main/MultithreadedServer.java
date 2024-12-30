package com.sps;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadedServer implements Runnable {
    private final Socket clientSocket;

    // Constructor to initialize client socket
    public MultithreadedServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public static void main(String[] args) {
        // Port number for the server
        int port = 1234;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port: " + port);

            while (true) {
                // Accept incoming client connections
                Socket socket = serverSocket.accept();
                System.out.println("New client connected: " + socket.getRemoteSocketAddress());

                // Start a new thread for each client
                Thread clientThread = new Thread(new MultithreadedServer(socket));
                clientThread.setName("Client-" + socket.getPort()); // Naming the thread
                clientThread.start();
            }
        } catch (IOException e) {
            System.err.println("Server Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running.");

            // Simulate handling client communication (add your logic here)

            // Close the client socket after use
            clientSocket.close();
            System.out.println(Thread.currentThread().getName() + " connection closed.");
        } catch (IOException e) {
            System.err.println("Error in thread " + Thread.currentThread().getName() + ": " + e.getMessage());
            e.printStackTrace();
        }
    }
}
