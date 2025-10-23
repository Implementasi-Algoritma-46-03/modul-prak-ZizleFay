import java.util.Scanner;

public class Jurnal02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lirikAwal = scanner.nextLine();

        int panjangLirik = lirikAwal.length();
        int sisaBagi = panjangLirik % 5;

        char vokalPengganti = getVokalPengganti(sisaBagi);

        String lirikBaru = ubahVokal(lirikAwal, vokalPengganti);

        System.out.println(lirikBaru);

        scanner.close();
    }

    private static char getVokalPengganti(int sisa) {
        
        switch (sisa) {
            case 0:
                return 'a';
            case 1:
                return 'e';
            case 2:
                return 'i';
            case 3:
                return 'o';
            case 4:
                return 'u';
            default:
                return 'a';
        }
    }

    private static String ubahVokal(String lirik, char pengganti) {
        char penggantiLower = Character.toLowerCase(pengganti);
        char penggantiUpper = Character.toUpperCase(pengganti);
        
        StringBuilder lirikBaru = new StringBuilder();
        
        for (char c : lirik.toCharArray()) {
            // Cek apakah karakter adalah vokal (case-insensitive)
            if ("aiueo".indexOf(Character.toLowerCase(c)) != -1) {
                // Jika vokal, ganti dengan case yang sesuai
                if (Character.isUpperCase(c)) {
                    lirikBaru.append(penggantiUpper);
                } else {
                    lirikBaru.append(penggantiLower);
                }
            } else {
                // Jika bukan vokal, biarkan
                lirikBaru.append(c);
            }
        }
        return lirikBaru.toString();
    }
}