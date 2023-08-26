package tugas;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        double priceA, priceB, priceC, discount, total;

        System.out.print("Masukkan Harga barang A: ");
        priceA = sc.nextDouble();
        System.out.print("Masukkan Jumlah barang A: ");
        a = sc.nextInt();
        System.out.print("Masukkan Harga barang B: ");
        priceB = sc.nextDouble();
        System.out.print("Masukkan Jumlah barang B: ");
        b = sc.nextInt();
        System.out.print("Masukkan Harga barang C: ");
        priceC = sc.nextDouble();
        System.out.print("Masukkan Jumlah barang C: ");
        c = sc.nextInt();

        total = ((priceA * a) + (priceB * b) + (priceC * c)); 

        if (total > 1000000) {
            discount = 0.1;
        } else if (total > 500000) {
            discount = 0.05;
        } else if (total > 200000) {
            discount = 0.02;
        } else {
            discount = 0;
        }

        System.out.println("-------------------------");
        System.out.println("\t Struk Nota");
        System.out.println("-------------------------");
        System.out.println("Nama Barang\t|\tHarga\t|\tJumlah\t|\tTotal");
        System.out.println("Barang A\t| " + priceA + "\t| " + a + "\t\t| " + (priceA * a));
        System.out.println("Barang A\t| " + priceB + "\t| " + b + "\t\t| " + (priceB * b));
        System.out.println("Barang A\t| " + priceC + "\t| " + c + "\t\t| " + (priceC * c));
        System.out.println("\t Total\t\t\t: " + total);
        System.out.println("\t Discount\t\t: " + (total * discount));
        System.out.println("\t Total Bayar\t\t: " + (total * (1 - discount)));

        sc.close();
    }
}
