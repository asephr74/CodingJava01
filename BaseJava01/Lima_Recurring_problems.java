/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author PROGSID1
 */
public class Lima_Recurring_problems {
    public static void main(String[]args){
       // Creating the scanner
        Scanner reader = new Scanner(System.in);

        // Examples of reading different types of user input
        String text = reader.nextLine();
        int number = Integer.valueOf(reader.nextLine());
        double numberWithDecimals = Double.valueOf(reader.nextLine());
        boolean trueOrFalse = Boolean.valueOf(reader.nextLine()); 
        
        // Identifying the input values and declaring the variables for them
         int first = 1;
         int second = 2;

        // Identifying the operation and declaring a variable for the result
         int sum = first + second;

        // printing the result of the calculation
         System.out.println("The sum of " + first + " and " + second + " is " + sum);
        
          
        
    }
   
    
}
