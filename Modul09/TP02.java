import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        int jumlahVokal = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
                jumlahVokal++;
            }
        }

        System.out.println(jumlahVokal);
        scanner.close();
    }
}