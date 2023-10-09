### Pertanyaan
1. Di dalam method `info()` pada class KeretaApi, baris `this.masinis.info()` dan
   `this.asisten.info()` digunakan untuk apa ?
2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang
      sama. Tambahkan kode berikut pada method main() !
      ```java
      Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
      KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
      System.out.println(keretaApi.info()); 
      ```
3. Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ?
4. Perbaiki class KeretaApi sehingga program dapat berjalan !

### Jawaban
1. Pada method `info()` di class KeretaApi terdapat statement yang memanggil method `info()` dari attribute masinis dan juga method `info()` dari object asisten dimana akan mengembalikan informasi dari object Masinis dan juga object Asisten.
2. ```java
    Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
    KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
    System.out.println(keretaApi.info());
   ```
3. Hasil output dari perubahan `main` method tersebut yaitu sebagai berikut: 
    ```bash
   Cannot invoke "percobaan3.Pegawai.info()" because "this.asisten" is null
   ```
   terjadi error pada program tersebut dikarenakan `this.asisten` is null
4. Berdasarkan hasil output dari nomor 3 maka dapat diambil kesimpulan untuk memperbaiki kode program pada class KeretaApi di method `info()` yaitu dengan melakukan checking kepada attribute asisten apakah null atau tidak jika tidak maka akan menjalankan statement `asisten.info()`
    ```java
   public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        if (asisten != null) {
            info += "Asisten: " + this.asisten.info() + "\n";
        }
        return info;
    }
   ```