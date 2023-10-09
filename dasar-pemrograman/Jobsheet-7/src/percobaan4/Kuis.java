package percobaan4;

import java.util.Random;
import java.util.Scanner;

public class Kuis {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu='y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
                if (answer < number) {
                    System.out.println("Angka yang anda masukkan lebih kecil");
                } else if (answer > number) {
                    System.out.println("Angka yang anda masukkan lebih besar");
                } else {
                    System.out.println("Tebakan anda benar.");
                }
            } while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while(menu=='y' || menu=='Y');

        input.close();
    }
   }
