package com.springboot.core.basic;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @author prabhakar, @Date 15-05-2025
 */

public class LoggerExample {

    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {
        configureLogger(); // Set up the logger configuration

        // Logging examples
        logger.info("This is an INFO message.");

        logger.warning("This is a WARNING message.");

        logger.severe("This is an ERROR message.");

        logger.fine("This is a FINE message.");
        logger.finer("This is a FINER message.");
        logger.finest("This is a FINEST message.");
        logger.log(Level.INFO, "This is a INFO message.");
        System.out.println(logger.getName());
    }

    private static void configureLogger() {
        try {
            // Create a FileHandler to store logs in a file
            FileHandler fileHandler = new FileHandler("application.log", true);
            fileHandler.setFormatter(new SimpleFormatter()); // Format log entries

            // Add handlers to logger
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false); // Disable default console output

            // Set the logging level (FINE, INFO, WARNING, SEVERE, etc.)
            logger.setLevel(Level.ALL);

        }catch (IOException e) {
            logger.severe("Failed to configure logger: " + e.getMessage());
        }
    }
}
