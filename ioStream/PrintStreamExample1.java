package com.sps.javaIOStream;
//print stream example
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class PrintStreamExample1 {
    public static void main(String[] args) {
        // Use try-with-resources to ensure streams are closed automatically
        try (FileOutputStream fout = new FileOutputStream("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\test.txt");
             PrintStream p1 = new PrintStream(fout)) {

            // Write data to the file
            p1.println(400); // Writes the integer 400
            p1.println("You like me"); // Writes the string

            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
