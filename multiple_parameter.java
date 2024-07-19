
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;

public class multiple_parameter{
    public static void main(String[] args) {
        sum(3, 5);
       
        int number1 = 2;
        int number2 = 4;
       
        sum(number1, number2);       
    }

    // parameter methods
    public static void sum(int first, int second) {
        System.out.println("" + first + " + " + second + " = " + (first+ second));
    }
}