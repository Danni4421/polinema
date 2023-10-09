### Pertanyaan
1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk
      masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?
2. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor
   default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis
   konstruktor tersebut ?
3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut
   manakah yang bertipe object ?
4. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop
   memiliki relasi dengan class Processor ?
5. Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?
6. Pada class MainPercobaan1, terdapat baris kode:
   ```java
   Laptop l = new Laptop("Thinkpad", p);.
   ```
   Apakah p tersebut ?
   Dan apakah yang terjadi jika baris kode tersebut diubah menjadi:
   ```java
    Laptop l = new Laptop("Thinkpad", new Processor("Intel i5",3));
    ```
   Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ?

### Jawaban
1. Getter dan Setter pada masing masing attribute digunakan agar attribute tidak terekspose. sehingga untuk mengakses sebuah attribute harus melalui method. jika untuk mendapatkan nilai attribute menggunakan `Getter` dan jika ingin mengubah data attribute dapat menggunakan `Setter`
2. Pada class `Processor` dan juga `Laptop` terdapat dua method constructor dimana untuk membuat object dari class tersebut kita dapat memberikan nilai attribute ketika instansiasi menggunakan constructor berparameter dan juga dapat tidak memberikan nilai awal namun memberikan nya melalui `Setter`.
3. Attribute yang bertipe object dari class Laptop yaitu attribute `proc` dimana adalah attribute Object yang tereferensi pada class `Processor`.
4. ```java
    private Processor proc;
   ```
   statement berikut menunjukkan adanya relasi antara class Processor dengan class Laptop
5. `proc.info()` digunakan untuk mendapatkan informasi dari object Processor pada attribute Laptop.
6. Ketika merubah baris kode 
   ```java
   Laptop L = new Laptop("Thinkpad", p);
   ```
   Menjadi sebagai berikut: 
   ```java
   Laptop L = new Laptop("Thinkpad", new Processor("Intel i5", 3));
   ```
   Output: 
   ```
   Merk Laptop = Thinkpad
    Merk Processor = Intel i5
    Cache Memory = 3.00
    Merk Laptop = Thinkpad
    Merk Processor = Intel i5
    Cache Memory = 4.00
   ```
    maka tidak akan ada perubahan pada output yang dihasilkan karena memang tetap memberikan object Processor dengan nilai merk "Intel i5", dan cache 3
    pada parameter proc untuk constructor Laptop.

