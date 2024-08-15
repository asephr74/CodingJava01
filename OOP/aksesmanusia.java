public class aksesmanusia {
    public static void main(String[] args) {

        manusia orang = new manusia("budi", "cikarang");

        System.out.println(orang.ambilNama());
        System.out.println(orang.ambilAlamat());

        System.out.println();
        orang.ubahData("andi", "tasik");

        System.out.println(orang.ambilNama());
        System.out.println(orang.ambilAlamat());

        orang.hapus();

        System.out.println("Nama setelah dihapus: " + orang.ambilNama()); // Output: Nama setelah dihapus:
        System.out.println("Alamat setelah dihapus: " + orang.ambilAlamat());

    }

}
