<?php 
    // way to create an array one dimension
    $buah = array("apel", "jeruk", "pisang", "mangga");
    // or it can like this
    $buah = ["apel", "jeruk", "pisang", "mangga"];

    // how to access one dimension array?
    echo $buah[0];
    echo $buah[1];
    echo "<br />";

    // way to create an array two dimension
    $matrix = array(
        array(1, 2, 3),
        array(4, 5, 6),
        array(7, 8, 9)
    );
    // or it can like this
    $matrix = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ];

    // how to access two dimension array?
    echo $matrix[0][1];
    echo $matrix[1][2];
    echo "<br />";

    // array map or association
    $student = array(
        "name" => "john",
        "age" => 20,
        "class" => "12A"
    );

    // how to access an association array?
    echo $student["name"];
    echo "<br /><br />";

    $nilaiSiswa = [85, 92, 78, 64, 90, 55, 88, 79, 70, 96];
    $nilaiLulus = [];

    foreach($nilaiSiswa as $nilai) {
        if ($nilai >= 70) {
            $nilaiLulus[] = $nilai;
        }
    }

    echo "Daftar nilai siswa yang lulus: " . implode(",", $nilaiLulus);
    echo "<br /><br />";


    $daftarKaryawan = [
        ['Alice', 7],
        ['Bob', 3],
        ['Charlie', 9],
        ['David', 5],
        ['Eva', 6]        
    ];

    $karyawanPengalamanLimaTahun = [];

    foreach($daftarKaryawan as $karyawan) {
        if ($karyawan[1] > 5) {
            $karyawanPengalamanLimaTahun[] = $karyawan[0];
        }
    }

    echo "Daftar karyawan dengan pengalaman kerja lebih dari 5 tahun: " . 
    implode(', ', $karyawanPengalamanLimaTahun);
    echo "<br /><br />";


    $daftarNilai = [
        "Matematika" => [
            ['Alice', 85],
            ['Bob', 92],
            ['Charlie', 78],
        ],
        "Fisika" => [
            ['Alice', 90],
            ['Bob', 88],
            ['Charlie', 75],
        ],
        "Kimia" => [
            ['Alice', 92],
            ['Bob', 80],
            ['Charlie', 85],
        ],
    ];

    $mataKuliah = 'Fisika';

    echo "Daftar nilai mahasiswa dalam mata kuliah $mataKuliah: <br />";

    foreach ($daftarNilai[$mataKuliah] as $nilai) {
        echo "Nama: {$nilai[0]}, Nilai: {$nilai[1]} <br />";
    }
    echo "<br /><br />";
    
    $nilaiMatematika = [
        ['Alice', 85],
        ['Bob', 92],
        ['Charlie', 78],
        ['David', 64],
        ['Eva', 90]
    ];
    
    $nilaiRataRata = 0;

    foreach($nilaiMatematika as $nilai) {
        $nilaiRataRata += $nilai[1];
    }

    $nilaiRataRata /= count($nilaiMatematika);
    
    foreach($nilaiMatematika as $nilai) {
        if ($nilai[1] >= $nilaiRataRata) {
            echo "Nama: {$nilai[0]}, Nilai: {$nilai[1]} <br/>";
        }
    }
?>