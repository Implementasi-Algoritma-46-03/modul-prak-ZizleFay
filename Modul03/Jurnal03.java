import java.util.Scanner;

public class Jurnal03 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        int P = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();

        double NA = (0.25 * P ) + (0.35 * A) + (0.4 * B);

        System.out.printf("%.2f", NA);
        System.out.println("\n" + "Lulus MK: " + (NA>= 75));

        
    }
}