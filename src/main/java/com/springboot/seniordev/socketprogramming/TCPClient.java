package com.springboot.seniordev.socketprogramming;

import java.io.*;
import java.net.*;
/**
 * @author prabhakar, @Date 26-03-2025
 */
public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Connect to the server
            System.out.println("Connected to TCP Server");

            // Set up input and output streams for communication with the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // Auto-flush
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String message;
            while (true) {
                System.out.print("Enter message (or 'exit' to quit): ");
                message = userInput.readLine();
                out.println(message); // Send message to the server

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                String response = in.readLine(); // Read response from the server
                System.out.println("Received from server: " + response);
            }

            // Close connections
            socket.close();
            System.out.println("Disconnected from TCP Server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}