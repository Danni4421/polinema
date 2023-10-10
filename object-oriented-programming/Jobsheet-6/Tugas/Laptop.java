package Tugas;

public class Laptop extends Komputer {
    public String jnsBaterai;

    public Laptop() {}
    public Laptop(String merk, String jenisProsesor, int kecProsesor, int sizeMemory, String jnsBaterai) {
        super(merk, jenisProsesor, kecProsesor, sizeMemory);
        this.jnsBaterai = jnsBaterai;
    }
    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai\t\t:" + jnsBaterai);
    }
}
