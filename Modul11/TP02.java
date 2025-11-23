import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TP02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPeserta = 0;
        
        if (scanner.hasNextInt()) {
            jumlahPeserta = scanner.nextInt();
        }

        ArrayList<Integer> poinPeserta = new ArrayList<>();

        for (int i = 0; i < jumlahPeserta; i++) {
            if (scanner.hasNextInt()) {
                poinPeserta.add(scanner.nextInt());
            } else {
                break;
            }
        }

        Collections.sort(poinPeserta);

        for (int i = poinPeserta.size() - 1; i >= 0; i--) {
            System.out.print(poinPeserta.get(i));
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}