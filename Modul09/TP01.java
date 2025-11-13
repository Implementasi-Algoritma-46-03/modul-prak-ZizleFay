import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int batasAngka = scanner.nextInt();

        for (int i = 1; i <= batasAngka; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Genap");
            } else {
                System.out.println(i + " Ganjil");
            }
        }
        scanner.close();
    }
}