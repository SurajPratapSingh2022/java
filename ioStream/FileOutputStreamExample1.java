package com.sps.javaIOStream;
//FileOutputStream Example-->for overwrite msg
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamExample1 {
    public static void main(String[] args) {
        FileOutputStream ofile = null;
        String[] b1 = { "Suraj", "Chandu","Kavita","Pawan" };
        try {
            ofile = new FileOutputStream("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\src\\com\\sps\\main\\test.txt");
            for (String str : b1) {
                ofile.write(str.getBytes()); // Convert each string to bytes
                ofile.write('\n');
            }
            System.out.println("file overwritten");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (ofile != null) {
                try {
                    ofile.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the file: " + e.getMessage());
                }
            }
        }
    }
}
