import java.util.Scanner;
import java.util.ArrayList;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> angkaList = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            angkaList.add(input);
        }

        int modus = 0;
        int maxFrekuensi = 0;

        for (int i = 0; i < angkaList.size(); i++) {
            int angkaSaatIni = angkaList.get(i);
            int frekuensiSaatIni = 0;

            for (int j = 0; j < angkaList.size(); j++) {
                if (angkaList.get(j) == angkaSaatIni) {
                    frekuensiSaatIni++;
                }
            }

            if (frekuensiSaatIni > maxFrekuensi) {
                maxFrekuensi = frekuensiSaatIni;
                modus = angkaSaatIni;
            } else if (frekuensiSaatIni == maxFrekuensi) {
                if (angkaSaatIni > modus) {
                    modus = angkaSaatIni;
                }
            }
        }

        System.out.println(modus);
    }
}