<?php 
    $angka1 = 10;
    $angka2 = 5;
    $hasil = $angka1 + $angka2;
    echo "Hasil penjumlahan $angka1 dan $angka2 adalah $hasil <br />";

    $benar = true;
    $salah = false;
    echo "Variabel benar: $benar, Variabel salah: $salah <br />";

    // mendefinisikan konstanta untuk nilai tetap
    define("NAMA_SITUS", "WebsiteKu.com");
    define("TAHUN_PENDIRIAN", 2023);
    define("CONTOH_VARIABEL_KONSTANTA", "ISI DARI VARIABEL KONSTANTA");

    echo "Selamat datang di " . NAMA_SITUS . ", situs yang 
    didirikan pada tahun " . TAHUN_PENDIRIAN . ".";

    // Berdasarkan hasil percobaan dapat diketahui bahwa untuk membuat variabel pada PHP menggunakan keyword $ kemudian dilanjutkan dengan nama variabel, variabel tersebut berisikan variabel dengan tipe data generik. Dan untuk melakukan deklarasi variabel konstanta dapat menggunakan keyword define dengan argumen nama konstanta dan juga nilai 
?>