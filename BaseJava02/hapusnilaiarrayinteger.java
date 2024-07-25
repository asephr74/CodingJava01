import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(15);
    list.add(18);
    list.add(21);
    list.add(24);

    list.remove(2);
    list.remove(Integer.valueOf(15));//hapus isi nilai array int 

    System.out.println("Index 0 so the first value: " + list.get(0));
    System.out.println("Index 1 so the second value: " + list.get(1));
    }
}
