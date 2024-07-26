import java.util.Scanner;

public class loginpasssavearray2dimensi {
    public static void main(String[] args) {
        // Array untuk menyimpan username dan password
        String[][] users = {
            {"user1", "password1"},// [0,0] [0,1]
            {"user2", "password2"},// [1,0] [1,1]
            {"user3", "password3"} // [2,0] [2,1]
        };

        Scanner scanner = new Scanner(System.in);

        // Meminta username dari pengguna
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        // Meminta password dari pengguna
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Memeriksa apakah username dan password cocok dengan data pengguna yang ada
        boolean loginSuccess = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i][0].equals(username) && users[i][1].equals(password)) {
                loginSuccess = true;
                break;
            }
        }

        // Menampilkan pesan sesuai hasil login
        if (loginSuccess) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }

        scanner.close();
    }
}
