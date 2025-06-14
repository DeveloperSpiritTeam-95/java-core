package com.springboot.seniordev.socketprogramming;

import java.io.*;
import java.net.*;
/**
 * @author prabhakar, @Date 26-03-2025
 */
public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(12346); // Port number
            System.out.println("UDP Server started on port 12346");

            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            while (true) {
                socket.receive(packet); // Blocks until a packet is received
                System.out.println("Received packet from: " + packet.getAddress() + ":" + packet.getPort());

                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Message: " + message);

                // Send a response back to the client
                String response = "Server received: " + message;
                byte[] responseBytes = response.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(responseBytes, responseBytes.length, packet.getAddress(), packet.getPort());
                socket.send(responsePacket);
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }
            socket.close();
            System.out.println("UDP Server Stopped");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
