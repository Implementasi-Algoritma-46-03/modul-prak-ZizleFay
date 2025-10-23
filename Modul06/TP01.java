import java.util.Scanner;

// Nama kelas harus TP01 sesuai file
public class TP01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca tiga buah bilangan riil (Fahrenheit)
        double fahrenheit1 = scanner.nextDouble(); 
        double fahrenheit2 = scanner.nextDouble();
        double fahrenheit3 = scanner.nextDouble();

        // Menghitung konversi Celcius menggunakan method
        double celcius1 = fahrenheitToCelcius(fahrenheit1);
        double celcius2 = fahrenheitToCelcius(fahrenheit2);
        double celcius3 = fahrenheitToCelcius(fahrenheit3);

        // Menghitung konversi Reamur menggunakan method
        double reamur1 = fahrenheitToReamur(fahrenheit1);
        double reamur2 = fahrenheitToReamur(fahrenheit2);
        double reamur3 = fahrenheitToReamur(fahrenheit3);

        // Menampilkan keluaran sesuai format AUTOGRADER
        // Celcius: 1 angka desimal (%.1f) dan diberi label
        System.out.printf("Celcius: %.1f %.1f %.1f\n", celcius1, celcius2, celcius3);
        // Reamur: 2 angka desimal (%.2f) dan diberi label
        System.out.printf("Reamur: %.2f %.2f %.2f\n", reamur1, reamur2, reamur3);

        scanner.close();
    }

    /**
     * Mengkonversi suhu dari Fahrenheit ke Celcius.
     * @param fahrenheit Suhu dalam Fahrenheit (double)
     * @return Suhu dalam Celcius (double)
     */
    private static double fahrenheitToCelcius(double fahrenheit) { 
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    /**
     * Mengkonversi suhu dari Fahrenheit ke Reamur.
     * @param fahrenheit Suhu dalam Fahrenheit (double)
     * @return Suhu dalam Reamur (double)
     */
    private static double fahrenheitToReamur(double fahrenheit) { 
        return (fahrenheit - 32) * 4.0 / 9.0;
    }
}