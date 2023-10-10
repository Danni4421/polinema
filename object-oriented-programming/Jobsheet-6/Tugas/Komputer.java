package Tugas;

public class Komputer {
    public String merk, jenisProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer() {}

    public Komputer(String merk, String jenisProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jenisProsesor = jenisProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }

    public void tampilData() {
        System.out.println("Merek\t\t\t\t:" + merk);
        System.out.println("Jenis Prosesor\t\t:" + jenisProsesor);
        System.out.println("Kecepatan Prosesor\t:" + kecProsesor);
        System.out.println("Besar Memori\t\t:" + sizeMemory);
    }
}
