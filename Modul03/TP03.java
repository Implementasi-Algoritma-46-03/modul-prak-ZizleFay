import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        int JumlahPermen = 12;
        int JumlahTemanDira = 3;

        int TotalOrang = JumlahTemanDira + 1; // plus dira

        int Jatah = JumlahPermen / TotalOrang;
        int Sisa = JumlahPermen % TotalOrang;

        System.out.println("==Masukan #1==");
        System.out.println("Jumlah Permen Masing-Masing : " + Jatah);
        System.out.println("Sisa Permen Dira : " + Sisa);
        System.out.println();

        int JumlahPermen2 = 20;
        int JumlahTemanDira2 = 2;

        int TotalOrang2 = JumlahTemanDira2 + 1; // plus dira

        int Jatah2 = JumlahPermen2 / TotalOrang2;
        int Sisa2 = JumlahPermen2 % TotalOrang2;
        System.out.println("==Masukan #2==");
        System.out.println("Jumlah Permen Masing-Masing : " + Jatah2);
        System.out.println("Sisa Permen Dira : " +Sisa2);
    }
}
