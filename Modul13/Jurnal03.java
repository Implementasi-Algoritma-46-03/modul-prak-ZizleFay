import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input Data
        int n = sc.nextInt();
        String[] barang = new String[n];
        for (int i = 0; i < n; i++) {
            barang[i] = sc.next();
        }
        String searchKey = sc.next();

        // 2. Sorting Ascending (Diperlukan sebelum Binary Search)
        // Kita gunakan Insertion Sort seperti di Jurnal02
        for (int i = 1; i < n; i++) {
            String key = barang[i];
            int j = i - 1;
            while (j >= 0 && barang[j].compareTo(key) > 0) {
                barang[j + 1] = barang[j];
                j = j - 1;
            }
            barang[j + 1] = key;
        }

        // 3. Binary Search Implementation
        int left = 0;
        int right = n - 1;
        int foundIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = searchKey.compareTo(barang[mid]);

            if (res == 0) {
                foundIndex = mid;
                break;
            }

            // Jika key lebih besar (lexicographically), cari di kanan
            if (res > 0) {
                left = mid + 1;
            } 
            // Jika key lebih kecil, cari di kiri
            else {
                right = mid - 1;
            }
        }

        // 4. Output
        if (foundIndex != -1) {
            System.out.println("Ditemukan di indeks ke-" + foundIndex);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}