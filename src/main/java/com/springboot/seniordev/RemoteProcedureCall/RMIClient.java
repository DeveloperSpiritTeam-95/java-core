package com.springboot.seniordev.RemoteProcedureCall;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
/**
 * @author prabhakar, @Date 25-03-2025
 */
public class RMIClient {
    public static void main(String[] args) {
        try {
            GreetingService service = (GreetingService) Naming.lookup("rmi://localhost:1099/GreetingService"); // Look up the service
            String name = "RMI User";
            String response = service.sayHello(name);
            System.out.println("Received: " + response);
        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
