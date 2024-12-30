package com.sps.javaIOStream;
//ByteArrayOutputStream --> for write data into multiple file
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        // Declare file output streams
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;
        ByteArrayOutputStream b1 = new ByteArrayOutputStream();
        try {
            // Create file output streams
            f1 = new FileOutputStream("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\test.txt");
            f2 = new FileOutputStream("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\doc.txt");
            b1.write(123); // Example: write a byte (ASCII code for {)
            // Write contents of ByteArrayOutputStream to file outputs
            b1.writeTo(f1);
            b1.writeTo(f2);
            b1.flush(); 
            System.out.println("Data has been written to both files successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close file output streams
            try {
                if (f1 != null) f1.close();
                if (f2 != null) f2.close();
                b1.close(); // Close ByteArrayOutputStream
            } catch (IOException e) {
                System.out.println("Failed to close the files: " + e.getMessage());
            }
        }
    }
}
