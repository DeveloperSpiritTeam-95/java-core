package com.springboot.seniordev.distributedsystemsarchitectures;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/**
 * @author prabhakar, @Date 24-03-2025
 */
public class RealTimeDataProcessor {

    private final KafkaConsumer<String, String> consumer;
    private final ExecutorService executor;
    private final AtomicBoolean running = new AtomicBoolean(true);

    public RealTimeDataProcessor(String topic) {
        // Configure Kafka consumer properties
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "localhost:9092"); // Replace with your Kafka broker(s)
        properties.setProperty("group.id", "my-consumer-group");      // Consumer group ID
        properties.setProperty("enable.auto.commit", "true");
        properties.setProperty("auto.commit.interval.ms", "1000");
        properties.setProperty("session.timeout.ms", "30000");
        properties.setProperty("key.deserializer", StringDeserializer.class.getName());
        properties.setProperty("value.deserializer", StringDeserializer.class.getName());
        properties.setProperty("auto.offset.reset", "latest");  // Start reading from the end of the topic

        consumer = new KafkaConsumer<>(properties);
        consumer.subscribe(Collections.singletonList(topic)); // Subscribe to the specified topic
        executor = Executors.newFixedThreadPool(10);             // Thread pool for processing records
    }

    public void startProcessing() {
        // Main loop for consuming and processing data
        while (running.get()) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100)); // Poll for data
            if (records.count() > 0) {
                // Use the executor to process each record in a separate thread
                for (ConsumerRecord<String, String> record : records) {
                    executor.submit(() -> processRecord(record));
                }
            }
        }
    }

    private void processRecord(ConsumerRecord<String, String> record) {
        // Simulate real-time data processing
        String key = record.key();
        String value = record.value();
        long offset = record.offset();
        int partition = record.partition();

        System.out.println("Received record:");
        System.out.println("  Key: " + key);
        System.out.println("  Value: " + value);
        System.out.println("  Partition: " + partition);
        System.out.println("  Offset: " + offset);

        // Replace this with your actual processing logic.  This is where you'd
        // perform the "real-time" operations, such as:
        // - Analyzing the data
        // - Updating a cache
        // - Triggering an alert
        // - Sending data to another system
        try {
            Thread.sleep(50); // Simulate processing delay (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            System.err.println("Processing interrupted: " + e.getMessage());
            running.set(false); // Stop the processing loop
        }
        System.out.println("Record processed.");
    }

    public void stopProcessing() {
        running.set(false);         // Signal the processing loop to stop
        consumer.wakeup();         // Interrupt the consumer to break out of poll()
        executor.shutdown();       // Shutdown the executor
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS); // Wait for tasks to complete
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Error waiting for executor termination: " + e.getMessage());
        }
        consumer.close();         // Close the consumer
        System.out.println("Stopped processing.");
    }

    public static void main(String[] args) {
        String topicName = "my-realtime-topic"; // Replace with your Kafka topic
        RealTimeDataProcessor processor = new RealTimeDataProcessor(topicName);

        // Start processing in a separate thread
        Thread processingThread = new Thread(processor::startProcessing);
        processingThread.start();

        // Add a shutdown hook to stop processing gracefully
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down processor...");
            processor.stopProcessing();
        }));

        // Keep the main thread alive for a while to allow processing to occur
        try {
            Thread.sleep(60000); // Process for 60 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Interrupted: " + e.getMessage());
        }

        // Stop processing
        processor.stopProcessing();
    }
}

