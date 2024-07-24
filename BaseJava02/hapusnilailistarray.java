import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan objek Integer
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Menambahkan elemen ke dalam ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Menambahkan elemen 2 lagi untuk demonstrasi
        
        // Mencetak isi ArrayList sebelum penghapusan
        System.out.println("ArrayList sebelum penghapusan: " + numbers);
        
        // Menghapus elemen dengan nilai 2
        numbers.remove(Integer.valueOf(2));
        
        // Mencetak isi ArrayList setelah penghapusan
        System.out.println("ArrayList setelah penghapusan: " + numbers);
    }
}
