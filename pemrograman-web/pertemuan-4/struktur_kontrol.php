<?php 
    $nilaiNumerik = 89;

    if ($nilaiNumerik >= 90 && $nilaiNumerik <= 100) {
        echo "Nilai huruf: A";
    } elseif($nilaiNumerik >= 80 && $nilaiNumerik < 90) {
        echo "Nilai huruf: B";
    } elseif($nilaiNumerik >= 70 && $nilaiNumerik < 80) {
        echo "Nilai huruf: C";
    } elseif($nilaiNumerik < 70) {
        echo "Nilai huruf: D";
    }

    echo "<br /><br />";


    $jarakSaatIni = 0;
    $jarakTarget = 500;
    $peningkatanHarian = 30;
    $hari = 0;

    while($jarakSaatIni < $jarakTarget) {
        $jarakSaatIni += $peningkatanHarian;
        $hari++;
    }

    echo "Atlet tersebut memerlukan $hari hari untuk mencapai jarak 500 kilometer.";
    echo "<br /><br />";

    $jumlahLahan = 10;
    $tanamanPerlahan = 5;
    $buahPerTanaman = 10;
    $jumlahBuah = 0;

    for ($i = 1; $i <= $jumlahLahan; $i++) {
        $jumlahBuah += ($tanamanPerlahan * $buahPerTanaman);
    }

    echo "Jumlah buah yang akan dipanen adalah: $jumlahBuah"; 
    echo "<br /><br />";

    $skorUjian = [85, 92, 78, 96, 88];
    $totalSkor = 0;

    foreach($skorUjian as $skor) {
        $totalSkor += $skor;
    }

    echo "Total skor ujian adalah: $totalSkor";
    echo "<br /><br />";

    $nilaiSiswa = [85, 92, 58, 64, 90, 55, 79, 70, 96];

    foreach($nilaiSiswa as $nilai) {
        if ($nilai < 60) {
            echo "Nilai: $nilai (Tidak lulus) <br/>";
            continue;
        }
        echo "Nilai: $nilai (Lulus) <br/>";
    }
    echo "<br />";

    $nilaiMahasiswa = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];
    sort($nilaiMahasiswa);
    $totalNilai = 0;
    
    $length = count($nilaiMahasiswa);
    for ($i = 2; $i < $length - 2; $i++) {
        $totalNilai += $nilaiMahasiswa[$i];
    }

    echo "Nilai rata rata Mahasiswa: " . $totalNilai / ($length - 4);
    echo "<br /><br />";

    $hargaProduct = 120000;
    $pembelian = $hargaProduct;
    $totalBayar = 0;

    if ($pembelian > 100000) {
        $totalBayar = $pembelian - ($pembelian * 0.2);
    }

    echo "Harga yang harus dibayar: $totalBayar";
    echo "<br /><br />";

    $totalPoint = 560;
    echo "Total skor pemain adalah: ($totalPoint) <br />";
    echo "Apakah pemain mendapatkan hadiah tambahan? " 
    . ($totalPoint > 500 ? "Ya": "Tidak") . "<br/>";
?>