package com.sps.javaIOStream;
//read one file & overwrite in another file example
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileAndWriteInAnotherFile {
    public static void main(String[] args) {
        File infile = new File("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\test.txt");
        File ofile = new File("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\doc.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(infile);
            fw = new FileWriter(ofile);
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch); // Write the character read from the input file
            }
            System.out.println("File Copied");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Failed to close the files: " + e.getMessage());
            }
        }
    }
}
