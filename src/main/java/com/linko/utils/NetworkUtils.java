package com.linko.utils;

/**
 * NetworkUtils – a collection of simple networking helper methods.
 * Intended for learning, experimentation, and use as a reusable component.
 */
public class NetworkUtils {

    /**
     * Checks whether the given port number is within the valid TCP/UDP range.
     * Valid ports are 1–65535; port 0 is reserved and therefore not considered valid here.
     *
     * @param port the port number to check
     * @return true if the port is valid (1–65535), false otherwise
     */
    public static boolean isValidPort(int port) {
        return port >= 1 && port <= 65535;
    }

    /**
     * Prints a simple ASCII banner identifying this utility library.
     */
    public static void printBanner() {
        System.out.println("=========================================");
        System.out.println("  linko-utils / NetworkUtils");
        System.out.println("  Lightweight networking helpers for Java");
        System.out.println("=========================================");
    }

    /**
     * Demonstrates the usage of NetworkUtils methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        printBanner();

        // Test a selection of port numbers
        int[] testPorts = {0, 1, 80, 443, 8080, 65535, 65536};

        for (int port : testPorts) {
            System.out.printf("isValidPort(%5d) -> %b%n", port, isValidPort(port));
        }
    }
}
