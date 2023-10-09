package tugas;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int redPrice = 300000, bluePrice = 275000;
        double redDiscount = 0.3, blueDiscount = 0.5, total = 0;

        System.out.print("Jumlah item tanda merah: ");
        int redAmount = sc.nextInt();
        System.out.print("Jumlah item tanda biru: ");
        int blueAmount = sc.nextInt();

        double redTotal = redAmount * redPrice * (1 - redDiscount);
        double blueTotal = blueAmount * bluePrice * (1 - blueDiscount);
        total = redTotal + blueTotal;

        System.out.println("Total yang harus dibayarkan Susi adalah: " + total);

        sc.close();
    }
}
