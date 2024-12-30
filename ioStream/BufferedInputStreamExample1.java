package com.sps.javaIOStream;
//Buffered Input Stream example--> for display msg
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample1 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\test.txt");
             BufferedInputStream b2 = new BufferedInputStream(fin)) {
             
            int ch;
            while ((ch = b2.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
