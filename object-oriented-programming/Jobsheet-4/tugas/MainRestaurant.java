package tugas;

import java.util.Scanner;

public class MainRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Restaurant warungPakTris = new Restaurant("Warung Pak Tris");
        Waiter pelayan = new Waiter("1231231232", "John Doe", 20, warungPakTris);
        Chef chef = new Chef("3123213123", "Felix", 30, warungPakTris);
        Customer customer1 = new Customer("123", "Aji Hamdani", "08123012831");

        menuSample(warungPakTris);

        while (true) {
            menu();
            int choosenMenu = sc.nextInt();
            switch (choosenMenu) {
                case 1:
                    System.out.print("\n[1] Restaurant\n[2] Customer\nMasukkan Input: ");
                    int loginInput = sc.nextInt();
                    if (loginInput == 1) {
                        while (true) {
                            restaurantMenu();
                            int restaurantMenuInput = sc.nextInt();
                            sc.nextLine();
                            switch (restaurantMenuInput) {
                                case 1:
                                    warungPakTris.open();
                                    break;
                                case 2:
                                    warungPakTris.close();
                                    break;
                                case 3:
                                    System.out.print("Masukkan Nama Menu: ");
                                    String menuName = sc.nextLine();
                                    System.out.print("Masukkan Harga Menu:  ");
                                    double menuPrice = sc.nextDouble();
                                    System.out.print("Masukkan Stok Menu: ");
                                    int menuStock = sc.nextInt();
                                    warungPakTris.addMenu(new Menu(menuName, menuPrice, menuStock));
                                    break;
                                case 4:
                                    pelayan.showListMenu();
                                    System.out.print("Pilih Menu: ");
                                    int selectedMenu = sc.nextInt();
                                    menuOption();
                                    int selectedMenuOption = sc.nextInt();
                                    switch (selectedMenuOption) {
                                        case 1:
                                            System.out.print("Masukkan nama baru: ");
                                            sc.nextLine();
                                            warungPakTris.getMenu().get(selectedMenu - 1).setName(sc.nextLine());
                                            break;
                                        case 2:
                                            System.out.print("Masukkan harga baru: ");
                                            sc.nextLine();
                                            warungPakTris.getMenu().get(selectedMenu - 1).setPrice(sc.nextDouble());
                                            break;
                                        case 3:
                                            System.out.print("Masukkan stok baru: ");
                                            sc.nextLine();
                                            warungPakTris.getMenu().get(selectedMenu - 1).setStock(sc.nextInt());
                                            break;
                                    }
                                    break;
                                case 5:
                                    pelayan.showListMenu();
                                    System.out.print("Pilih Menu: ");
                                    int deletedMenu = sc.nextInt();
                                    warungPakTris.getMenu().remove(deletedMenu - 1);
                                    break;
                                case 6:
                                    warungPakTris.detailPenjualan();
                                    break;
                                case 7:
                                    warungPakTris.info();
                                    break;
                            }

                            if (restaurantMenuInput == 0) break;
                        }
                    } else {
                        if (warungPakTris.isOpen()) {
                            System.out.print("Masukkan ID: ");
                            String id = sc.next();
                            if (customer1.verifyId(id)) {
                                while (true) {
                                    customerMenu();
                                    int customerInput = sc.nextInt();
                                    switch (customerInput) {
                                        case 1:
                                            customer1.order(pelayan);
                                            break;
                                        case 2:
                                            customer1.detailsOrder();
                                            break;
                                    }

                                    if (customerInput == 0) break;
                                }
                            } else {
                                System.out.println("ID yang Anda masukkan salah!");
                            }
                        } else {
                            System.out.println("Warung Tutup!");
                        }
                    }
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("\n[1] Login");
        System.out.println("[2] Register");
        System.out.print("Masukkan Input: ");
    }

    private static void restaurantMenu() {
        System.out.println("\n[1] Buka Warung");
        System.out.println("[2] Tutup Warung");
        System.out.println("[3] Tambah Menu");
        System.out.println("[4] Edit Menu");
        System.out.println("[5] Hapus Menu");
        System.out.println("[6] Detail Penjualan");
        System.out.println("[7] Info Warung");
        System.out.println("[0] Logout");
        System.out.print("Masukkan Input: ");
    }

    private static void customerMenu() {
        System.out.println("\n[1] Order");
        System.out.println("[2] Detail Order");
        System.out.println("[0] Logout");
        System.out.print("Masukkan Input: ");
    }

    private static void menuOption() {
        System.out.println("[1] Edit Nama");
        System.out.println("[2] Edit Harga");
        System.out.println("[3] Edit Stok");
        System.out.print("Masukkan Input: ");
    }

    private static void menuSample(Restaurant restaurant) {
        restaurant.addMenu(new Menu("Nasi Ayam Bakar", 15000, 15));
        restaurant.addMenu(new Menu("Omelet Bakar", 12000, 25));
        restaurant.addMenu(new Menu("Bebek Goreng", 20000, 10));
    }
}
