package tugas;

public class Task2 {
    public static void main(String[] args) {
        int child = 50000, adult = 100000, total = 0;
        for (int i = 1; i <= 31; i++) {
            if (i % 7 == 0) {
                System.out.println("Total minggu ke-"+ (i / 7) + " adalah " + total );
                continue;
            }
            total += (5 * child) + (5 * adult);
        }

        System.out.println("Total akhir bulan adalah " + total);
    }
}
