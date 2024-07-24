
import java.util.ArrayList;
import java.util.Scanner;

public class jumlahisiarraylist{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("First");
        wordList.add("dua");
         wordList.add("tiga");
        
        System.out.println("isi array"+wordList);
        System.out.println("Number of values on the list:"+wordList.size());
        
    }
}
