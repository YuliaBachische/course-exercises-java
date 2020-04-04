package lect_ex19.mad_scientist;

import java.util.HashMap;
import java.util.Map;

public class Factory implements Runnable {
    GarbageDump dump;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i == 0) {
                dump.throwDetails(throwDetails(20));
            } else {
                dump.throwDetails(throwDetails((int) (1 + Math.random() * 4)));
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Factory(GarbageDump dump) {
        this.dump = dump;
    }

    public Map<String, Integer> throwDetails(int count){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String put = String.valueOf(RequiredDetails.randomDetail());
            if(map.containsKey(put)) {
                map.put(put, map.get(put) + 1);
            }else {
                map.put(put, 1);
            }
        }
        return map;
    }
}

