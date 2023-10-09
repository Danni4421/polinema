<?php 
    // langkah 2
    $a = 10;
    $b = 5;
    $c = $a + 5;
    $d = $b + (10 * 5);
    $e = $d - $c;

    echo "Variabel a: {$a} <br>";
    echo "Variabel a: {$b} <br>";
    echo "Variabel a: {$c} <br>";
    echo "Variabel a: {$d} <br>";
    echo "Variabel a: {$e} <br>";

    var_dump($e);
    echo "<br><br>";

    // langkah 5
    $nilaiMatemetika = 5.1;
    $nilaiIPA = 6.7;
    $nilaiBahasaIndonesia = 9.3;

    $rataRata = ($nilaiMatemetika + $nilaiIPA + $nilaiBahasaIndonesia) / 3;
    echo "Matematika: {$nilaiMatemetika} <br>";
    echo "IPA: {$nilaiIPA} <br>";
    echo "Bahasa Indonesia: {$nilaiBahasaIndonesia} <br>";
    echo "Rata-rata: {$rataRata} <br>";
    echo "<br>";

    // langkah 8
    $apakahSiswaLulus = true;
    $apakahSiswaSudahUjian = false;

    var_dump($apakahSiswaLulus);
    echo "<br>";
    var_dump($apakahSiswaSudahUjian);
    echo "<br><br>";
    
    // langkah 11
    $namaDepan = "Ibnu";
    $namaBelakang = 'Jakaria';

    $namaLengkap = "{$namaDepan} {$namaBelakang}";
    $namaLengkap2 = $namaDepan . ' ' . $namaBelakang;

    echo "Nama Depan: {$namaDepan} <br>";
    echo 'Nama Belakang: ' . $namaBelakang . '<br>';

    echo $namaLengkap;
    echo "<br>";

    // langkah 14
    $listMahasiswa = ["Wahid Abdullah", "Elmo Bachtiar", "Lendis Fabri"];
    echo "$listMahasiswa[0]";


    // Variabel pada PHP memiliki tipe data yang generik yang berarti untuk mengisialisasikan sebuah nilai ke variabel tidak perlu untuk mendefinisikan tipe data apa yang akan dimasukkan, hal tersebut sama seperti pada Javascript.
    // PHP juga memiliki 8 tipe data yang berisikan tipe data primitif dan non-primitif ada juga Callable dimana untuk dijadikan sebagai referensi ke fungsi yang dapat dipanggil. 
?>