package tugas;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String code, train = "";
        double price = 0, admin = 50000, total;
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.print("Masukkan kode keberangkatan [pg/sg/mg/reg]: ");
        code = sc.next();
        System.out.println("=============================================");

        switch (code) {
            case "pg":
                train = "Eksekutif";
                price = 1250000;
                break;
            case "sg":
                train = "Bisnis";
                price = 137500;
                break;
            case "mg":
                train = "Luxury";
                price = 2500000;
                break;
            case "reg":
                train = "Regular";
                price = 500000;
                break;
        }

        total = price + admin;

        System.out.println("\n============ Tiket ============");
        System.out.println("Kode Keberangkatan\t: " + code);
        System.out.println("Kelas Kereta\t\t: " + train);
        System.out.println("Biaya Tiket\t\t: " + price);
        System.out.println("Biaya Administrasi\t: " + admin);
        System.out.println("Total Bayar\t\t: " + total);
        System.out.println("===============================");

        sc.close();
    }
}
