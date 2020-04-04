package lect_ex19.shop;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Shop {
    private static Logger LOGGER = Logger.getLogger(Shop.class);
    static Cashbox cashbox1 = new Cashbox();
    static Cashbox cashbox2 = new Cashbox();
    static Cashbox cashbox3 = new Cashbox();

    public static void getInQueue(Customer c, int no) {
        LOGGER.setLevel(Level.INFO);
        LOGGER.setLevel(Level.INFO);
        Goods.products();
        getServed(c, no);

    }
    public static void getServed(Customer c, int no) {
        int chooseCashBox = (int) (1 + Math.random() * 3);
           switch (chooseCashBox){
               case 1:
                   getServedInFirstCashBox(c, no);
                   break;
               case 2:
                   getServedInSecondCashbox(c, no);
                   break;
               case 3:
                   getServedInThirdCashbox(c, no);
                   break;
           }
        }

    private static void getServedInFirstCashBox(Customer c, int no) {
        serve(c, no, 1);
        cashbox1.available.release();
    }

    private static void getServedInSecondCashbox(Customer c, int no) {
        serve(c, no, 2);
        cashbox2.available.release();

    }

    private static void getServedInThirdCashbox(Customer c, int no) {
        serve(c, no, 3);
        cashbox3.available.release();
    }

    public static void serve(Customer c, int no, int noCashBox){
        try {
            switch (noCashBox) {
                case 1:
                    cashbox1.available.acquire();
                    break;
                case 2:
                    cashbox2.available.acquire();
                    break;
                case 3:
                    cashbox3.available.acquire();
            }
            Receipt receipt;
            List<Item> items = new ArrayList<>();
            Item item;
            double cost;
            double discount;
            double discountAmount;
            int id = 0;
            double sum;
            double total = 0;
            Thread.sleep(100* c.shoppingBasket.size());
            for(Map.Entry<Goods, Integer> s: c.shoppingBasket.entrySet()){
                id++;
                sum = s.getValue()*s.getKey().price;
                discount = s.getKey().discount;
                discountAmount = sum*discount/100;
                cost = sum - discountAmount;
                item = new Item(id, s.getKey(), s.getValue(), f(sum), f(discount), f(discountAmount));
                items.add(item);
                total += cost;
            }
            double change = c.giveMoney(total) - total;
            c.money += change;
            receipt = new Receipt((int) (Math.random()*1000), LocalDateTime.now(), noCashBox, items, f(total), f(change));
            LOGGER.info("Customer " + no + " is approaching cashbox " + noCashBox);
            LOGGER.info(receipt);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String f(double total) {
        return String.format("%.2f", total);
    }
}

