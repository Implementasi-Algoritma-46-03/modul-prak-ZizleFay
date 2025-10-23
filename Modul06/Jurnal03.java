import java.util.Scanner;
public class Jurnal03 {
    public static double maxVol(double a, double b) {
        double phi = 3.14159;
        double maksVol = phi * (a * a) * b;
        return maksVol;
    }

    public static double tinggiAir(double c, double d) {
        double phi = 3.14159;
        double tinggiAir = phi * (c * c) * d;
        return tinggiAir;
    }

    public static double persentaseAir(double e, double f) {
        double persentase = (double)e / f * 100;
        return persentase;
    }

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt(); //jari-jari
        int h = input.nextInt(); //tinggi
        int t = input.nextInt(); //tinggi air

        double hasilVol = maxVol(r, h);
        double tinggiHasil = tinggiAir(r, t);
        double hasilPersentase = persentaseAir(t, h);

        System.out.printf("%.2f %.2f %.1f%%", hasilVol, tinggiHasil, hasilPersentase);
        
    }
}