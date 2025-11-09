import java.util.Scanner;

public class TP02 {

    public static int hitungVokal(String kalimat, int index) {
        if (index >= kalimat.length()) {
            return 0;
        }

        char huruf = kalimat.charAt(index);
        int hitunganSaatIni = 0;
        if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
            hitunganSaatIni = 1;
        }

        return hitunganSaatIni + hitungVokal(kalimat, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();

        int totalVokal = hitungVokal(kalimat, 0);
        System.out.println(totalVokal);

        scanner.close();
    }
}