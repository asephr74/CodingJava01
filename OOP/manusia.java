public class manusia {
    // Instance variables
    private String nama;
    private String alamat;

    // Constructor
    public manusia(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Method to update the name and address
    public void ubahData(String namaBaru, String alamatBaru) {
        this.nama = namaBaru;
        this.alamat = alamatBaru;
    }

    // Method to get the name
    public String ambilNama() {
        return this.nama;
    }

    // Method to get the address
    public String ambilAlamat() {
        return this.alamat;
    }

    // Method to clear the name and address
    public void hapus() {
        this.nama = "";
        this.alamat = "";
    }
}