package lect_ex19.shop;

public class Item {
    int no;
    Goods good;
    int quantity;
    String cost;
    String discount;
    String discountAmount;

    @Override
    public String toString() {
        return "\n" + "ITEM" + "\n" +
                "--" + "\n" +
                "no=" + no +"\n" +
                "good=" + good +"\n" +
                "quantity=" + quantity +"\n" +
                "cost=" + cost +"\n" +
                "discount=" + discount +"\n" +
                "discountAmount=" + discountAmount + "\n" +
                "--" + "\n";
    }

    public Item(int no, Goods good, int quantity, String cost, String discount, String discountAmount) {
        this.no = no;
        this.good = good;
        this.quantity = quantity;
        this.cost = cost;
        this.discount = discount;
        this.discountAmount = discountAmount;
    }
}
