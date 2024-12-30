package com.sps.javaIOStream;

// Read one file & overwrite in another file example using try with resources
import java.io.*;

public class ReadFileAndWriteInAnotherFile1 {
    public static void main(String[] args) {
        File infile = new File("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\test.txt");
        File ofile = new File("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\doc.txt");
        
        // Using try-with-resources for automatic resource management
        try (FileReader fr = new FileReader(infile); 
             FileWriter fw = new FileWriter(ofile)) {
             
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch); // Write the character read from the input file
            }
            System.out.println("File has been copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
