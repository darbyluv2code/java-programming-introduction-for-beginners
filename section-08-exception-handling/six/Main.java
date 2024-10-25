package exceptionhandling.seven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    // Try with resources syntax
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("story.txt"))) {
            // Connects to file.txt and attaches a bucket
            String line;
            while ((line = reader.readLine()) != null) {    // Fetches a line at a time
                System.out.println(line);                   // Prints the line
            }
         // Not needed   reader.close();    // Closes the connection
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

