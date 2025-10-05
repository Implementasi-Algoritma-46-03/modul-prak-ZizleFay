import java.util.Scanner;


public class TP03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int D = input.nextInt();
        int R = input.nextInt();
        int I = input.nextInt();

        if (D > R && D > I) {
            System.out.println("Dira");
        } else if (R > D && R > I) {
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
        }

        input.close();
    }
}