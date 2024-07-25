import java.util.ArrayList;

public class Main {
    // Method to print each element in the ArrayList
    //for-each
    public static void print(ArrayList<String> list) {
        for (String v : list) { 
            System.out.println(v);//variabel string v
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Elderberry");

        // Call the print method
        print(items);
    }
}
