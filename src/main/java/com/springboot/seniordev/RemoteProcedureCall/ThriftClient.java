//package com.springboot.seniordev.RemoteProcedureCall;
//
//import org.apache.thrift.TException;
//import org.apache.thrift.protocol.TBinaryProtocol;
//import org.apache.thrift.protocol.TProtocol;
//import org.apache.thrift.transport.TSocket;
//import org.apache.thrift.transport.TTransport;
//import org.apache.thrift.transport.TTransportException;
//import example.GreetingService; // Generated code
///**
// * @author prabhakar, @Date 25-03-2025
// */
//public class ThriftClient {
//    public static void main(String[] args) {
//        try {
//            TTransport transport = new TSocket("localhost", 9090); // Connect
//            transport.open();
//
//            TProtocol protocol = new TBinaryProtocol(transport);
//            GreetingService.Client client = new GreetingService.Client(protocol); // 'Client' is generated
//
//            String name = "Thrift User";
//            String response = client.sayHello(name);
//            System.out.println("Received: " + response);
//
//            transport.close();
//        } catch (TException e) {
//            e.printStackTrace();
//        }
//    }
//}