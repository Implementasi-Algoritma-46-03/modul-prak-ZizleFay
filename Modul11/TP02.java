import java.util.Scanner;
import java.util.Arrays;

public class TP02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPeserta = scanner.nextInt();
        int[] poinPeserta = new int[jumlahPeserta];

        for (int i = 0; i < jumlahPeserta; i++) {
            poinPeserta[i] = scanner.nextInt();
        }

        Arrays.sort(poinPeserta);

        for (int i = jumlahPeserta - 1; i >= 0; i--) {
            System.out.print(poinPeserta[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}