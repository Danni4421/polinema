package percobaan1;

public class ContohVariabel03 {
    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "Berhasil petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.70;
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai " + isPandai);
        System.out.println("Jenis Kelamin " + jenisKelamin);
        System.out.println("Umurku saat ini " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}
