package com.sps.javaIOStream;
//Buffered Input Stream example--> for overwrite msg
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BufferedOutputStreamExample1 {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        BufferedOutputStream b1 = null;
        try {
            fout = new FileOutputStream("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\test.txt");
            b1 = new BufferedOutputStream(fout);
            String s = "Shivam is good boy.";
            byte[] b = s.getBytes();
            b1.write(b);
            System.out.println("File Overwriten");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (b1 != null) {
                    b1.close();
                }
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException e) {
                System.out.println("Failed to close the file: " + e.getMessage());
            }
        }
    }
}

