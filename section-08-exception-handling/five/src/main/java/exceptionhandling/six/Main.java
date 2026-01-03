package exceptionhandling.six;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    // Use bufferedReader for more functionality and performance
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("story.txt")); // Connects to file.txt and attaches a bucket
            String line;
            while ((line = reader.readLine()) != null) {    // Fetches a line at a time
                System.out.println(line);                   // Prints the line
            }
            reader.close();                                 // Closes the connection
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
