package tugas;

import java.util.HashMap;

public class Waiter extends Employee {
    private int customerServed;

    public Waiter(String noKtp, String name, int age, Restaurant restaurant) {
        super(noKtp, name, age, restaurant);
        this.customerServed = 0;
    }

    public void serve(int menu, int amount) {
        this.restaurant.addOrder(this.restaurant.getMenu().get(menu - 1).getName(), amount);
        this.customerServed++;
    }

    public void showListMenu() {
        for (int i = 0; i < this.restaurant.getMenu().size(); i++) {
            System.out.printf("%d. %s\n",(i + 1), this.restaurant.getMenu().get(i).getName());
        }
    }

    public double sendBill(int menu, int amount) {
        return this.restaurant.getMenu().get(menu - 1).getPrice() * amount;
    }

    public void saveCustomerOrder(HashMap<String, Integer> orders, int menu, int amount) {
        String menuName = this.restaurant.getMenu().get(menu - 1).getName();
        if (orders.containsKey(menuName)) {
            int prevAmount = orders.get(menuName);
            orders.put(menuName, (prevAmount + amount));
        } else {
            orders.put(menuName, amount);
        }
    }
}
