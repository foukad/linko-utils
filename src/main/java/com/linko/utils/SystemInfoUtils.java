package com.linko.utils;

/**
 * SystemInfoUtils – a collection of simple system and environment information helpers.
 * Intended for learning, experimentation, and use as a reusable component.
 */
public class SystemInfoUtils {

    /**
     * Returns the name of the operating system on which the JVM is running.
     *
     * @return the OS name as reported by the system property "os.name"
     */
    public static String getOsName() {
        return System.getProperty("os.name");
    }

    /**
     * Returns the version of the Java runtime that is currently in use.
     *
     * @return the Java version as reported by the system property "java.version"
     */
    public static String getJavaVersion() {
        return System.getProperty("java.version");
    }

    /**
     * Prints a summary of key system information to standard output, including:
     * the OS name, the Java version, and the number of available processors.
     */
    public static void printSystemSummary() {
        System.out.println("--- System Summary ---");
        System.out.println("OS Name             : " + getOsName());
        System.out.println("Java Version        : " + getJavaVersion());
        System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());
        System.out.println("---------------------");
    }

    /**
     * Demonstrates the usage of SystemInfoUtils methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Print individual system properties
        System.out.println("OS Name      : " + getOsName());
        System.out.println("Java Version : " + getJavaVersion());

        // Print the full system summary
        printSystemSummary();
    }
}
