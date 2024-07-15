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
public class materii {
    
    public static void main(String[]args) {
    
    boolean ok =true;
    boolean ng =false;
    
    int time=14;
    String txt="hello world";
    
    System.out.println(ok);
    System.out.println(Math.min(10,50));
    
    String []cars={"volvo","honda","suzuki"};
    
    
    
     System.out.println(txt.toUpperCase());
     
     // if..else
     if (time<10){
         System.out.println("good evening");
     }
         else if(time<15){
         System.out.println("good morning");
         
         }
      else{
         System.out.println("good isuk2");
       
         //array
     }
     System.out.println(cars[0]);
     System.out.println(cars.length);
     
     for (int i=0;i<cars.length;i++){
         System.out.println(cars[i]);
     }
     
     //for..each
         for (String i : cars) {
      System.out.println(i);
    } 
   
}
    
}
