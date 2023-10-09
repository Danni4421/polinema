package tugas;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float suhu, celcius, reaumur, fahrenheit, kelvin;

        System.out.print("Masukkan suhu: ");
        suhu = sc.nextFloat();

        celcius = suhu;
        reaumur = (4 * celcius) / 5;
        fahrenheit = ((9 * celcius) / 5) + 32;
        kelvin = celcius + 273;

        System.out.println("Suhu dalam Celcius: " + celcius);
        System.out.println("Suhu dalam Reaumur: " + reaumur);
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        System.out.println("Suhu dalam Kelvin: " + kelvin);

        sc.close();
    }
}
