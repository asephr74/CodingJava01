
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        // Contoh array
        int[] numbers = {20, 5, 7, 2, 11, 6, 4, 7, 0, 1};

        // Panggil fungsi untuk mencari nilai maksimum
        int maxValue = findMax(numbers);

        // Cetak hasilnya
        System.out.println("Nilai maksimum dalam array adalah: " + maxValue);
    }

    // Fungsi untuk mencari nilai maksimum dalam array
    public static int findMax(int[] array) {
        // Inisialisasi max dengan elemen pertama dalam array
        int max = array[0];

        // Iterasi melalui seluruh elemen dalam array
        for (int i = 1; i < array.length; i++) {
            // Jika elemen saat ini lebih besar dari max, perbarui max
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Kembalikan nilai maksimum
        return max;
    }
}
