public class MethodsReturnValues{
    public static void main(String[]args){
        
         int number = alwaysReturnsTen();
         System.out.println("the method returned the number " + number);
    }
    
    
    public static int alwaysReturnsTen() {
    return 10;
     }
    
}