package lect_ex19.mad_scientist;

import java.util.HashMap;
import java.util.Map;

public class GarbageDump {
    final Map<String, Integer> map = new HashMap<>();

    public synchronized void throwDetails(Map<String, Integer> map1){
            map.putAll(map1);

        System.out.println(map1 + " were thrown");
    }

    public synchronized void collectDetails(Map<String, Integer> map1, String name) {
            if(!map.isEmpty()) {
                for (String s : map.keySet()) {
                    if (map1.containsKey(s)) {
                        map1.put(s, map1.get(s) + 1);
                    } else {
                        map1.put(s, map.get(s));
                    }
                }
            }
    }
}


