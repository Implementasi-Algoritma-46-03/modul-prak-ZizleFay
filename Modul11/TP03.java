import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        
        String kalimatTrimmed = kalimat.trim();
        
        if (kalimatTrimmed.isEmpty()) {
            System.out.println(0);
        } else {
            String[] kata = kalimatTrimmed.split("\\s+");
            System.out.println(kata.length);
        }
    }
}