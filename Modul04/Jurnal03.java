import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int D = input.nextInt();
        int R = input.nextInt();
        int I = input.nextInt();

        String Dira = "Dira";
        String Radi = "Radi";
        String Idar = "Idar";

        System.out.print("nama pemilik nilai terendah hingga tertinggi: ");

        if (D <= R && R <= I) {
            System.out.println(Dira + ", " + Radi + ", " + Idar);
        } else if (D <= I && I <= R) {
            System.out.println(Dira + ", " + Idar + ", " + Radi);
        } else if (R <= D && D <= I) {
            System.out.println(Radi + ", " + Dira + ", " + Idar);
        } else if (R <= I && I <= D) {
            System.out.println(Radi + ", " + Idar + ", " + Dira);
        } else if (I <= D && D <= R) {
            System.out.println(Idar + ", " + Dira + ", " + Radi);
        } else { // I <= R && R <= D
            System.out.println(Idar + ", " + Radi + ", " + Dira);
        }


        input.close();
    }
}