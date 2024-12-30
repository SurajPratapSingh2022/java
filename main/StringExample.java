package com.sps.main;
//object create in string
public class StringExample {
    public static void main(String[] args) {
        String str1 = "MakeItEasy"; // Creates a string literal in the string pool
        String str2 = new String("#Padhai"); // Creates a new String object with "#Padhai"
        
        char[] name = {'j', 'A', 'V', 'a'}; // Corrected array declaration syntax
        String str3 = new String(name); // Creates a new String from the char array
        String str4 = new String(name, 1, 3); // Corrected offset to 1, creates String from 'A', 'V', 'a'
        String str5 = new String(str4); // Creates a new String object copying the contents of str4
        
        System.out.println("\n\t1st string: " + str1);
        System.out.println("\n\t2nd string: " + str2);
        System.out.println("\n\t3rd string: " + str3);
        System.out.println("\n\t4th string: " + str4);
        System.out.println("\n\t5th string: " + str5);
    }
}
