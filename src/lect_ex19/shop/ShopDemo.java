package lect_ex19.shop;

public class ShopDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 84; i++) {
            new Thread(new Customer(i)).start();
        }
    }
}
