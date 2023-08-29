package tugas;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
 