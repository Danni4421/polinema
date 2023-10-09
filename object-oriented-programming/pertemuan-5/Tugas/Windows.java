package Tugas;

import java.awt.*;

public class Windows extends Laptop {
    public String fitur;
    public Windows() {}

    public Windows(String merk, String jenisProsesor, int kecProsesor, int sizeMemory, String jnsBaterai, String fitur) {
        super(merk, jenisProsesor, kecProsesor, sizeMemory, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        System.out.println("===============Windows Information Center===============");
        super.tampilLaptop();
        System.out.println("Keamanan\t\t\t:" + fitur);
    }
}
