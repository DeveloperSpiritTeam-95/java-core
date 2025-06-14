//package com.springboot.seniordev.RemoteProcedureCall;
//
//import org.apache.thrift.server.TServer;
//import org.apache.thrift.server.TSimpleServer;
//import org.apache.thrift.transport.TServerSocket;
//import org.apache.thrift.transport.TServerTransport;
//import org.apache.thrift.TProcessor;
//import example.GreetingService; // Generated code
///**
// * @author prabhakar, @Date 25-03-2025
// */
//public class ThriftServer {
//    public static void main(String[] args) {
//        try {
//            TServerTransport serverTransport = new TServerSocket(9090); // Port
//            GreetingServiceImpl handler = new GreetingServiceImpl();
//            TProcessor processor = new GreetingService.Processor<>(handler); // 'Processor' is generated
//            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
//
//            System.out.println("Thrift Server started on port 9090");
//            server.serve(); // Start the server; this is a blocking call
//            System.out.println("Thrift Server stopped");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}