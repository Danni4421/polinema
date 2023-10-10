## Method Overriding

`Source Code`

```java
// class Manusia
public class Manusia {
    public void bernafas() {
        System.out.println("Manusia bisa bernafas");
    }

    public void makan() {
        System.out.println("Manusia sedang makan");
    }
}
```

```java
// class Mahasiswa
public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan dikantin");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur");
    }
}

```

```java
// class Dosen
public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan saat istirahat");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur hingga malam");
    }
}
```

```java
// class Main
public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Mahasiswa mahasiswa = new Mahasiswa();
        Dosen dosen = new Dosen();

        manusia.makan();
        mahasiswa.makan();
        dosen.makan();
    }
}
```

`Output : `

```
Manusia sedang makan
Mahasiswa makan dikantin
Dosen sedang makan saat istirahat
```
