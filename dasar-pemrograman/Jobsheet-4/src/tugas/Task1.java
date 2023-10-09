package tugas;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, selisih1, selisih2;

        System.out.print("Masukkan nilai ke 1 \t : ");
        num1 = input.nextInt();
        System.out.print("Masukan nilai ke 2 \t : ");
        num2 = input.nextInt();
        
        if (num1 > num2) {
            selisih1 = num1 - num2;
            System.out.println("Nilai ke 1 lebih besar " + selisih1 + " dari pada nilai ke 2");
        } else {
            selisih2 = num2 - num1;
            System.out.println("Nilai ke 2 lebih besar " + selisih2 + " dari pada nilai ke 1");
        }

        input.close();
    }
}
