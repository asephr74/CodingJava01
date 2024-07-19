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
public class Tiga_if_array1 {
    
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
         System.out.println("good subuh");
       
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
      
      //> greater than
      //>= greater than or equal to
      //< less than
      //<= less than or equal to
      //== equal to
      //!= not equal to
          
      //boolean..if
      int first = 1;
      int second = 3;
      boolean isLessThan = first < second;

      if (isLessThan) {
         System.out.println("1 is less than 3!");
       }
      
      
    } 
    }
}
