<?php 
    // langkah 2
    $a = 10;
    $b = 5;

    $hasilTambah = $a + $b;
    $hasilKurang = $a - $b;
    $hasilKali = $a * $b;
    $hasilBagi = $a / $b;
    $sisaBagi = $a % $b;
    $pangkat = $a ** $b;

    echo "Hasil Tambah: $hasilTambah <br>";
    echo "Hasil Kurang: $hasilKurang <br>";
    echo "Hasil Kali: $hasilKali <br>";
    echo "Hasil Bagi: $hasilBagi <br>";
    echo "Sisa Bagi: $sisaBagi <br>";
    echo "Pangkat: $pangkat <br>";
    echo "<br />";

    // Berdasarkan hasil percobaan PHP dapat melakukan operasi matemetika sama halnya dengan operator pada bahasa pemrograman lainnya dimana juga terdapat operator aritmatika.

    // langkah 5
    $hasilSama = $a  == $b;
    $hasilTidakSama = $a != $b;
    $hasilLebihKecil = $a < $b;
    $hasilLebihBesar = $a > $b;
    $hasilLebihKecilSama = $a <= $b;
    $hasilLebihBesarSama = $a >= $b;

    echo "Hasil Sama: $hasilSama <br>";
    echo "Hasil Tidak Sama: $hasilTidakSama <br>";
    echo "Hasil Lebih Kecil: $hasilLebihKecil <br>";
    echo "Hasil Lebih Besar: $hasilLebihBesar <br>";
    echo "Hasil Lebih Kecil Sama: $hasilLebihKecilSama <br>";
    echo "Hasil Lebih Besar Sama: $hasilLebihBesarSama <br>";
    echo "<br />";

    // Berdasarkan hasil pengamatan, pada operator pembanding yang digunakan ketika ditampilkan menggunakan keyword echo yang bernilai false akan tidak ditampilkan sedangkan yang bernilai true akan menampilkan value 1.

    // langkah 8
    $hasilAnd = $a && $b;
    $hasilOr = $a || $b;
    $hasilNotA = !$a;
    $hasilNotB = !$b;

    echo "Hasil And: $hasilAnd <br>";
    echo "Hasil Or: $hasilOr <br>";
    echo "Hasil Not A: $hasilNotA <br>";
    echo "Hasil Not B: $hasilNotB <br>";
    echo "<br />";

    // Berdasarkan hasil pengamatan, pada operator logika yang digunakan jika nilai tidak sama dengan 0 maka akan dianggap sebagai true maka jika tidak menggunakan operator negasi maka akan mengghasilkan true karena kedua variabel memiliki nilai yang tidak 0. jika negasi maka hasil true akan menjadi false.

    /// langkah 11
    $a += $b;
    echo "Hasil a  + b: $a <br>";
    $a -= $b;
    echo "Hasil a  - b: $a <br>";
    $a *= $b;
    echo "Hasil a  * b: $a <br>";
    $a /= $b;
    echo "Hasil a  / b: $a <br>";
    $a %= $b;
    echo "Hasil a  % b: $a <br>";
    echo "<br />";

    // Berdasarkan hasil pengamatan, pada operator penugasan dapat melakukan operasi aritmatika antara dua variabel.

    // langkah 14
    $hasilIdentik = $a === $b;
    $hasilTidakIdentik = $a !== $b;

    echo "Hasil Identik: $hasilIdentik <br />";
    echo "Hasil Tidak Identik: $hasilTidakIdentik <br />";
    echo "<br />";

    // Berdasarkan hasil pengamatan, karena memang variabel a dan juga b tidak memiliki nilai yang sama atau identik maka untuk operator identik mengembalikan nilai false untuk $a === $b karena memang tidak identik sedangkan untuk $a !== $b maka akan menghasilkan true karena memang tidak identik.

    // langkah 16
    $kursiRestoran = 45;
    $kursiDitempatiPelanggan = 28;
    $sisaKursi = $kursiRestoran - $kursiDitempatiPelanggan;
    $persenKursi = ($sisaKursi / $kursiRestoran) * 100;

    echo "Sisa kursi $persenKursi%"

?>