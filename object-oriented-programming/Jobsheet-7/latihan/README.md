### 4 Latihan

```java
public class PerkalianKu {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();

        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}
```

Output :

```
1075
43792
```

### Pertanyaan

1. Dari source coding diatas terletak dimanakah overloading?
2. Jika terdapat overloading ada berapa jumlah parameter yang berbeda?

### Jawaban

1. Overloading terletak pada method perkalian dimana terdapat dua method yang sama namun memiliki parameter yang berbeda

```java
  void perkalian(int a, int b) {
    System.out.println(a * b);
  }

  void perkalian(int a, int b, int c) {
    System.out.println(a * b * c);
  }
```

2. Seperti yang sudah dibahas pada jawaban poin 4.1 dimana method perkalian mengalami overloading yaitu terdapat perbedaan 1 parameter antara kedua method tersebut. Sehingga ketika memberi dua parameter maka akan melakukan eksekusi pada method yang dua parameter begitu juga ketika memanggil method dan memberikan argument pada 3 parameter.

```java
public class PerkalianKu {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();

        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}
```

Output :

```
1075
819.072
```

### Pertanyaan

3. Dari source coding diatas terletak dimanakah overloading?
4. Jika terdapat overloading ada berapa tipe parameter yang berbeda?

### Jawaban

3. Overloading terletak pada method perkalian dimana terdapat dua method yang sama namun memiliki parameter dengan tipe data yang berbeda.

   ```java
   void perkalian(int a, int b) {
      System.out.println(a * b);
    }

    void perkalian(double a, double b) {
      System.out.println(a * b);
    }
   ```

4. Method overloading diatas memiliki perbedaan tipe data pada parameter method-nya dimana terdapat method yang memiliki parameter berupa Integer dan juga ada dalam double, jadi dari 2 parameter a dan b pada method perkalian memiliki perbedaan tipe data pada kedua parameter di method overloading.

```java
public class Ikan {
    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
}

class Piranha extends Ikan {
    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }
}

public class Fish {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha();
        a.swim();
        b.swim();
    }
}
```

Output :

```
Ikan bisa berenang
Piranha bisa makan daging
```

### Pertanyaan

5. Dari source coding diatas terletak dimanakah overriding?
6. Jabarkanlah apabila sourcoding diatas jika terdapat overriding?

### Jawaban

5. Ketika class Piranha melakukan extends terhadap class Ikan, class Piranha melakukan overriding terhadap method swim yang dimiliki oleh class Ikan, karena memiliki method yang sama namun statement di dalam method-nya berbeda.

   ```java
   // method pada class Ikan
   public void swim() {
       System.out.println("Ikan bisa berenang");
   }

   // method pada class Piranha
   public void swim() {
       System.out.println("Piranha bisa makan daging");
   }
   ```

6. Source code diatas menerapkan overriding dengan teknik dynamic method dispatch. jadi class Piranha yang mewarisi class Ikan dapat memiliki method swim, namun pada class Piranha fungsionalitas dari method swim dirubah yang awalnya `Ikan bisa berenang` menjadi `Piranha bisa makan daging`.
