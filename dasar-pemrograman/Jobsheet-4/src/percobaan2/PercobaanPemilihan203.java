package percobaan2;

import java.util.Scanner;

/* 
public class PercobaanPemilihan203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan sebuah Bilangan: ");
        nilai = input.nextInt();

        if (nilai >= 100) {
            nilai += 10;
        } else {
            nilai -= 10;
        }

        System.out.println("Hasil Nilai Akhir adalah " + nilai);
        input.close();
    }
}

*/

//  hasil modifikasi

public class PercobaanPemilihan203 {
    public static void main(String[] args) {
        int nilai1, nilai2, average;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai 2: ");
        nilai2 = input.nextInt();

        average = (nilai1 + nilai2) / 2;

        if (average >= 100) {
            average -= 5;
        } else {
            System.out.println(average);
        }

        System.out.println("Hasil Nilai Akhir adalah " + average);

        input.close();
    }
}