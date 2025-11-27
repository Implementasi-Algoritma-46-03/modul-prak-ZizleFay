import java.util.Scanner;
import java.util.ArrayList;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaPeserta = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("-")) {
                break;
            }
            namaPeserta.add(input);
        }

        for (int i = 0; i < namaPeserta.size(); i++) {
            System.out.println("Bulan " + (i + 1) + ": " + namaPeserta.get(i));
        }
    }
}