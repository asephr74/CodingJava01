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
public class Tujuh_moreloops {
    public static void main(String[]args){
        
        int number = 1;
        
        //while
        while (number < 6) {
            System.out.println(number);
            number++;
        }

        //for
        for (int i = 0; i < 10; i++) {
         System.out.println(i);
        }
        
        
        //summing
        int tulos = 0;
        int i = 0;
        
        while (i < 4) {
            tulos += 3;//tulos=tulos+3
            i++;//i=i+1
        }

        System.out.println(tulos);
        
        
        
    }
}


