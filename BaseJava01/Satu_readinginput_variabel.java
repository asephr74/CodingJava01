/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author PROGSID1
 */

import java.util.Scanner;

public class Satu_readinginput_variabel {
    
    public static void main(String[]args){
        
        int number=123;
        System.out.println(number);
        
        number=42;
        System.out.println(number);
        
        //input dari user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write text and press enter ");
        String text = scanner.nextLine();
        System.out.println("You wrote " + text);
        

        // tidak diisi nilai int akan error
        System.out.println("Write value");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value);
        
        //reading boolean
        
        
        System.out.println("Write a boolean ");
        boolean value2 = Boolean.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value2);
        
        System.out.println("value"+(2+2));
        System.out.println("value"+2+2);
    
}
}
