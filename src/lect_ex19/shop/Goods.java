package lect_ex19.shop;

import java.util.List;
import java.util.Random;

public enum Goods {
    BEER,
    VODKA,
    CRISPS,
    BREAD,
    MILK,
    HERRING,
    KEFIR,
    LOAF,
    BUCKWHEAT,
    SAUSAGES,
    BUN_FROM_THE_STOVE;

    int id;
    String type;
    double price;
    double discount;

    private static final List<Goods> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Goods randomProduct()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    public static void products(){
        int i = 0;
        for (Goods s: Goods.values()) {
            i++;
            s.price = 0 + Math.random()*500;
            s.discount = 0 + Math.random()*0.89;
            s.type = s.name();
            s.id = i;
        }
    }
}
