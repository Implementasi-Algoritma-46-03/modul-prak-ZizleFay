import java.util.Scanner;
public class TP02 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int N = inputScanner.nextInt();
        int kodeHari = (5 + N) % 7;
        String namaHariPerancis;

        switch (kodeHari) {
            case 0:
                namaHariPerancis = "dimanche";
                break;
            case 1:
                namaHariPerancis = "lundi";
                break;
            case 2:
                namaHariPerancis = "mardi";
                break;
            case 3:
                namaHariPerancis = "mercredi";
                break;
            case 4:
                namaHariPerancis = "jeudi";
                break;
            case 5:
                namaHariPerancis = "vendredi";
                break;
            case 6:
                namaHariPerancis = "samedi";
                break;
            default:
                namaHariPerancis = "Hari tidak valid.";
                break;
        }

        System.out.println(namaHariPerancis);

        inputScanner.close();
    }
}