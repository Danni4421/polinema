package tugas.overriding;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan dikantin");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur");
    }
}
