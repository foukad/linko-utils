package com.linko.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * FileUtils – a collection of simple file helper methods.
 * Intended for learning, experimentation, and use as a reusable component.
 */
public class FileUtils {

    /**
     * Reads the entire content of a file and returns it as a String.
     *
     * @param path the path to the file to read
     * @return the file content as a String
     * @throws IOException if the file cannot be read
     */
    public static String readFile(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
    }

    /**
     * Writes the given text content to a file at the specified path.
     * If the file already exists, it will be overwritten.
     *
     * @param path    the path of the file to write
     * @param content the text content to write into the file
     * @throws IOException if the file cannot be written
     */
    public static void writeFile(String path, String content) throws IOException {
        Files.write(Paths.get(path), content.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Checks whether a file exists at the given path.
     *
     * @param path the path to check
     * @return true if a file exists at the given path, false otherwise
     */
    public static boolean fileExists(String path) {
        return new File(path).exists();
    }

    /**
     * Prints a summary of the file at the given path to standard output, including:
     * the file name, its size in bytes, and whether it is readable and writable.
     *
     * @param path the path to the file to summarise
     */
    public static void printFileSummary(String path) {
        File file = new File(path);
        System.out.println("--- File Summary ---");
        if (!file.exists()) {
            System.out.println("File does not exist: " + path);
        } else {
            System.out.println("File Name : " + file.getName());
            System.out.println("Size      : " + file.length() + " bytes");
            System.out.println("Readable  : " + file.canRead());
            System.out.println("Writable  : " + file.canWrite());
        }
        System.out.println("--------------------");
    }

    /**
     * Demonstrates the usage of FileUtils methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String path = "demo.txt";

        try {
            // Write some content to a file
            writeFile(path, "Hello from FileUtils!");
            System.out.println("File written to: " + path);

            // Check whether the file exists
            System.out.println("fileExists(\"" + path + "\") -> " + fileExists(path));

            // Read back the content that was just written
            String content = readFile(path);
            System.out.println("File content: " + content);

            // Print a summary of the file
            printFileSummary(path);

        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        }
    }
}
