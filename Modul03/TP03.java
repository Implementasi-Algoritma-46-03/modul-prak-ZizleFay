import java.util.Scanner;

public class TP03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int T = input.nextInt();

        int jumlahOrang = T + 1;

        int jatahPerOrang = N / jumlahOrang;

        int sisaPermen = N % jumlahOrang;

        System.out.println(jatahPerOrang);
        System.out.println(sisaPermen);

        input.close();
    }
}