import java.util.Scanner;

public class TP01 {

    public static void cetakGanjilGenap(int angkaSekarang, int batasAkhir) {
        if (angkaSekarang > batasAkhir) {
            return;
        }

        if (angkaSekarang % 2 == 0) {
            System.out.println(angkaSekarang + " Genap");
        } else {
            System.out.println(angkaSekarang + " Ganjil");
        }

        cetakGanjilGenap(angkaSekarang + 1, batasAkhir);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int batasInput = scanner.nextInt();

        cetakGanjilGenap(1, batasInput);

        scanner.close();
    }
}