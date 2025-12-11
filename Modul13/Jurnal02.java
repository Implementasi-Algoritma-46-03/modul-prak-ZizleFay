import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] barang = new String[n];
        
        for (int i = 0; i < n; i++) {
            barang[i] = sc.next();
        }

        // Insertion Sort Ascending (A-Z)
        for (int i = 1; i < n; i++) {
            String key = barang[i];
            int j = i - 1;
            
            // Bandingkan: jika barang[j] > key (secara leksikal), geser ke kanan
            while (j >= 0 && barang[j].compareTo(key) > 0) {
                barang[j + 1] = barang[j];
                j = j - 1;
            }
            barang[j + 1] = key;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(barang[i] + (i < n - 1 ? " " : ""));
        }
        System.out.println();
    }
}