package percobaan1;

import java.util.Scanner;

/**
 * PercobaanPemilihan103
 */
public class PercobaanPemilihan103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;

        System.out.print("Masukkan sebuah Bilangan: ");
        bil = input.nextInt();

        String output = (bil % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println(output);

        input.close();
    }

}