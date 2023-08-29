package tugas;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (i% 2 == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j);
                }
            } else {
                for (int k = 5; k > 0; k--) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
