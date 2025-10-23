import java.util.Scanner;

public class TP02 { // Nama kelas UpperCamelCase

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca satu baris kalimat [cite: 7]
        String kalimatAsli = scanner.nextLine(); // Variabel lowerCamelCase

        // Memanggil method untuk menghapus vokal
        String kalimatSingkat = hapusVokal(kalimatAsli);

        // Menampilkan hasil kalimat tanpa vokal
        System.out.println(kalimatSingkat);

        scanner.close();
    }

    /**
     * Menghilangkan semua huruf vokal (a, e, i, o, u) dari sebuah string.
     * Pengecekan bersifat case-insensitive.
     *
     * @param kalimat Kalimat sumber (String)
     * @return Kalimat baru tanpa huruf vokal (String)
     */
    private static String hapusVokal(String kalimat) { // Method WAJIB private static
        // Menggunakan StringBuilder lebih efisien untuk membangun String
        StringBuilder builder = new StringBuilder();

        // Iterasi setiap karakter dalam string
        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            
            // Jika karakter BUKAN vokal, tambahkan ke hasil
            if (!isVokal(huruf)) {
                builder.append(huruf);
            }
        }
        return builder.toString();
    }

    private static boolean isVokal(char huruf) { // Method WAJIB private static
        // Ubah ke huruf kecil agar pengecekan case-insensitive
        char hurufKecil = Character.toLowerCase(huruf);
        
        return hurufKecil == 'a'
            || hurufKecil == 'e'
            || hurufKecil == 'i'
            || hurufKecil == 'o'
            || hurufKecil == 'u';
    }
}