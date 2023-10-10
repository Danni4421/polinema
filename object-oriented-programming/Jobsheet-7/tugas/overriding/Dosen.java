package tugas.overriding;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan saat istirahat");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur hingga malam");
    }
}
