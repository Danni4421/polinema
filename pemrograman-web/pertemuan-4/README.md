<h1 align="center">PHP</h1>

## Identitas Mahasiswa

> Nama : Aji Hamdani Ahmad <br/>
> Kelas : 2A <br/>
> Prodi : D-IV Teknik Informatika <br/>
> Jurusan : Teknologi Informasi <br/>

### Variabel dan Konstanta

Variabel merupakan sebuah tempat kosong untuk menyimpan sebuah nilai kemudian untuk konstanta adalah sebuah nilai yang tetap dan tidak dapat diubah selama jalannya program.

- Deklarasi Normal Variabel<br>
  Untuk mendeklarasikan variabel pada PHP dapat menggunakan symbol $ (**_Dollar_**) kemudian dilanjutkan dengan nama variabel.
  ```php
  $namaVariabel = "value";
  ```
- Deklarasi Konstan Variabel<br>
  Untuk mendeklarasikan variabel konstan maka dapat menggunakan method `define` yang diberikan 2 parameter yaitu : <br>
  ```php
  define('NAMA_VARIABEL', 'VALUE');
  ```

### Tipe data pada PHP

| Tipe Data | Keterangan                                                                     |
| --------- | ------------------------------------------------------------------------------ |
| Integer   | Berisi bilangan bulat                                                          |
| Float     | Berisi bilangan desimal                                                        |
| Boolean   | Berisi 2 nilai saja: true dan false                                            |
| String    | Berisi data text yang diapit oleh tanda " atau ""                              |
| Array     | Berisi himpunan data                                                           |
| Object    | Digunakan untuk membuat objek dari kelas yang telah didefinisikan sebelumnya   |
| NULL      | Digunakan untuk menyatakan bahwa suatu variabel tidak memiliki nilai           |
| Callable  | Digunakan untuk menyimpan referensi ke fungsi atau metode yang dapat dipanggil |

### Operator

| Nama Operator         | Sign Operator                |
| --------------------- | ---------------------------- |
| Aritmatika            | + , - , \*, /, %             |
| Pembanding            | ==, !=, <, >, <=, >=         |
| Logika                | AND, OR, NEGASI              |
| Penugasan             | =, +=, -=, \*=, /=, %=       |
| Increment/Decrement   | Increment(++), Decrement(--) |
| Bitwise               | AND, OR, XOR, NOT            |
| Pemangkatan           | \*\*                         |
| Identik/Tidak Identik | ===, !==                     |
| Ternary               | ? :                          |
| Array                 | []                           |

### Conditions

Untuk menentukan kondisi pada PHP dapat menggunakan beberapa opsi

1. if
   ```php
   if (true) {
    return "something";
   }
   ```
2. if else
   ```php
   if (false) {
    // no statement
   } else {
    return "false bro";
   }
   ```
3. if elseif else
   ```php
    if (false) {
        // no statement
    } else if (true) {
        return "something";
    } else {
        // no statement
    }
   ```
4. switch case
   ```php
   switch(1) {
    case 1:
        return "something";
        break;
    case 2:
        // no statement
        break;
    default:
        // no statement
   }
   ```

### Looping

1. for
   ```php
   for ($i = 0; $i < 10; $i++) {
       // statement
   }
   ```
2. while
   ```php
   $i = 0;
   while ($i < 10) {
    // some statement
    $i++;
   }
   ```
3. do while
   ```php
   $i = 0;
   do {
    // some statement
    $i++;
   } while ($i < 10);
   ```
4. foreach <br>
   lebih sering digunakan untuk looping array saja.
   ```php
   $nilaiMahasiswa = [91, 93, 80, 89, 100];
   foreach($nilaiMahasiswa as $nilai) {
       // some statement
   }
   ```
   variabel $nilai ditujukan untuk mengambil each element dari nilaiMahasiswa.

### Array

1. Array
   ```php
   $nilaiMahasiswa = [91, 93, 80, 89, 100];
   ```
2. Two Dimensional Array
   ```php
   $nilaiMatematika = [
    ['Alice', 90],
    ['John', 85],
    ['Bob', 87]
   ];
   ```
3. Multi Dimensional Array

   ```php
   $nilaiMahasiswa = [
    ['Fisika',
        [
            ['Alice', 90],
            ['Bob', 86],
            ['Ariel', 70]
        ],
    ],
    ['Matematika',
        [
            ['Alice', 97],
            ['Bob', 87],
            ['Ariel', 90]
        ]
    ],
    ['Kimia',
        [
            ['Alice', 80],
            ['Bob', 76],
            ['Ariel', 70]
        ]
    ]
   ];
   ```

4. Array Key Value
   ```php
   $nilaiMahasiswa = [
       "Fisika" => [
           ['Alice', 90],
           ['Bob', 86],
           ['Ariel', 70]
       ],
       "Matematika" => [
           ['Alice', 97],
           ['Bob', 87],
           ['Ariel', 90]
       ],
       "Kimia" => [
           ['Alice', 80],
           ['Bob', 76],
           ['Ariel', 70]
       ]
   ]
   ```
