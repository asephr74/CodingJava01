import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
	// Create new Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user to input a double
		System.out.print("Enter a degree in Celsius: ");
		
		String inputan=input.nextLine();
		double celsius = Double.valueOf(inputan); //variabel inputan string di convert ke double
        //double celcius=input.nextDouble();
         
		// Convert Celsius to Fahrenheit
		double fahrenheit = 9.0 / 5 * celsius + 32;

		// Display results
		System.out.println(celsius + " Celsius is " + fahrenheit
			+ " Fahrenheit"); 
    }
}
