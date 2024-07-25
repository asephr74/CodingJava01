public class HitungRataRataarray {
    public static void main(String[] args) {
        // Misalkan kita memiliki sebuah array nilai
        int[] nilai = {80, 90, 70, 85, 95};

        // Variabel untuk menyimpan jumlah total nilai
        int ratarata = 0;

        // Menambahkan semua nilai dalam array ke variabel ratarata
        for (int i = 0; i < nilai.length; i++) {
            ratarata += nilai[i]; // Ini adalah bagian yang sedang kita bahas
        }

        // Menghitung rata-rata
        ratarata = ratarata / nilai.length;

        // Menampilkan hasil
        System.out.println("Rata-rata nilai: " + ratarata);
    }
}