<div style="text-align: center;">
    <h1>Jobsheet 6</h1>
    <h4>Perulangan 1</h4>
</div>

## Identitas Mahasiswa

> Nama : Aji Hamdani Ahmad <br/>
> Kelas : 1B <br/>
> Prodi : D-IV Teknik Informatika <br/>
> Jurusan : Teknologi Informasi <br/>

## 1. Tujuan

## 2. Praktikum

### Percobaan 1: Menghitung Bilangan Kelipatan Menggunakan FOR

Pada percobaan ini dilakukan pembuatan kode program untuk menampilkan bilangan
kelipatan angka tertentu dari rentang 1 sampai dengan 50 menggunakan perulangan FOR,
serta menghitung total dari bilangan-bilangan tersebut.

1. Buka text editor. Buat file baru, beri nama `ForKelipatanKelasNoAbsen.java`
2. Tuliskan struktur dasar bahasa pemrograman Java yang terdiri dari fungsi main()
   ```java
   public class ForKelipatan1B03 {
    public static void main(String[] args) {
        // kode program
    }
   }
   ```
3. Tambahkan library Scanner
   ```java
   import java.util.Scanner;
   ```
4. Buat deklarasi Scanner dengan nama scan
   ```java
   Scanner scan = new Scanner(System.in);
   ```
5. Buatlah variabel bertipe int dengan nama kelipatan, jumlah, dan counter. Inisialisasi
   variabel jumlah dan counter dengan nilai 0
   ```java
   int kelipatan, jumlah = 0, counter = 0;
   ```
6. Tambahkan kode berikut ini untuk menerima input dari keyboard

   ```java
   import java.util.Scanner;

   public class ForKelipatan1B03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();
    }
   }
   ```

7. Buat struktur perulangan FOR dengan kondisi pemilihan IF untuk menentukan
   bilangan kelipatan

   ```java
   import java.util.Scanner;

   public class ForKelipatan1B03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, total = 0, counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 0; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }
    }
   }
   ```

8. Tampilkan banyaknya bilangan kelipatan dan total bilangan kelipatan pada rentang 1
   sampai dengan 50.

   ```java
   import java.util.Scanner;

   public class ForKelipatan1B03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, total = 0, counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 0; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);

        scan.close();
    }
   }
   ```

9. Jalankan program tersebut. Cocokkan hasil compile kode program Anda dengan
   gambar berikut ini

   `Hasil compile`

   ```
   Masukkan bilangan kelipatan (1-9): 5
   Banyaknya bilangan 5 dari 1 sampai 50 adalah 11
   Total bilangan kelipatan 5 dari 1 sampai 50 adalah 275
   ```

### Pertanyaan

1. Terdapat tiga komponen perulangan pada sintaks FOR. Berdasarkan Percobaan 1
   tersebut, sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode
   program yang telah dibuat!
2. Jelaskan alur kerja dari potongan kode program berikut!

   ```java
   for (int i = 0; i <= 50; i++) {
        if (i % kelipatan == 0) {
            total += i;
            counter++;
        }
    }
   ```

3. Modifikasi kode program yang telah dibuat dengan menambahkan variabel baru untuk
   menghitung rata-rata dari seluruh bilangan kelipatan yang ditentukan!

### Jawaban

1. pada `FOR` terdapat 3 komponen antara lain:

   - `inisialisasi variable` bisa seperti `i`, `j`, `k` digunakan untuk nilai awal perulangan <br>
   - `statement / syarat` : memiliki tujuan apabila syarat terpenuhi maka perulangan akan dilakukan kembali. `syarat` ini juga dapat digunakan untuk menentukan batas akhir.
   - `update` digunakan untuk memanipulasi `variable` setelah perulangan sehingga perulangan tidak bersifat infinite nantinya.

2. Pada potongan kode program tersebut tertulis sintaks perulangan `FOR` yang akan
   mengulang perulangan dari satu dan dibatasi dengan syarat hingga 50 dan kemudian untuk
   `i++` dilakukan increment hingga syarat terpenuhi sampai `50`. Dan untuk kondisi dalam
   perulangan akan melakukan check terhadap modulus dari angka kelipatan apabila sama
   dengan 0 maka akan ditambahkan ke dalam variabel total dan kemudian variabel counter
   dilakukan increment untuk menghitung banyaknya angka kelipatan yang ada nantinya ketika
   kondisi pada if bernilai true.
3. ```java
    import java.util.Scanner;

    public class ForKelipatan1B03 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int kelipatan, total = 0, counter = 0;

            System.out.print("Masukkan bilangan kelipatan (1-9): ");
            kelipatan = scan.nextInt();

            for (int i = 0; i <= 50; i++) {
                if (i % kelipatan == 0) {
                    total += i;
                    counter++;
                }
            }

            System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
            System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
            System.out.println("Rata - rata dari kelipatan tersebut adalah : " + (total / counter));
            scan.close();
        }
    }
   ```

   `Hasil compile`

   ```
   Masukkan bilangan kelipatan (1-9): 5
   Banyaknya bilangan 5 dari 1 sampai 50 adalah 11
   Total bilangan kelipatan 5 dari 1 sampai 50 adalah 275
   Rata - rata dari kelipatan tersebut adalah : 25
   ```

### Percobaan 2: Menghitung Gaji Lembur Karyawan Menggunakan WHILE dan CONTINUE

Sebuah perusahaan memberikan gaji lembur kepada karyawannya setiap minggu. Gaji
tersebut dihitung berdasarkan jabatan karyawan dan jumlah jam lembur dalam seminggu.
Karyawan dengan jabatan “direktur” tidak mendapatkan tambahan gaji meskipun melakukan
lembur, karyawan dengan jabatan “manager” mendapatkan gaji lembur sebesar 100000 per
jam, sedangkan karyawan dengan jabatan “staf” mendapatkan gaji lembur sebesar 75000 per
jam. Pada percobaan ini dilakukan pembuatan kode program menggunakan WHILE dan
CONTINUE untuk menghitung pengeluaran perusahaan.

1.  Buka text editor. Buat file baru, beri nama `WhileGajiKelasNoAbsen.java`
2.  Tuliskan struktur dasar bahasa pemrograman Java yang terdiri dari fungsi main()
    ```java
    public class WhileGaji1B03 {
     public static void main(String[] args) {
         // kode program
     }
    }
    ```
3.  Tambahkan library Scanner
    ```java
    import java.util.Scanner;
    ```
4.  Buat deklarasi Scanner dengan nama scan
    ```java
    Scanner scan = new Scanner(System.in);
    ```
5.  Buatlah variabel bertipe int dengan nama karyawan, jam, gaji, dan jumlah. Inisialisasi
    variabel jumlah dengan nilai 0
    ```java
    public class WhileGaji1B03 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int karyawan, jam, gaji, jumlah = 0;
     }
    }
    ```
6.  Buatlah variabel bertipe String dengan nama jabatan
    ```java
    public class WhileGaji1B03 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int karyawan, jam, gaji, jumlah = 0;
         String jabatan;
     }
    }
    ```
7.  Tambahkan kode berikut ini untuk menerima input dari keyboard guna menentukan
    jumlah karyawan yang akan dihitung gajinya

    ```java
    public class WhileGaji1B03 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int karyawan, jam, gaji, jumlah = 0;
         String jabatan;

         System.out.print("Masukkan jumlah karyawan: ");
         karyawan = scan.nextInt();
     }
    }
    ```

8.  Buat struktur perulangan WHILE dengan kondisi pemilihan IF-ELSE dan CONTINUE
    untuk menentukan gaji lembur berdasarkan jabatan karyawan

    ```java
    import java.util.Scanner;

    public class WhileGaji1B03 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int karyawan, jam, gaji, jumlah = 0;
    String jabatan;

            System.out.print("Masukkan jumlah karyawan: ");
            karyawan = scan.nextInt();

            int i = 0;
            while (i < karyawan) {
                System.out.println("Pilihan jabatan - Direktur, Manager, Staf");
                System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
                jabatan = scan.next();
                System.out.print("Masukkan jam lembur: ");
                jam = scan.nextInt();
                i++;

                if (jabatan.equalsIgnoreCase("direktur")) {
                    continue;
                } else if (jabatan.equalsIgnoreCase("manager")) {
                    gaji = jam * 100000;
                } else {
                    gaji = jam * 75000;
                }

                jumlah += gaji;
            }

        }

    }
    ```

9.  Tampilkan hasil perhitungan jumlah gaji

    ```java
    import java.util.Scanner;

    public class WhileGaji1B03 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int karyawan, jam, gaji, jumlah = 0;
    String jabatan;

            System.out.print("Masukkan jumlah karyawan: ");
            karyawan = scan.nextInt();

            int i = 0;
            while (i < karyawan) {
                System.out.println("Pilihan jabatan - Direktur, Manager, Staf");
                System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
                jabatan = scan.next();
                System.out.print("Masukkan jam lembur: ");
                jam = scan.nextInt();
                i++;

                if (jabatan.equalsIgnoreCase("direktur")) {
                    continue;
                } else if (jabatan.equalsIgnoreCase("manager")) {
                    gaji = jam * 100000;
                } else {
                    gaji = jam * 75000;
                }

                jumlah += gaji;
            }

            System.out.println("Pengeluaran perusahaan " + jumlah);
            scan.close();
        }

    }
    ```

10. Jalankan program tersebut. Cocokkan hasil compile kode program Anda dengan
    gambar berikut ini

    `Hasil compile`

    ```
    Masukkan jumlah karyawan: 3
    Pilihan jabatan - Direktur, Manager, Staf
    Masukkan jabatan karyawan ke-1: manager
    Masukkan jam lembur: 1
    Pilihan jabatan - Direktur, Manager, Staf
    Masukkan jabatan karyawan ke-2: direktur
    Masukkan jam lembur: 20
    Pilihan jabatan - Direktur, Manager, Staf
    Masukkan jabatan karyawan ke-3: staf
    Masukkan jam lembur: 10
    Pengeluaran perusahaan 850000
    ```

### Pertanyaan

1. Tunjukkan bagian kode program yang digunakan sebagai syarat untuk menghentikan
   perulangan WHILE! Berapa kali perulangan dilakukan?
2. Pada potongan kode berikut,

   ```java
   if (jabatan.equalsIgnoreCase("direktur")) {
        continue;
    }
   ```

   Apa yang sebenarnya terjadi jika variabel jabatan berisi nilai “DIREKTUR”? Apa peran
   CONTINUE yang dituliskan di dalam sintaks perulangan?

3. Mengapa komponen update i++ diletakkan di posisi tengah, tidak di bagian akhir
   statement? Pindahkan i++ di bagian akhir, lalu jalankan kembali program dengan
   memasukkan “direktur” sebagai jabatan karyawan pertama. Apa yang terjadi? Jelaskan!

### Jawaban

1. Kondisi pada while yaitu `i < karyawan` merupakan block code yang digunakan sebagai syarat dimana ketika `i` sudah lebih dari sama dengan jumlah karyawan maka perulangan akan berhenti. Dan karena `i` secara incremental bertambah maka syarat tersebut dapat dicapai untuk dapat mengehentikan perulangan.

2. Keyword `continue` bertujuan untuk melewati statement yang ada dibawahnya dalam perulangan ketika menggunakan `continue` maka akan dilewati untuk perulangan tersebut.

3. ```
   Masukkan jumlah karyawan: 3
   Pilihan jabatan - Direktur, Manager, Staf
   Masukkan jabatan karyawan ke-1: direktur
   Masukkan jam lembur: 1
   Pilihan jabatan - Direktur, Manager, Staf
   Masukkan jabatan karyawan ke-1: direktur
   Masukkan jam lembur: 2
   Pilihan jabatan - Direktur, Manager, Staf
   Masukkan jabatan karyawan ke-1:
   ```

   Output tersebut didapatkan jika melakukan increment setelah pemilihan atau dibagian akhir

   ```java
   int i = 0;
    while (i < karyawan) {
        System.out.println("Pilihan jabatan - Direktur, Manager, Staf");
        System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
        jabatan = scan.next();
        System.out.print("Masukkan jam lembur: ");
        jam = scan.nextInt();

    if (jabatan.equalsIgnoreCase("direktur")) {
        continue;
    } else if (jabatan.equalsIgnoreCase("manager")) {
        gaji = jam * 100000;
    } else {
        gaji = jam * 75000;
    }

    i++;
   }
   ```

   Masalah tersebut terjadi karena ketika melakukan input `direktur` maka akan menjalankan keyword `continue` dimana akan menghiraukan statement yang ada dibawahnya. kemudian mengulang perulangan. Jika tidak dilakukan increment pada `i` sebelumnya maka ketika memilih `direktur` maka i tidak akan bertambah secara incremental namun akan tetap stuck pada nilai sebelumnya. sehingga ketika menerapkan kode seperti diatas lebih baik untuk melakukan incrementing sebelum menjalankan block statement seperti `continue` ataupun `break`

### Percobaan 3: Menghitung Jatah Cuti Menggunakan DO-WHILE dan BREAK

Pada percobaan ini dilakukan pembuatan kode program menggunakan DO-WHILE dan
BREAK untuk menghitung jatah cuti yang dimiliki oleh pagawai. Pegawai mempunyai jatah
cuti sebanyak 5 hari. Jatah cuti akan dikurangi perhati setiap kali digunakan. Saat jatah cuti
sisa 2 hari, pegawai mendapat peringatan untuk berhenti menggunakan jatah cutinya.

1. Buka text editor. Buat file baru, beri nama `DoWhileCutiKelasNoAbsen.java`
2. Tuliskan struktur dasar bahasa pemrograman Java yang terdiri dari fungsi main()
   ```java
   public class DoWhileCuti1B03 {
    public static void main(String[] args) {
        // kode program
    }
   }
   ```
3. Tambahkan library Scanner
   ```java
   import java.util.Scanner;
   ```
4. Buat deklarasi Scanner dengan nama scan
   ```java
   Scanner scan = new Scanner(System.in);
   ```
5. Buatlah variabel bertipe int dengan nama cuti dengan inisialisasi nilai sama dengan 5
   ```java
   int cuti = 5;
   ```
6. Buatlah variabel bertipe char dengan nama konfirmasi
   ```java
   char konfirmasi;
   ```
7. Buat struktur perulangan DO-WHILE untuk menerima input dari keyboard dan
   menghitung jatah cuti

   ```java
   import java.util.Scanner;

   public class DoWhileCuti1B03 {
       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           int cuti = 5;
           char konfirmasi;

           do {
               System.out.print("Apakah Anda menggunakan jatah cuti 1 hari (y/t)? ")
               konfirmasi = scan.next().charAt(0);

               if (konfirmasi == 'y' || konfirmasi == 'Y') {
                   cuti--;
                   System.out.printf("Sisa %d hari\n", cuti);
                   if (cuti == 2) {
                       System.out.println("STOP, Jatah cuti tinggal 2 hari!");
                       break;
                   }
               }

           } while (cuti > 0);
       }
   }
   ```

8. Jalankan program tersebut. Cocokkan hasil running program yang sudah Anda buat
   apakah sudah sesuai dengan tampilan berikut

   `Hasil compile`

   ```
   Apakah Anda menggunakan jatah cuti 1 hari (y/t)? y
   Sisa 4 hari
   Apakah Anda menggunakan jatah cuti 1 hari (y/t)? y
   Sisa 3 hari
   Apakah Anda menggunakan jatah cuti 1 hari (y/t)? y
   Sisa 2 hari
   STOP, Jatah cuti tinggal 2 hari!
   ```

### Pertanyaan

1. Apa kegunaan sintaks BREAK di dalam sintaks perulangan?
2. Jalankan kembali program tersebut. Pada saat input konfirmasi, ketikkan “Tidak”, apa
   yang terjadi? Mengapa demikian?
3. Modifikasi kode program sehingga saat pengguna mengetikkan “Tidak” sebagai input
   konfirmasi, maka program akan berhenti!

### Jawaban

1. `break` dalam perulangan digunakan untuk menghentikan proses perulangan yang berjalan, bahkan juga statement setelah break tidak akan dieksekusi. Sama halnya seperti `continue` namun `break` akan menghentikan perulangan secara langsung sedangkan `continue` hanya melewatkan perulangan pada kondisi tertentu

2. `Hasil compile`

   ```
   Apakah Anda menggunakan jatah cuti 1 hari (y/t)? y
   Sisa 4 hari
   Apakah Anda menggunakan jatah cuti 1 hari (y/t)? y
   Sisa 3 hari
   Apakah Anda menggunakan jatah cuti 1 hari (y/t)? t
   Apakah Anda menggunakan jatah cuti 1 hari (y/t)? t
   Apakah Anda menggunakan jatah cuti 1 hari (y/t)? t
   ```

   Berdasarkan hasil yang diperoleh program akan terus melakukan perulangan hingga sampai pada kondisi dimana jatah cuti sama dengan 2 apabila jatah cuti masih lebih dari 2 maka perulangan akan terus dijalankan.

3. `Source Code`

   ```java
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
   ```

   `Hasil compile`

   ```
   Apakah Anda menggunakan jatah cuti 1 hari (y/t)? t
   Apakah Anda ingin menghentikan program (y/t)? y
   ```

### Tugas

1.  Buatlah program menggunakan FOR, WHILE, atau DO-WHILE untuk menampilkan
    angka 1 hingga batas angka masukan pengguna secara berurutan dan melompati
    angka kelipatan X (X adalah digit terakhir NIM + 2), seperti tampilan berikut

    ```
    Masukkan batas angka: 20
    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
    ```

    ```java
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
    ```

    `Hasil compile`

    ```
    Masukkan NIM: 2241720155
    Masukkan batas yang diinginkan: 20
    1 2 3 4 5 6 8 9 10 11 12 13 15 16 17 18 19 20
    ```

2.  Sebuah tempat wisata memberlakukan harga tiket masuk yang berbeda untuk anak-
    anak dan orang dewasa. Anak-anak berusia kurang dari 15 tahun dikenakan harga
    sebesar Rp 50.000, sementara orang dewasa dikenakan harga tiket masuk sebesar Rp
    100.000. Pada hari Senin tanggal 1 Agustus 2022, kasir tempat wisata mulai mendata
    uang pemasukan dari pengunjung. Setiap hari Minggu (tanggal 7, 14, 21, dan 28)
    tempat wisata tersebut tutup dan tidak ada pemasukan dari pengunjung. Jika
    diasumsikan setiap harinya terdapat 5 pengunjung anak-anak dan 5 pengunjung
    dewasa, buatlah program untuk menentukan jumlah uang pemasukan yang diterima
    tempat wisata tersebut hingga akhir bulan Agustus 2022!
    Catatan: Jenis perulangan dapat berupa FOR, WHILE, atau DO-WHILE. Anda dapat
    memanfaatkan BREAK, CONTINUE, dan SENTINEL.

    ```java
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
    ```

    `Hasil compile`

    ```
    Total minggu ke-1 adalah 4500000
    Total minggu ke-2 adalah 9000000
    Total minggu ke-3 adalah 13500000
    Total minggu ke-4 adalah 18000000
    Total akhir bulan adalah 20250000
    ```
