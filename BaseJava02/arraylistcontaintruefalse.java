import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");

       System.out.println("Is the first found? " + list.contains("satu"));

       boolean found = list.contains("Second");
       if (found) {       //masuk ke if hrus dbuat variabel, jika ditemukan/true
             System.out.println("Second was found");
        }

// or more simply
       if (list.contains("Second")) {
               System.out.println("Second can still be found");
}
    }
}
