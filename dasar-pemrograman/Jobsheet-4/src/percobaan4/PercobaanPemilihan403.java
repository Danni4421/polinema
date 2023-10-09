package percobaan4;

import java.util.Scanner;

public class PercobaanPemilihan403 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = input.next().charAt(0);

        switch(operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
            default: 
                System.out.println("Operator yang Anda masukkan salah!");
        }

        input.close();
    }
}
