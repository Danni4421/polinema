package tugas;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Customer {
    private String id, name, phoneNumber;
    private HashMap<String, Integer> orders;

    public Customer(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.orders = new HashMap<>();
    }

    public boolean verifyId(String id) {
        return this.id.equals(id);
    }

    public void order(Waiter waiter) {
        Scanner sc = new Scanner(System.in);
        waiter.showListMenu();
        System.out.print("Masukkan Pilihan [Number]: ");
        int choosenMenu = sc.nextInt();
        System.out.print("Masukkan Jumlah Pesanan [Number]: ");
        int amount = sc.nextInt();

        waiter.serve(choosenMenu, amount);
        waiter.saveCustomerOrder(orders, choosenMenu, amount);
        System.out.println("Total Pesanan: " + waiter.sendBill(choosenMenu, amount));
    }

    public void detailsOrder() {
        for (Entry<String, Integer> order : orders.entrySet()) {
            System.out.printf("%s membeli %d\n", order.getKey(), order.getValue());
        }
    }
}
