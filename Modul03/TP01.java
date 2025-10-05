import java.util.Scanner;
public class TP01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int n = input.nextInt();

        int total = x + (y * n);

        System.out.println(total);

        input.close();
    }
}