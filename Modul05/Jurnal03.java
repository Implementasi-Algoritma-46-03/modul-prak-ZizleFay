import java.util.Scanner;
import java.util.Locale;

public class Jurnal03 {

    public static void main(String[] args) {
        // Mengatur locale agar menggunakan titik sebagai pemisah desimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Meminta masukan bilangan, operator, dan bilangan
        int A = scanner.nextInt();
        char O = scanner.next().charAt(0);
        int B = scanner.nextInt();

        // Menggunakan switch-case untuk menentukan operasi
        switch (O) {
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                // Melakukan pembagian dengan hasil bilangan riil
                if (B != 0) {
                    // Casting salah satu operand ke double untuk hasil desimal
                    double hasilPembagian = (double) A / B;
                    System.out.printf("%.7f", hasilPembagian);
                } else {
                    System.out.println("Error: Tidak bisa melakukan pembagian dengan nol.");
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                break;
        }
        
        scanner.close();
    }
}