<div style="text-align: center;">
    <h1>Jobsheet 7</h1>
    <h4>Perulangan 2</h4>
</div>

## Identitas Mahasiswa

> Nama : Aji Hamdani Ahmad <br/>
> Kelas : 1B <br/>
> Prodi : D-IV Teknik Informatika <br/>
> Jurusan : Teknologi Informasi <br/>

## 1. Tujuan

- Mahasiswa memahami konsep perulangan bersarang
- Mahasiswa dapat menjelaskan format penulisan perulangan bersarang (nested loop)
- Mahasiswa dapat mengimplementasikan flowchart perulangan bersarang menggunakan
  bahasa pemrograman Java

## 2. Alat dan Bahan

- PC/Laptop
- JDK
- Java IDE

## 3. Praktikum

### 3.1 Percobaan 1: Review Perulangan yang Lalu

1. Percobaan ini ditujukan me-review kembali perulangan yang sudah dibahas pada pertemuan
   sebelumnya. Pada percobaan 1 akan dibuat program untuk membuat tampilan \* sebanyak N
   kali ke arah samping.
2. Buat class baru dengan nama Star dan simpan dalam file `Star.java`
3. Buat fungsi/method main() di dalamnya.
   ```java
   public class Star {
    public static void main(String[] args) {
        // kode program
    }
   }
   ```
4. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner. Jadi
   tambahkan sintaks import di baris atas sendiri program.
   ```java
   import java.util.Scanner;
   ```
5. Di dalam fungsi main() yang telah dibuat, deklarasikan objek Scanner dengan nama sc.
   ```java
   Scanner sc = new Scanner(System.in);
   ```
6. Pada baris selanjutnya, tampilkan instruksi untuk memasukan nilai yang akan disimpan ke
   variabel N.
   ```java
   System.out.print("Masukkan nilai N = ");
   int N = sc.nextInt();
   ```
7. Pada baris selanjutnya, buat sintaks perulangan dengan for seperti di bawah ini.

   ```java
   for(int i=1; i<=N; i++){
     System.out.print("*");
   }
   ```

8. Compile dan jalan program!
9. Amati hasilnya, maka hasilnya harusnya akan serupa dengan tampilan di bawah ini.
   `Hasil compile`
   ```
   Masukkan nilai N = 5
   *****
   ```

### Pertanyaan

1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa
   bisa demikian?
2. Jika pada perulangan for, kondisi i <= N diubah menjadi i > N, apa akibatnya? Mengapa
   bisa demikian?
3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa
   bisa demikian?

### Jawaban

1. Karena sebelumnya `i` diinisialisasikan dengan nilai 1, maka jika `i` kemudian diganti dengan 0 maka perulangan akan dilakukan lebih 1 dari perulangan sebelumnya.
   `Hasil compile`
   ```
   Masukkan nilai N = 5
   ******
   ```
2. Jika kondisi dari perulangan dirubah menjadi `i > N` maka akan menyebabkan perulangan tidak dapat berjalan apabila `i` bernilai tidak lebih dari `N`, Namun ini akan menjadi masalah apabila nilai `N` lebih kecil dari `i` karena `i` terus bertambah secara incremental sedangkan `N` hanya stuck di value yang sama, Maka akan terjadi infinite loop.

   `Jika i < N`

   ```
   Masukkan nilai N = 5
   ```

   `Jika i > N`

   ```
   Masukkan nilai N = -1
   ******************************************************************************************************** dst
   ```

### 3.2 Percobaan 2: Bintang Persegi

1. Pada percobaan ke-2 akan dilakukan percobaan tentang nested loop. Kasus yang akan
   diselesaikan adalah untuk membuat tampilan bujursangkar \*, dengan panjang sisi sebanyak
   N. Misalkan N dimasukan 5, maka hasilnya adalah:

   ```
   *****
   *****
   *****
   *****
   *****
   ```

2. Kalau diamati lebih lanjut, sebenarnya mirip dengan kasus percobaan 1 bukan? Jika di
   percobaan 1, misal input N bernilai 5, maka yang akan dihasilkan adalah **\*** (kita bisa
   anggap ini sebagai inner loop yang mencetak 5 bintang **\***), maka untuk kasus percobaan
   2 ini bukankah hasil dari percobaan 1 tersebut hanya perlu diulang lagi sebanyak N kali?
   (dengan menambahkan outer loop untuk mengulangi proses inner loop sebanyak N kali.)
3. Buat class Square dan simpan dengan nama file `Square.java`
4. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner. Jadi
   tambahkan sintaks import di baris atas sendiri program.
   ```java
   import java.util.Scanner;
   ```
5. Buat method main(), dan isikan kode program yang sama dengan isi method main() di
   percobaan 1.

   ```java
   import java.util.Scanner;

   public class Square {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Masukkan nilai N = ");
           int N = sc.nextInt();
           for (int i = 0; i < N; i++) {
            System.out.print("*");
           }
       }
   }
   ```

6. Compile dan jalankan program!Dan pastikan program jalan seperti saat percobaan 1.

   `Hasil compile`

   ```
   Masukkan nilai N = 5
   ******
   ```

7. Perhatikan sintaks perulangan yang digunakan untuk mencetak \* sebanyak N kali ke arah
   samping. Di step-6 di atas kode for (kota merah) kita jadikan sebagai inner loop.

8. Kita looping lagi inner loop sebanyak N kali untuk menghasilkan output seperti tahap 1. Maka
   perlu ditambahkan perulangan luar (outer loop).
   ```java
   for(int iOuter=1; iOuter<=N; iOuter++){
       for(int i=1; i<=N; i++){
           System.out.print("*");
       }
       System.out.println();
   }
   ```
9. Simpan perubahan, compile dan jalankan program!
10. Amati hasilnya, maka hasilnya harusnya akan serupa dengan tampilan di bawah ini.
    ```
    Masukkan Nilai N = 5
    *****
    *****
    *****
    *****
    *****
    ```

### Pertanyaan

1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi
   iOuter=0, apa yang akibatnya? Mengapa bisa demikian?
2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan
   dalam, Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya?
   Mengapa bisa demikian?
3. Jadi, apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada
   didalamnya?
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan
   dalam? Apa akibatnya jika sintaks tersebut dihilangkan?

### Jawaban

1. Jika inisialisasi dari `iOuter = 1` maka jika nilai `N` sama dengan 5 maka looping akan dilakukan sebanyak 6 kali karena dimulai dari 0 dan syarat yaitu `i <= N`

   `iOuter == 1`

   ```
    *****
    *****
    *****
    *****
    *****
   ```

   `iOuter == 0`

   ```
    *****
    *****
    *****
    *****
    *****
    *****
   ```

2. Jika merubah `i` menjadi sama dengan 0 maka sama halnya seperti dengan `iOuter`. Jika kita membuat `iOuter` menjadi sama dengan 0 maka akan bertambahnya baris sedangkan jika mengubah `i` maka akan menambahkan untuk kolomnya.

   `iOuter == 1 AND i == 0`

   ```
    ******
    ******
    ******
    ******
    ******
   ```

3. Perulangan Luar (Outer loop) berguna untuk menjalankan perulangan didalamnya
   apabila perulangan luar berada dalam kondisi false maka perulangan dalam atau inner
   tidak akan dijalankan. Maka dari itu perulangan inner akan dijalankan apabila
   perulangan luar (Outer) dalam kondisi true. Outer loop diibaratkan sebagai lantai dan
   inner diibaratkan sebagai ruangan yang ada disetiap lantai.

4. Setelah perulangan `Inner` selesai maka akan menjalankan `System.out.println()` dengan tujuan untuk menambahkan baris baru dimana jika tidak ditambahkan statement tersebut maka output yang dihasilkan akan berada dalam satu line yang sama.

### 3.3 Percobaan 3: Bintang Segitiga

1. Pada percobaan ke-3 akan dilakukan percobaan segitiga \*, dengan sama siku dengan tinggi
   sebesar N. Misalkan N dimasukan 5, maka hasilnya adalah:

   ```
   *
   **
   ***
   ****
   *****
   ```

2. Buat class `Triangle` dan simpan dengan nama file `Triangle.java`
3. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner.
   ```java
   import java.util.Scanner;
   ```
4. Buat method main(), dan isikan kode program berikut kedalam method main().

```java
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 0;

        while(i <= N) {
        int j = 0;
            while(j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}
```

5. Compile dan jalankan program! Amati apa yang terjadi.

`Hasil compile`

```
***************
```

### Pertanyaan

1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan tampilan berikut?
   ```
   *
   **
   ***
   ****
   *****
   ```
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian
   yang perlu diperbaiki/ditambahkan.

### Jawaban

1. Output yang dihasilkan oleh kode program tersebut menghasilkan satu baris tidak berbentuk seperti segitiga.

2. Untuk membuat output seperti yang diharapkan kode program perlu ditambahkan statement untuk menambahkan new line seperti `System.out.println()`

   ```java
   while(i <= N) {
       int j = 0;
       while(j < i) {
           System.out.print("*");
           j++;
       }
       System.out.println();
       i++;
   }
   ```

### 3.4 Percobaan 4: Kuis Tebak Angka

1. Buat class baru dengan nama Triangle dan simpan dengan nama file Quiz.java.
   Import class Random dan class Scanner, di baris awal program.
   ```java
   import java.util.Scanner;
   import java.util.Random;
   ```
2. Buat fungsi main()
   ```java
   public class Kuis {
    public static void main(String[] args) {
        // kode program
    }
   }
   ```
3. Di dalam fungsi main() deklarasikan objek dari class Random dan class Scanner.
   Class Random, pada kasus ini digunakan untuk mengaccak angka.

   ```java
   Random random = new Random();
   Scanner input = new Scanner(System.in);
   ```

4. Kemudian pada baris selanjutnya, tambahkan sintaks seperti di bawah ini.

   ```java
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
            } while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while(menu=='y' || menu=='Y');
    }
   }
   ```

5. Compile dan jalankan program.

```
Tebak angka (1-10): 4
Tebak angka (1-10): 3
Tebak angka (1-10): 5
Tebak angka (1-10): 6
Apakah Anda ingin mengulang permainan (Y/y)?
```

6. Amati jalannya alur program tersebut.

### Pertanyaan

1. Jelaskan alur program diatas!
1. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulang) permainan
   tersebut?
1. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : input
   nilai tebakan yang dimasukkan oleh user apakah lebih kecil atau lebih besar dari
   jawaban / number yang di random!

### Jawaban

1. Program tersebut merupakan program kuis sederhana yang dimana akan dijalankan menggunakan do while loop. Program tersebut pertama akan melakukan generate angka random antara 1 hingga 10, Kemudian masuk pada `Inner` loop dimana pada Inner loop akan mengambil input number kemudian akan dicocokkan dengan random number yang sudah ter-generate pada Outer loop dan apabila angka tersebut sama maka program akan berhenti melakukan perulangan dan kemudian meminta konfirmasi apakah ingin mengulang game atau tidak, Jika iya maka akan generate ulang random number dan melakukan seperti sebelumnya

2. Pada program tersebut untuk tidak mengulang game bisa dengan memasukkan input berupa selain `y` sehingga program berhenti.

3. ```java
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
    }
   }
   ```

   ```
   Tebak angka (1-10): 2
   Angka yang anda masukkan lebih besar
   Tebak angka (1-10): 1
   Tebakan anda benar.
   Apakah Anda ingin mengulang permainan (Y/y)?
   ```

## 4. Tugas

1. Buatlah program untuk mencetak tampilan segitiga angka seperti di bawah ini berdasarkan
   input N (nilai N minimal 3). Contoh N = 5

   ```
       1
      12
     123
    1234
   12345
   ```

   ```java
   import java.util.Scanner;

   public class Task1 {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan nilai N = ");
         int n = sc.nextInt();

         for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n - i; j++) {
                  System.out.print(" ");
               }

               for (int k = 1; k <= i; k++) {
                  System.out.print(k);
               }

               System.out.println();
         }

         sc.close();
      }
   }
   ```

2. Buatlah program untuk mencetak tampilan segitiga bintang seperti di bawah ini berdasarkan
   input N (nilai N minimal 5). Contoh N = 7

   ```
   *******
   ******
   *****
   ****
   ***
   **
   *
   ```

   `Source Code`

   ```java
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
   ```

   `Output`

   ```
   Masukkan nilai N = 7
   *******
   ******
   *****
   ****
   ***
   **
   *
   ```

3. Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan
   input N (nilai N minimal 3). Contoh N = 3, dan N = 5

   ```
            5 5 5 5 5
            5       5
   3 3 3    5       5
   3   3    5       5
   3 3 3    5 5 5 5 5
   ```

   ```java
   import java.util.Scanner;

   public class Task3 {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan nilai N = ");
         int n = sc.nextInt();

         for (int i = 1; i <= n; i++) {
               for (int j = 1; j <= n; j++) {
                  if (i == 1 || j == 1 || i == n || j == n) {
                     System.out.print(n + " ");
                  } else {
                     System.out.print("  ");
                  }
               }
               System.out.println();
         }

         sc.close();
      }
   }
   ```

   `Hasil compile`

   ```
   Masukkan nilai N = 5
   5 5 5 5 5
   5       5
   5       5
   5       5
   5 5 5 5 5
   ```

4. Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan
   input N (nilai N minimal 5). Contoh N = 5

   ```
   12345
   54321
   12345
   54321
   12345
   ```

   ```java
   import java.util.Scanner;

   public class Task4 {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan nilai N = ");
         int n = sc.nextInt();

         for (int i = 0; i < n; i++) {
               if (i% 2 != 0) {
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

   ```

   `Hasil compile`

   ```
   Masukkan nilai N = 5
   12345
   54321
   12345
   54321
   12345
   ```
