package tugas;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double uas, uts, kuis, tugas, total;

        System.out.print("Masukkan nilai UAS: ");
        uas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = sc.nextDouble();
        System.out.print("Masukkan nilai KUIS: ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan nilai TUGAS: ");
        tugas = sc.nextDouble();

        total = (uas * 0.4) + (uts * 0.3) + (kuis * 0.1) + (tugas * 0.2);

        if (total > 100 || total < 0) {
            System.out.println("Maaf kamu melewati batas wajar nilai yang sesungguhnya :)");
        } else if (total < 65) {
            System.out.println("Nilai kamu: " + total);
            System.out.println("KAMU HARUS REMIDI!");
        } else {
            System.out.println("Nilai kamu: " + total);
            System.out.println("SELAMAT KAMU LULUS!");
        }

        sc.close();
    }
}
