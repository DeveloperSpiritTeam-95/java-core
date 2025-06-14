package com.springboot.seniordev.RemoteProcedureCall;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;
import java.net.MalformedURLException;
/**
 * @author prabhakar, @Date 25-03-2025
 */
public class GreetingServiceImpl extends UnicastRemoteObject implements GreetingService {

    public GreetingServiceImpl() throws RemoteException {
        super(); // Required for UnicastRemoteObject
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        try {
            GreetingService service = new GreetingServiceImpl();
            Naming.rebind("rmi://localhost:1099/GreetingService", service); // Register with RMI registry
            System.out.println("RMI Server is running");
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
