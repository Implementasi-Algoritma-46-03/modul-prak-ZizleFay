import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int value = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (value <= n * n) {
            // Ke Bawah
            for (int i = top; i <= bottom && value <= n * n; i++) {
                matrix[i][left] = value++;
            }
            left++;

            // Ke Kanan
            for (int i = left; i <= right && value <= n * n; i++) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            // Ke Atas
            for (int i = bottom; i >= top && value <= n * n; i--) {
                matrix[i][right] = value++;
            }
            right--;

            // Ke Kiri
            for (int i = right; i >= left && value <= n * n; i--) {
                matrix[top][i] = value++;
            }
            top++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + (j == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}