package tugas;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();
        int kelipatan =  (int) (nim % 10) + 2;
        System.out.print("Masukkan batas yang diinginkan: ");
        int batas = sc.nextInt();
        
        for (int i = 1; i <= batas; i++) {
            if (i % kelipatan == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        sc.close();
    }
}
