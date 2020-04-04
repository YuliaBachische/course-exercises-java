package lect_ex19.shop;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Customer implements Runnable {
    private Logger LOGGER = Logger.getLogger(Customer.class);
    Map<Goods, Integer> shoppingBasket = new HashMap<>();
    int customerNo;
    double money = Math.random()*10000;
    Customer customer;

    @Override
    public void run() {
        LOGGER.setLevel(Level.INFO);
        getItems();
    }

    public Customer(int customerNo1) {
        customerNo = customerNo1;
    }

    public double giveMoney(double sum) {
        int chooseMoney = (int) (Math.random() * 2);
        if (chooseMoney == 1) {
            int over = (int) (Math.random() * 500);
            money -= sum + over;
            return sum + over;
        } else {
            money -= sum;
            return sum;
        }
    }

    private void getItems() {
        customer = new Customer(customerNo);
            for (int i = 0; i < 0 + Math.random() * 20-5; i++) {
                Goods getGood = Goods.randomProduct();
                if (customer.shoppingBasket.containsKey(getGood)) {
                    customer.shoppingBasket.put(getGood, customer.shoppingBasket.get(getGood) + 1);
                } else {
                    customer.shoppingBasket.put(getGood, 1);
                }
            }
                if (!customer.shoppingBasket.isEmpty()) {
                for (Map.Entry<Goods, Integer> s : customer.shoppingBasket.entrySet()) {
                    LOGGER.info("Customer " + customerNo + " chose " + s.getKey() + " in quantity of " + s.getValue());
                }
                Shop.getInQueue(customer,customerNo);
                } else {
                LOGGER.info("Customer " + customerNo + " changed his mind and left");
            }
        }
}
