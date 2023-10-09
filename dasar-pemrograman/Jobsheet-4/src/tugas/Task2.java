package tugas;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umur;

        System.out.print("Berapakah umur Anda sekarang: ");
        umur = sc.nextInt();

        System.out.println((umur >= 17) ? "Boleh Berkendara" : "Tidak Boleh Berkendara");
        sc.close();
    }
}
