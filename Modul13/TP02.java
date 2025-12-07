import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner s = new Scanner(System.in);

        int n = 10; 
        
        double[] gel1 = new double[n];
        double[] gel2 = new double[n];

        for (int i = 0; i < n; i++) {
            gel1[i] = s.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            gel2[i] = s.nextDouble();
        }

        for (int i = 1; i < n; i++) {
            double kunci = gel1[i];
            int j = i;

            for (; j > 0 && gel1[j - 1] < kunci; j--) {
                gel1[j] = gel1[j - 1];
            }
            gel1[j] = kunci;
        }

        for (int i = 1; i < n; i++) {
            double kunci = gel2[i];
            int j = i;

            for (; j > 0 && gel2[j - 1] < kunci; j--) {
                gel2[j] = gel2[j - 1];
            }
            gel2[j] = kunci;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f", gel1[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f", gel2[i]);
            if (i < n - 1) System.out.print(" ");
        }
    }
}