package percobaan2;

import java.util.Scanner;

public class PercobaanPemilihan2 {
    public static void main(String[] args) {
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan kategori [pekerja/pebisnis]: ");
        kategori = scan.nextLine();
        System.out.print("Masukkan besarnya penghasilan: ");
        penghasilan = scan.nextInt();

        if (penghasilan > 0) {
            if (kategori.equalsIgnoreCase("pekerja")) {
                if (penghasilan <= 2000000) {
                    pajak = 0.1;
                } else  if (penghasilan <= 3000000) {
                    pajak = 0.15;
                } else {
                    pajak = 0.2;
                }

                gajiBersih = (int) (penghasilan - (penghasilan * pajak));
                System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
            } else if (kategori.equalsIgnoreCase("pebisnis")) {
                if (penghasilan <= 2500000) {
                    pajak = 0.15;
                } else if (penghasilan <= 3500000) {
                    pajak = 0.2;
                } else {
                    pajak = 0.25;
                }

                gajiBersih = (int) (penghasilan - (penghasilan * pajak));
                System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
            } else {
                System.out.println("Kategori yang Anda masukkan salah!");
            }
        } else {
            System.out.println("Penghasilan yang Anda masukkan tidak valid!");
        }

        scan.close();
    }
}
