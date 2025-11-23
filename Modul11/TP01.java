import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPeserta = scanner.nextInt();
        String[] namaPeserta = new String[jumlahPeserta];

        for (int i = 0; i < jumlahPeserta; i++) {
            namaPeserta[i] = scanner.next();
        }

        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.println("Bulan " + (i + 1) + ": " + namaPeserta[i]);
        }
    }
}