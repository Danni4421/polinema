### Pertanyaan
1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam
   Gerbong A ?
2. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode
   tersebut ?
   ```java
   if (this.penumpang != null) {
      info += "Penumpang: " + penumpang.info() + "\n";
   }
   ```
3. Mengapa pada method `setPenumpang()` dalam class Gerbong, nilai nomor dikurangi
   dengan angka 1 ?
4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru
   tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang terjadi?
5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada
   penumpang lain !

### Jawaban
1. Pada `main` program jumlah kursi dalam Gerbong A yaitu 10 dapat terlihat pada statement berikut:
    ```java
   Gerbong gerbong = new Gerbong("A", 10);
   ```
   tanpa pada saat instansiasi Gerbong memberikan parameter kode Gerbong A dengan jumlah kursi 10
2. maksud dari potongan kode tersebut yaitu jika attribute of object penumpang sama dengan null atau tidak terdapat object pada attribute tersebut maka tidak akan menambahkan info dari penumpang, namun jika tidak null atau terdapat object pada attribute maka akan menampilkan informasi dari penumpang.
3. Karena kursi pada gerbong merupakan sebuah array yang dimana untuk mengakses menggunakan indeks. maka jika memasukkan nomor 1 maka seharusnya yang dituju adalah indeks ke-0, maka dari itu harus dikurangi dengan 1.
4. `Code`:
   ```java
   public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
        Penumpang budi = new Penumpang("54321", "Budi");
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.info());
    }
   }
   ```
   `Output`: 
   ```
   Kode: A
   Nomor: 1
   Penumpang: Ktp: 54321
   Nama: Budi
   
   Nomor: 2
   Nomor: 3
   Nomor: 4
   Nomor: 5
   Nomor: 6
   Nomor: 7
   Nomor: 8
   Nomor: 9
   Nomor: 10
   ```
   Dari output yang dihasilkan penumpang baru bernama budi menggantikan penumpang sebelumnya pada kursi nomor 1 yaitu Mr. Krab
5. Merubah stuktur kode pada method setPenumpang pada class Kursi dimana jika sudah terdapat Penumpang pada kursi tersebut maka kursi sudah tidak dapat lagi ditempati
   `Code`: 
   ```java
    public void setPenumpang(Penumpang penumpang) {
        if (this.penumpang == null) {
            this.penumpang = penumpang;
        } else {
            System.out.println("Kursi sudah ditempati");
        }
    }
   ```
   `Output`:
   ```
   Kode: A
   Nomor: 1
   Penumpang: Ktp: 12345
   Nama: Mr. Krab
   
   Nomor: 2
   Nomor: 3
   Nomor: 4
   Nomor: 5
   Nomor: 6
   Nomor: 7
   Nomor: 8
   Nomor: 9
   Nomor: 10
   
   Kursi sudah ditempati
   ```