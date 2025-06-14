package com.springboot.seniordev.RemoteProcedureCall;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * @author prabhakar, @Date 25-03-2025
 */
public interface GreetingService extends Remote {
    String sayHello(String name) throws RemoteException;
}