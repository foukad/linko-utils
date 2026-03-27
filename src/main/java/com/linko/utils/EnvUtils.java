package com.linko.utils;

import java.util.Map;

/**
 * EnvUtils – a collection of simple helpers for reading and inspecting
 * environment variables and system properties.
 * Intended for learning, experimentation, and use as a reusable component.
 */
public class EnvUtils {

    /**
     * Returns the value of the specified environment variable,
     * or {@code null} if the variable is not set.
     *
     * @param key the name of the environment variable
     * @return the value of the environment variable, or {@code null} if not found
     */
    public static String getEnv(String key) {
        return System.getenv(key);
    }

    /**
     * Returns the value of the specified system property,
     * or {@code null} if the property is not defined.
     *
     * @param key the name of the system property
     * @return the value of the system property, or {@code null} if not found
     */
    public static String getSystemProperty(String key) {
        return System.getProperty(key);
    }

    /**
     * Prints a summary of the current execution environment to standard output,
     * including the number of environment variables, the number of system properties,
     * the current user name, and the current working directory.
     */
    public static void printEnvironmentSummary() {
        System.out.println("--- Environment Summary ---");
        System.out.println("Environment variables : " + System.getenv().size());
        System.out.println("System properties     : " + System.getProperties().size());
        System.out.println("Current user          : " + System.getProperty("user.name"));
        System.out.println("Working directory     : " + System.getProperty("user.dir"));
        System.out.println("--------------------------");
    }

    /**
     * Prints all environment variables to standard output in a readable
     * {@code KEY = VALUE} format, one entry per line, sorted alphabetically.
     */
    public static void listEnvVariables() {
        System.out.println("--- Environment Variables ---");
        System.getenv()
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));
        System.out.println("-----------------------------");
    }

    /**
     * Demonstrates the usage of EnvUtils methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Read a specific environment variable (PATH is available on most systems)
        String path = getEnv("PATH");
        System.out.println("PATH env variable : " + path);

        // Read a specific system property
        String javaHome = getSystemProperty("java.home");
        System.out.println("java.home property: " + javaHome);

        // Print a high-level environment summary
        printEnvironmentSummary();

        // List all environment variables
        listEnvVariables();
    }
}
