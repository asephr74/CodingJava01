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
public class Dua_calculate_number {
    public static void main(String[]args){
    int dividend = 3;
    int divisor = 2;
    //result,hasil,whenDividendIsFloat di inisialisasi langsung
        
    double result = (double) dividend / divisor*1;
    System.out.println(result); //result=1.5, tidak dbulatkan
    
    double hasil = dividend / divisor*1;
    System.out.println(hasil); //result=1.0, dibulatkan
    
    double whenDividendIsFloat = 3 / 2;
    System.out.println(whenDividendIsFloat); // prints 1.0, dibulatkan

    double whenDivisorIsFloat = 3 / 2.0;
    System.out.println(whenDivisorIsFloat); // prints 1.5, tidak dbulatkan
    
    //calculation
    int first = (1 + 1);
    int second = first + 3 * (2 + 5);

    first = 5;

    int third = first + second;
    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
    
    }
    
}
