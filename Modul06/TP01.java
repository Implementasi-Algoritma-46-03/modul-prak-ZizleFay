import java.util.Scanner;

public class TP01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca tiga buah bilangan riil (Fahrenheit)
        double fahrenheit1 = scanner.nextDouble(); // Variabel lowerCamelCase
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

        // Menampilkan keluaran sesuai format (2 angka desimal)
        System.out.printf("%.2f %.2f %.2f\n Celcius: ", celcius1, celcius2, celcius3);
        System.out.printf("%.2f %.2f %.2f\n Reamur: ", reamur1, reamur2, reamur3);

        scanner.close();
    }

    private static double fahrenheitToCelcius(double fahrenheit) { // Method WAJIB private static
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    private static double fahrenheitToReamur(double fahrenheit) { // Method WAJIB private static [cite: 27]
        return (fahrenheit - 32) * 4.0 / 9.0;
    }
}