package tugas;

public class Menu {
    private String name;
    private double price;
    private int stock;

    public Menu(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void info() {
        System.out.println("Nama\t: " + this.name);
        System.out.println("Harga\t: " + this.price);
        System.out.println("Stok\t: " + this.stock);
    }
}
