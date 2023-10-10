package Tugas;

public class Mac extends Laptop {
    public String security;
    public Mac () {};

    public Mac(String merk, String jenisProsesor, int kecProsesor, int sizeMemory, String jnsBaterai, String security) {
        super(merk, jenisProsesor, kecProsesor, sizeMemory, jnsBaterai);
        this.security = security;
    }

    public void tampilMac() {
        System.out.println("===============MAC Information Center===============");
        super.tampilLaptop();
        System.out.println("Keamanan\t\t\t:" + security);
    }
}
