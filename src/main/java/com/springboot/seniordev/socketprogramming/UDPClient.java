package com.springboot.seniordev.socketprogramming;

import java.io.*;
import java.net.*;
/**
 * @author prabhakar, @Date 26-03-2025
 */
public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost"); // Replace with server IP if needed
            int serverPort = 12346;

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;

            while (true) {
                System.out.print("Enter message (or 'exit' to quit): ");
                message = userInput.readLine();
                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                socket.send(sendPacket);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
                byte[] receiveBuffer = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                socket.receive(receivePacket); // Block until a response is received

                String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from server: " + response);
            }
            socket.close();
            System.out.println("Disconnected from UDP Server");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}