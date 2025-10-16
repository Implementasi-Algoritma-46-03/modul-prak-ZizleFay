import java.util.Scanner;
public class TP03 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        String bangunDatar = input.nextLine();
        double luas = 0, keliling = 0;
        
        switch (bangunDatar) {
            case "Persegi":
                int sisi = input.nextInt();
                luas = sisi * sisi;
                keliling = 4 * sisi;
                break;
            case "Persegi Panjang":
                int panjang = input.nextInt();
                int lebar = input.nextInt();
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                break;
            case "Segitiga":
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                luas = (alas * tinggi) / 2;
                double t = (alas * alas + tinggi * tinggi);
                double x = 0.0;
                    if (alas > tinggi) {
                        x = alas;
                    } else {
                        x = tinggi;
                    }

                double miring = (x + (t / x)) / 2;
                keliling = alas + tinggi + miring;
                break;
            case "Lingkaran":
                int diameter = input.nextInt();
                double jari2 = diameter/2.0;
                luas = 3.14 * (jari2 * jari2);
                keliling = 2 * 3.14 * jari2;
                break;
        }
    
        // Output berbeda tergantung bangun datar
        if (bangunDatar.equals("Lingkaran")) {
            System.out.printf("%.2f %.2f", luas, keliling);
        } else {
            System.out.printf("%.0f %.0f", luas, keliling);
        }
    }
}