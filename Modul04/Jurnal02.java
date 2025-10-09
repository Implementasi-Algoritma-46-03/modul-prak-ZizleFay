import java.util.Scanner;
public class Jurnal02 {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double Pajak = 0;

        if (N <= 50)
            Pajak = 0.05;
        else if (N >= 51 && N <= 250)
            Pajak = 0.15;
        else if (N >= 251 && N <= 500)
            Pajak = 0.25;
        else if (N >= 501)
            Pajak = 0.3;
        
        int juta = N * 1000_000;
        double besarPajak = juta * Pajak;
        double hasilBersih = juta - besarPajak;
        System.out.println("Penghasilan kotor = Rp. " + N + " juta Rupiah");
        System.out.println("Pajak " + (int)(Pajak * 100) + "% = Rp " + (int)besarPajak);
        System.out.println("Penghasilan bersih = Rp. " +(int) hasilBersih);
    }
}
