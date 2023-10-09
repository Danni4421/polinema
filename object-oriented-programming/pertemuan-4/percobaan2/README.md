### Pertanyaan
1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class
   Pelanggan memiliki relasi dengan class Mobil dan class Sopir ?
2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method
   hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus
   memiliki argument hari ?
3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah
   mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ?
4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan
   p.setSopir(s) ?
5. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal()
   tersebut ?
6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method
   main dan amati perubahan saat di‑run!
    ```java
    System.out.println(p.getMobil().getMerk());
    ```
   Jadi untuk apakah sintaks `p.getMobil().getMerk()` yang ada di dalam method
   main tersebut?

### Jawaban 
1. class Pelanggan memiliki relasi agregasi dengan class Mobil dan class Sopir dimana ditunjukkan pada baris kode
   ```java
    private Mobil mobil;
    private Sopir sopir;
   ```
2. method `hitungBiayaMobil` pada object Mobil dan juga method `hitungBiayaSopir` dari object Sopir membutuhkan argument hari yaitu karena menghitung biaya harus berdasarkan jumlah hari yang berasal dari object Pelanggan.
3. method `hitungBiayaMobil(hari)` dan `hitungBiayaSopir(hari)` digunakan untuk mendapatkan biaya menyewa mobil dan sopir berdasarkan hari Pelanggan menyewa Mobil dan Sopir.
4. sintaks `p.setSopir(p)` dan `p.setMobil(m)` digunakan untuk melakukan inisialisasi pada attribute Sopir dan juga Mobil pada object Pelanggan dengan Object Mobil dan juga Sopir yang telah diinginkan.
5. proses hitung `p.hitungBiayaTotal()` akan mendapatkan hasil total dari `hitungBiayaMobil()` dan juga `hitungBiayaSopir()`.
6. ```
   Biaya Total = 1100000
   Avanza
   ```
   Hasil compile dari `MainPercobaan2` akan menghasilkan output seperti diatas.
   sintaks `p.getMobil().getMerk()` digunakan untuk mendapatkan merk pada object Mobil yang dimiliki oleh Pelanggan
