1. Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas <br />
    **Jawab:**

   | Super Class | Sub Class      |
   |-------------|----------------|
   | Karyawan    | Manager, Staff |

2. Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain
    <br><br>
    **Jawab:** <br>
    Pada program java keyword untuk menurunkan suatu class ke class yang lain menggunakan `extends`<br><br>

3. Perhatikan kode program pada class Manager, attribute apa saja yang dimiliki oleh class tersebut? Sebutkan attribute mana saja yang diwarisi dari class karyawan
    <br><br>
    **Jawab:**<br>
    Attribute yang dimiliki oleh class Manager adalah `tunjangan`, Namun class tersebut juga mewarisi attribute dari class Karyawan yaitu antara lain : `nama, alamat, jk, umur, gaji` <br><br>

4. Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager
    ```java
   System.out.println("Total Gaji     =" + (super.gaji + tunjangan))
   ```
    **Jawab:**<br>
    Keyword `super` merujuk pada komponen pada super class yang dapat diwarisi oleh sub class seperti pada class Manager yang dapat mewarisi method `tampilDataKaryawan()` yang merujuk pada class Karyawan menggunakan `super.tampilDataKaryawan()` <br><br>
5. Program pada percobaan 1 diatas termasuk pada jenis inheritance apa? Jelaskan alasannya!
    <br><br>
    **Jawab:**<br>
    Pada percobaan diatas termasuk pada jenis Hierarchical Iheritance karena kelas karyawan memiliki lebih dari satu kelas turunan atau subclass atau bisa dibilang lebih dari satu subclass tersebut mewarisi class `Karyawan`