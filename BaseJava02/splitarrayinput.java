import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) { //jika kosong/enter
                break;
            }

            String[] pieces = input.split(",");
            if (pieces.length == 2) {
                System.out.println("Name: " + pieces[0] + ", age: " + pieces[1]);
            } else {
                System.out.println("Invalid input format. Please enter in 'Name,age' format.");
            }
        }

        reader.close();
    }
}