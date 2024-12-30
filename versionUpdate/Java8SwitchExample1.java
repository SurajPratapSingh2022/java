package com.sps.javaVersionUpdate;
//java 8: Switch Update
// String expression under switch example
import java.util.Scanner;
public class Java8SwitchExample1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = obj.nextInt();
        
        System.out.print("Enter 2nd Number: ");
        int b = obj.nextInt();
        
//      String c="Add";				//string literal- compile time string inputting
//      String c=new String("Add");	//using new keyword- compile time string inputting
        
        //run time string inputting
        // Clear the newline character left by nextInt
        obj.nextLine();
        System.out.print("Enter String (i.e. Add/Sub/Mul/Div): ");
        String c = obj.nextLine();	//nextLine takes more than one string
//        String c = obj.next();		//next takes only one string
        
        switch (c) {
            case "Add":
                System.out.println("Result: " + (a + b));
                break;
            case "Sub":
                System.out.println("Result: " + (a - b));
                break;
            case "Mul":
                System.out.println("Result: " + (a * b));
                break;
            case "Div":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        
        obj.close();
    }
}
