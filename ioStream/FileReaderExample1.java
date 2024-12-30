package com.sps.javaIOStream;
//file reader example-->for display msg
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderExample1 {
    public static void main(String[] args) {
        File infile = new File("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\test.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(infile);
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); // Changed to `print` to avoid new lines for each character
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the file: " + e.getMessage());
                }
            }
        }
    }
}
