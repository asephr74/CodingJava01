import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat sebuah ArrayList
        ArrayList<String> isi = new ArrayList<>();
        
        // Menambahkan elemen ke dalam ArrayList
        isi.add("Apple");
        isi.add("Banana");
        isi.add("Orange");

        // Mengakses elemen dalam ArrayList
        //System.out.println("Element at index 0: " + isi.get(1));
        
        // Mengubah elemen dalam ArrayList
        //isi.set(1, "Mango");

        // Menghapus elemen dalam ArrayList
        /isi.remove(2);

        // Menampilkan semua elemen dalam ArrayList
        System.out.println("List elements: " + isi);
    }
}
