package exceptionhandling.five;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    /* File reader reads from a file one character at a time */
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;

        try {
            // Connects to a new file
            fileReader = new FileReader("story.txt");

            // FileReader returns as an int (unicode)
            // -1 means end of file
            int character = 0;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character); // Cast the unicode int to a char
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        } finally {
            if (fileReader != null) {
                fileReader.close(); // close file connection to get resources back
            }
        }
    }
}