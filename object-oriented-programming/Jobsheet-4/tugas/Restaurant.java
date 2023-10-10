package tugas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Restaurant {
    private String name;
    private boolean isOpen;
    private HashMap<String, Integer> orders;
    private List<Menu> listMenu;

    public Restaurant(String name) {
        this.name = name;
        this.isOpen = false;
        this.orders = new HashMap<>();
        this.listMenu = new ArrayList<Menu>();
    }

    public void open() {
        this.isOpen = true;
        System.out.println(this.name + " telah dibuka");
    }

    public void close() {
        this.isOpen = false;
        System.out.println(this.name + " telah ditutup");
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(String menu, int amount) {
        if (this.orders.containsKey(menu)) {
            int prevAmount = this.orders.get(menu);
            this.orders.put(menu, (prevAmount + amount));
        } else {
            this.orders.put(menu, amount);
        }
    }

    public void addMenu(Menu menu) {
        if (!this.listMenu.contains(menu)) {
            this.listMenu.add(menu);
        } else {
            System.out.println("Menu sudah tersedia");
        }
    }

    public List<Menu> getMenu() {
        return this.listMenu;
    }

    public void detailPenjualan() {
        for (Entry<String, Integer> order : orders.entrySet()) {
            System.out.printf("%s terjual [%d]\n", order.getKey(), order.getValue());
        }
    }

    public void info() {
        System.out.println("Restaurant\t: " + this.name);
        System.out.println("Open\t\t: " + (this.isOpen ? "Yes" : "No"));
    }
}