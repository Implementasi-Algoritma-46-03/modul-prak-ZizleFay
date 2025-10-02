
import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
    Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int lembarSeribu = n / 1000;
        int sisaUang = n % 1000;

        System.out.println(lembarSeribu);
        System.out.println(sisaUang);

    }
}