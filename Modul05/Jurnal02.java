import java.util.Scanner;

public class Jurnal02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String H = scanner.nextLine();
        int N = scanner.nextInt();

        int nomorHariAwal = 0;
        
        // Konversi nama hari ke representasi angka (0-6)
        switch (H.toLowerCase()) {
            case "senin":
                nomorHariAwal = 0;
                break;
            case "selasa":
                nomorHariAwal = 1;
                break;
            case "rabu":
                nomorHariAwal = 2;
                break;
            case "kamis":
                nomorHariAwal = 3;
                break;
            case "jumat":
                nomorHariAwal = 4;
                break;
            case "sabtu":
                nomorHariAwal = 5;
                break;
            case "minggu":
                nomorHariAwal = 6;
                break;
            default:
                System.out.println("Nama hari tidak valid.");
                scanner.close();
                return;
        }

        // Menghitung nomor hari tujuan menggunakan operasi modulus
        int nomorHariTujuan = (nomorHariAwal + N) % 7;

        String namaHariTujuan = "";
        
        // Konversi hasil perhitungan angka kembali ke nama hari
        switch (nomorHariTujuan) {
            case 0:
                namaHariTujuan = "Senin";
                break;
            case 1:
                namaHariTujuan = "Selasa";
                break;
            case 2:
                namaHariTujuan = "Rabu";
                break;
            case 3:
                namaHariTujuan = "Kamis";
                break;
            case 4:
                namaHariTujuan = "Jumat";
                break;
            case 5:
                namaHariTujuan = "Sabtu";
                break;
            case 6:
                namaHariTujuan = "Minggu";
                break;
        }

        System.out.println(namaHariTujuan);
        
        scanner.close();
    }
}