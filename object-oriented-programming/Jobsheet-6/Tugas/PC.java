package Tugas;

public class PC extends Komputer {
    public int ukuranMonitor;
    public PC() {}

    public PC(String merk, String jenisProsesor, int kecProsesor, int sizeMemory, int ukuranMonitor) {
        super(merk, jenisProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPC() {
        System.out.println("==============PC Information Center==============");
        super.tampilData();
        System.out.println("Ukuran Monitor\t\t:" + ukuranMonitor);
    }
}
