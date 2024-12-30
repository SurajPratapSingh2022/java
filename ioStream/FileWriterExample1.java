package com.sps.javaIOStream;
//file reader example-->for overwrite msg
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {
    public static void main(String[] args) {
        File outfile = new File("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\test.txt");
        FileWriter fout = null;
        try {
            fout = new FileWriter(outfile); // Corrected the variable name
            String s = "EEC Classes";
            fout.write(s);
            System.out.println("File Overwritten");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the file: " + e.getMessage());
                }
            }
        }
    }
}
