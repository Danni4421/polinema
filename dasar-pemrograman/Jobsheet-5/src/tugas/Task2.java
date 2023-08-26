package tugas;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan menu: ");
        System.out.print("1. Luas\n2. Volume\nPilih menu [1,2]: ");
        int menu = sc.nextInt();

        if (menu == 1) {
            System.out.println("\nPilih bangun datar: ");
            System.out.print("a. Persegi\nb. Segitiga\nPilih bangun [a,b]: ");
            char bangunDatar = sc.next().charAt(0);

            switch (bangunDatar) {
                case 'a':
                    System.out.print("\nMasukkan sisi: ");
                    int sisi = sc.nextInt();
                    System.out.println("Luas persegi adalah " + (sisi * sisi));
                    break;
                case 'b':
                    System.out.print("\nMasukkan alas: ");
                    int alas = sc.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int tinggi = sc.nextInt();
                    System.out.println("Luas segitiga adalah " + (alas * tinggi) / 2);
                    break;
                default:
                    System.out.println("Tidak terdapat menu yang dipilih!");
            }
            
        } else if (menu == 2) {
            System.out.println("\nPilih bangun ruang: ");
            System.out.print("a. Kubus\nb. Tabung\nPilih bangun [a,b]: ");
            char bangunRuang = sc.next().charAt(0);

            switch (bangunRuang) {
                case 'a':
                    System.out.print("\nMasukkan sisi: ");
                    int sisi = sc.nextInt();
                    System.out.println("Volume kubus adalah " + (sisi * sisi * sisi));
                    break;
                case 'b':
                    System.out.print("\nMasukkan jari jari: ");
                    int jariJari = sc.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int tinggi = sc.nextInt();
                    System.out.println("Volume tabung adalah " + (3.14 * jariJari) * tinggi);
                    break;
                default:
                    System.out.println("Tidak tersedia menu yang dipilih");
            }
        } else {
            System.out.println("Menu tidak tersedia");
        }

        sc.close();
    }
}
