package com.sps.javaIOStream;

// Read one file & overwrite in another file example
import java.io.*;

public class ReadFileAndWriteInAnotherFile2 {
    public static void main(String[] args) {
        File infile = new File("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\test.txt");
        File ofile = new File("C:\\Users\\suraj\\eclipse-workspace\\JavaProg\\bin\\com\\sps\\main\\doc.txt");

        // Check if output file exists and read both files' content
        try (FileReader fr = new FileReader(infile);
             FileWriter fw = new FileWriter(ofile);
             StringWriter sw = new StringWriter()) {

            // Read content of the input file
            int ch;
            while ((ch = fr.read()) != -1) {
                sw.write(ch); // Write to StringWriter to get input file content
            }
            String inputFileContent = sw.toString(); // Store input file content
            
            // If output file exists, compare contents
            if (ofile.exists()) {
                StringWriter ow = new StringWriter();
                FileReader fwReader = new FileReader(ofile);
                while ((ch = fwReader.read()) != -1) {
                    ow.write(ch); // Write to StringWriter to get output file content
                }
                String outputFileContent = ow.toString(); // Store output file content
                
                // Compare contents
                if (inputFileContent.equals(outputFileContent)) {
                    System.out.println("The contents of the files are identical. No copying performed.");
                    return; // Exit the program since contents are the same
                }
                fwReader.close(); // Close the FileReader for output file
            }

            // If contents are different or output file does not exist, write input file content to output file
            fw.write(inputFileContent);
            System.out.println("File has been copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
