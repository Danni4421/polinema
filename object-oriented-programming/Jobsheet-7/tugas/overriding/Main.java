package tugas.overriding;

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
