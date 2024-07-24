
import java.util.ArrayList;
import java.util.Scanner;

public class arraylistscanner{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("First");
        wordList.add(scanner.nextLine());
        
        System.out.println("isi array"+wordList);
    }
}
