1. Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance <br>
    **Jawab:**<br>
    Berdasarkan hasil percobaan, Class yang masih termasuk single inheritance adalah Manager dengan Karyawan karena tidak ada turunan lagi dari class Manager, Kemudian untuk multilevel inheritance yaitu pada class Staff sebagai subclass dari class Karyawan dan class Staff juga menjadi superclass untuk class StaffHarian dan StaffTetap <br><br>

2. Perhatikan kode program class StaffTetap dan StaffHarian, attribute apa saja yang dimiliki oleh class tersebut? Sebutkan attribute mana saja yang diwarisi dari class Staff<br>
    **Jawab:**<br>
    Attribute yang dimiliki oleh StaffTetap `golongan` dan `asuransi` kemudian untuk StaffHarian memiliki attribute `jmlJamKerja` dan keduanya memiliki attribute yang diwarisi dari super class `Staff` dan juga superclass dari superclass nya yaitu `Karyawan` karena termasuk multilevel inheritance <br><br>
3. Apakah fungsi potongan program berikut pada class StaffHarian
    ```java
    super(nama, alamat, jk, umur, gaji, lembur, potongan);
   ```
   **Jawab:**<br>
    Potongan kode diatas bertujuan untuk melakukan instansiasi pada super class dari clas StaffHarian, sehingga potongan diatas merujuk pada Konstruktor class Staff dengan parameter
    ```java
   public Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {...}
   ```
   Kemudian dari konstruktor Staff akan melakukan instansiasi pada super class nya juga yaitu Karyawan pada potongan kode berikut
    ```java
   super(nama, alamat, jk, umur, gaji);
   ```
4. Apakah fungsi potongan program berikut pada class StaffHarian
    ```java
   super.tampilDataStaff();
   ```
   **Jawab:**<br>
    Potongan kode diatas bertujuan untuk memanggil method tampilDataStaff() yang berada pada class Staff. Karena class StaffHarian merupakan subclass dari class Staff maka dapat menggunakan method dari superclass-nya hal ini ditujuan agar dapat mempermudah untuk menampilkan informasi tidak harus menuliskan kembali attribute superclass pada subclass-nya <br><br>
5. Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap
    ```java
   System.out.println("Gaji Bersih   =" + (gaji + lembur - potongan - asuransi));
   ```
   Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses
   langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji,
   lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur,
   dan potongan? <br>
    **Jawab:** <br>
    Pada program java jika sebuah class mewarisi class lain maka class tersebut akan memiliki juga attribute yang dapat dimiliki dari class lain tersebut. Untuk menggunakannya sendiri sebaiknya menggunakan keyword `super` agar attribute tersebut dapat diketahui bahwa berasal dari superclass-nya namun meskipun tidak menambahkan keyword `super` subclass tersebut tetap bisa menggunakan attribute superclass yang telah diwarisi.