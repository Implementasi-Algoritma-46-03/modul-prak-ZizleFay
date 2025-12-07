import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = s.nextInt();
        }

        int kunci = s.nextInt();
        int sementara = -1;

        for (int i = 0; i < n; i++) {
            if (data[i] == kunci) {
                sementara = i;
                break;
            }
        }

        if (sementara != -1) {
            System.out.println("Ditemukan di indeks ke-" + sementara);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}