import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        long hasilFaktorial = faktorial(angka);
        System.out.println(hasilFaktorial);
        scanner.close();
    }

    public static long faktorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return (long) n * faktorial(n - 1);
        }
    }
}