package com.springboot.seniordev.socketprogramming;

import java.io.*;
import java.net.*;
/**
 * @author prabhakar, @Date 26-03-2025
 */
public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Port number
            System.out.println("TCP Server started on port 12345");

            Socket clientSocket = serverSocket.accept(); // Blocks until a client connects
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Set up input and output streams for communication with the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // Auto-flush

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Received from client: " + message);
                out.println("Server received: " + message);
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            // Close connections
            clientSocket.close();
            serverSocket.close();
            System.out.println("TCP Server stopped");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}