import java.util.Scanner;
public class Jurnal01 {

    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);


        int N = inputScanner.nextInt();
        int M =inputScanner.nextInt();


        String namaMakanan = null;
        int hargaMakanan = 0;
        switch (N) {
            case 1:
                namaMakanan = "Nasi Goreng ";
                hargaMakanan = 15;
                break;
            case 2:
                namaMakanan = "Mie Goreng/nyemek ";
                hargaMakanan = 18;
                break;
            case 3:
                namaMakanan = "Kwetiau Goreng / Nyemek ";
                hargaMakanan = 20;
                break;
            case 4:
                namaMakanan = "Capcay Goreng/kuah ";
                hargaMakanan = 23;
                break;
                default:
                System.out.println("");
                return;
        }
        
        double totalHarga = hargaMakanan * M;
        System.out.println(namaMakanan + M + " buah, total harga Rp. " + totalHarga + "00");
    }
}