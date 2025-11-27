import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String trimmedInput = input.trim();
        String result = trimmedInput.replaceAll("\\s+", " ");

        System.out.println(result);
    }
}