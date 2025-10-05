import java.util.Scanner;
public class TP01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();
        int N = input.nextInt();

        int total = X + (Y * N);

        System.out.println(total);

        input.close();
    }
}