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
public class simulasi_2 {
    public static void main(String[]args){
        
    //kedua
    Scanner scanner=new Scanner(System.in);
    
    while (true) {
    System.out.println("Exit? (y exits)");
    String input = scanner.nextLine();
    if (input.equals("y")) {
        break;
    }

    System.out.println("Ok! Let's carry on!");
}

System.out.println("Ready!");
}
}