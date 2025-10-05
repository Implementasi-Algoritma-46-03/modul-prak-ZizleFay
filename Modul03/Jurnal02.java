import java.util.Scanner;

public class Jurnal02 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        double median = (A + B + C) / 3.0;
        
        System.out.printf("%.2f", median);

        
    }
}