import java.util.Scanner;


public class Jurnal01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        String nama1 = scanner.nextLine();
        String nama2 = scanner.nextLine();
        int waktu = scanner.nextInt();

        // Mendapatkan sapaan berdasarkan waktu menggunakan method
        String sapaan = getSapaan(waktu);

        System.out.println("Halo, " + nama1 + ". Selamat " + sapaan + ".");
        System.out.println("Halo, " + nama2 + ". Selamat " + sapaan + ".");

        scanner.close();
    }

    private static String getSapaan(int jam) {
        // Logika berdasarkan tabel sapaan
        if (jam >= 6 && jam <= 11) {
            return "pagi";
        } else if (jam >= 12 && jam <= 14) {
            return "siang";
        } else if (jam >= 15 && jam <= 17) {
            return "sore";
        } else {
            // Jam 18-05
            return "malam";
        }
    }
}