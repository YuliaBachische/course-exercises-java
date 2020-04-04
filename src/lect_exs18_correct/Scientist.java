package lect_exs18_correct;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Scientist implements Runnable {
    GarbageDump dump;
    Map<String, Integer> collectedDetails = new HashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 1 + Math.random()*4; j++) {
                collect();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        showRes();
    }

    public Scientist(GarbageDump dump) {
        this.dump = dump;
    }

    public void collect() {
        dump.collectDetails(collectedDetails);
        dump.map.clear();
    }

    public void showRes(){
        if(!collectedDetails.isEmpty()) {
            System.out.println("In overall the servant brought to the Scientist: ");
            for (Map.Entry<String, Integer> entry : collectedDetails.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            int res = collectedDetails.entrySet().stream()
                    .min(Comparator.comparingInt(Map.Entry::getValue))
                    .map(Map.Entry::getValue).orElse(0);
            if (collectedDetails.size() == 9) {
                System.out.println("In overall the Scientist made " + res + " robots");
            }
        }
    }
}
