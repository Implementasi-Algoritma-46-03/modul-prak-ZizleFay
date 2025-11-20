import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(num);
                num++;
                if (num > 9) {
                    num = 0;
                }
            }
            System.out.println();
        }
    }
}