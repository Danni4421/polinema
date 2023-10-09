package percobaan3;

import java.util.Scanner;

public class DoWhileCuti1B03 {
       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           int cuti = 5;
           char konfirmasi;

           do {
               System.out.print("Apakah Anda menggunakan jatah cuti 1 hari (y/t)? ");
               konfirmasi = scan.next().charAt(0);

               if (konfirmasi == 'y' || konfirmasi == 'Y') {
                   cuti--;
                   System.out.printf("Sisa %d hari\n", cuti);
                   if (cuti == 2) {
                       System.out.println("STOP, Jatah cuti tinggal 2 hari!");
                       break;
                   }
               } else {
                System.out.print("Apakah Anda ingin menghentikan program (y/t)? ");
                if (scan.next().charAt(0) == 'y') {
                    break;
                }
               }

           } while (cuti > 0);

           scan.close();
       }
   }