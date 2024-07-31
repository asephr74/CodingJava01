import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("!");

        print(myList);
    }

    public static void print(ArrayList<String> list) {
        for (String nilai: list) {
            System.out.println(nilai);
        }
    }
}