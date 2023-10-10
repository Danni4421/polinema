package Tugas;

public class InheritanceTask {
    public static void main(String[] args) {
        PC pc = new PC("ASUS", "Ryzen 3 7320u", 4, 8, 24);
        pc.tampilPC();

        Mac mac = new Mac("Macbook air 2020", "Intel Core i5", 3, 8, "Lithium Polymer", "Enkripsi Drive");
        mac.tampilMac();

        Windows ideapad5 = new Windows("Lenovo Idepad 5", "Intel Code i5", 3, 8, "Li-ion", "Conservation Battery");
        ideapad5.tampilWindows();
    }
}
