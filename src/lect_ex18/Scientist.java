package lect_ex18;

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
    }

    public Scientist(GarbageDump dump) {
        this.dump = dump;
    }

    public void collect() {
        for (int i = 0; i < dump.list.size(); i++) {
            for (RequiredDetails requiredDetails : RequiredDetails.values()) {
                if (dump.list.get(i).equals(String.valueOf(requiredDetails))) {
                    if (collectedDetails.containsKey(dump.list.get(i))) {
                        collectedDetails.put(dump.list.get(i), collectedDetails.get(dump.list.get(i)) + 1);
                        break;
                    } else {
                        collectedDetails.put(dump.list.get(i), 1);
                        break;
                    }
                }
            }
        }
        dump.collectDetails(collectedDetails);
        dump.list.clear();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
