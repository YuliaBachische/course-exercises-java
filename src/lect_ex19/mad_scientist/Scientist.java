package lect_ex19.mad_scientist;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Scientist implements Runnable {
    GarbageDump dump;
    Map<String, Integer> collectedDetails = new HashMap<>();
    String name;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            collect();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        showWinner(this.name);
    }

    public Scientist(GarbageDump dump, String name) {
        this.dump = dump;
        this.name = name;
    }

    public void collect() {
        dump.collectDetails(collectedDetails, this.name);
        dump.map.clear();
    }

    public void showWinner(String name) {
        int res2 = collectedDetails.entrySet().stream()
                .min(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getValue).orElse(0);
        System.out.println("THE " + getClass().getSimpleName() + " " + name + "'s  result is " + res2);
        System.out.println(collectedDetails);
    }
}
