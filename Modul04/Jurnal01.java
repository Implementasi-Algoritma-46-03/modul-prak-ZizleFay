import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        // Memeriksa apakah N adalah faktor dari 24 DAN 56
        // Logikanya: 24 % N harus 0, dan 56 % N juga harus 0
        if (24 % N == 0 && 56 % N == 0) {
            System.out.println("Faktor dari 24 dan 56");
        } else {
            System.out.println("Bukan faktor dari 24 dan 56");
        }

        input.close();
    }
}