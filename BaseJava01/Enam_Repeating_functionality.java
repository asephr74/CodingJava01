/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author hendr
 */
public class Enam_Repeating_functionality {
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);  
    
    int numbersread=0;
    int sum=0;
    
    while (true){
        if(numbersread==5){
            break;
        }
        
        System.out.println("input number=");
        sum=sum+Integer.valueOf(scanner.nextLine());
        numbersread=numbersread+1;
        
        System.out.println("The sum of njmber is = "+sum);
        
        
        
    }
     //ending loop
     
    int number = 1;

    while (true) {
    System.out.println(number);
    if (number >= 5) {
        break;
    }

    number = number + 1;
}

System.out.println("Ready!");
        
}
}
