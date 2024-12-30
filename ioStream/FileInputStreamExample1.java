package com.sps.javaIOStream;
//FileInputStream Example-->for display msg
import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamExample1 {
    public static void main(String[] args) {
        FileInputStream infile = null;
        try {
            infile = new FileInputStream("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\src\\com\\sps\\main\\test.txt");
            int b;
            while ((b = infile.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (infile != null) {
                try {
                    infile.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the file: " + e.getMessage());
                }
            }
        }
    }
}
