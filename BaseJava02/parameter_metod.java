
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;

public class parameter_metod{
    public static void main(String[] args) {
    greet(1);
    System.out.println("");
    greet(3);
    }

    // parameter methods
    public static void greet(int numOfTimes) {
    int i = 0;
    while (i < numOfTimes) {
        System.out.println("Greetings!");
        i++;
    }
}
}
