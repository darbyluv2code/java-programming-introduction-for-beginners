package exceptionhandling.eight;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Use BufferedWriter to create and write a text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a simple text file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Use BufferedReader to read the text file
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}