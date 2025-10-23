import java.util.Scanner;
import java.lang.Math;

public class TP03 {

    // Konstanta PI sesuai soal dan style guide
    private static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namaBangun = scanner.nextLine();

        switch (namaBangun) {
            case "Persegi":
                hitungPersegi(scanner);
                break;
            case "Persegi Panjang":
                hitungPersegiPanjang(scanner);
                break;
            case "Segitiga":
                hitungSegitiga(scanner);
                break;
            case "Lingkaran":
                hitungLingkaran(scanner);
                break;
            default:
                System.out.println("Nama bangun datar tidak dikenal.");
        }

        scanner.close();
    }

    private static void hitungPersegi(Scanner scanner) { // Method WAJIB private static [cite: 27]
        int sisi = scanner.nextInt();
        int luas = sisi * sisi;
        int keliling = 4 * sisi;
        
        // Format keluaran [cite: 14]
        System.out.printf("%d %d\n", luas, keliling);
    }

    private static void hitungPersegiPanjang(Scanner scanner) { // Method WAJIB private static [cite: 27]
        int panjang = scanner.nextInt();
        int lebar = scanner.nextInt();
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);
        
        System.out.printf("%d %d\n", luas, keliling);
    }

    private static void hitungSegitiga(Scanner scanner) { // Method WAJIB private static [cite: 27]
        int alas = scanner.nextInt();
        int tinggi = scanner.nextInt();

        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        
        int luas = (int) (0.5 * alas * tinggi);
        int keliling = (int) (alas + tinggi + sisiMiring);

        System.out.printf("%d %d\n", luas, keliling);
    }

    private static void hitungLingkaran(Scanner scanner) { // Method WAJIB private static [cite: 27]
        int diameter = scanner.nextInt();
        double radius = diameter / 2.0;

        double luas = PI * radius * radius;
        double keliling = PI * diameter;

        System.out.printf("%.2f %.2f\n", luas, keliling);
    }
}