//package com.springboot.seniordev.RemoteProcedureCall;
//
//import io.grpc.BindableService;
//import io.grpc.Server;
//import io.grpc.ServerBuilder;
//import java.io.IOException;
//
///**
// * @author prabhakar, @Date 25-03-2025
// */
//public class GRPCServer {
//    public static void main(String[] args) throws IOException, InterruptedException {
//        int port = 50051;
//        Server server = ServerBuilder.forPort(port)
//                .addService((BindableService) new GreetingServiceImpl())
//                .build()
//                .start();
//
//        System.out.println("gRPC Server started on port " + port);
//        server.awaitTermination(); // Block until shutdown
//    }
//}