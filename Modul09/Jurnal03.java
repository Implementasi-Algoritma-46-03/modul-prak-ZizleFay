import java.util.Scanner;

public class Jurnal03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prima = true;
{
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }

        sc.close();
    }
}