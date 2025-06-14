//package com.springboot.seniordev.RemoteProcedureCall;
//
//import io.grpc.Channel;
//import io.grpc.Grpc;
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import io.grpc.stub.StreamObserver;
//import io.grpc.example.HelloRequest; // Generated code
//import io.grpc.example.HelloResponse; // Generated code
//import io.grpc.example.GreetingServiceGrpc; // Generated code
//
//import java.util.concurrent.TimeUnit;
///**
// * @author prabhakar, @Date 25-03-2025
// */
//public class GRPCClient {
//    public static void main(String[] args) throws InterruptedException {
//        // Use a ManagedChannel, which is a Channel that also manages resources.
//        ManagedChannel channel = Grpc.newChannelBuilder("localhost:50051",  // Use the port the server is listening on
//                        ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext() //for dev and test
//                        .build())
//                .build();
//        try {
//            GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel); //create a blocking stub
//
//            String name = "World";
//            HelloRequest request = HelloRequest.newBuilder().setName(name).build();
//            HelloResponse response = stub.sayHello(request);  // Make the call
//            System.out.println("Received: " + response.getMessage());
//        } finally {
//            // ManagedChannels use resources like threads and connections, so it's best to shut them down.
//            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
//        }
//    }
//}