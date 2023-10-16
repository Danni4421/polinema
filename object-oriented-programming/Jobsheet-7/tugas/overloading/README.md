## Method Overloading

`Source Code`

```java
package tugas.overloading;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return sisiA + sisiB + Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Total sudut: " + segitiga.totalSudut(45));
        System.out.println("Total sudut Overloading: " + segitiga.totalSudut(45, 30));
        System.out.println("Keliling: " + segitiga.keliling(3, 4 , 5));
        System.out.println("Keliling: " + segitiga.keliling(3, 4));
    }
}
```

```
Total sudut: 135
Total sudut Overloading: 105
Keliling: 12
Keliling Overloading: 12.0
```
