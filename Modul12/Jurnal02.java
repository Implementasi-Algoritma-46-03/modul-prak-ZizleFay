import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        int emptyCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 0) emptyCount++;
            }
        }

        String winner = "-"; 
        
        // Cek Baris dan Kolom
        for (int i = 0; i < n; i++) {
            boolean rowO = true, rowX = true;
            boolean colO = true, colX = true;
            for (int j = 0; j < n; j++) {
                if (board[i][j] != 1) rowO = false;
                if (board[i][j] != 2) rowX = false;
                if (board[j][i] != 1) colO = false;
                if (board[j][i] != 2) colX = false;
            }
            if (rowO || colO) winner = "O";
            if (rowX || colX) winner = "X";
        }

        // Cek Diagonal
        boolean diag1O = true, diag1X = true;
        boolean diag2O = true, diag2X = true;
        for (int i = 0; i < n; i++) {
            if (board[i][i] != 1) diag1O = false;
            if (board[i][i] != 2) diag1X = false;
            if (board[i][n - 1 - i] != 1) diag2O = false;
            if (board[i][n - 1 - i] != 2) diag2X = false;
        }

        if (diag1O || diag2O) winner = "O";
        if (diag1X || diag2X) winner = "X";

        if (winner.equals("-")) {
            if (emptyCount > 0) {
                System.out.println("?");
            } else {
                System.out.println("-");
            }
        } else {
            System.out.println(winner);
        }
    }
}