package lections_exercises10_2;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.*;

public class Exercise3 {
    private static Logger LOGGER = Logger.getLogger(Exercise3.class);
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 7);
        map1.put(3, 2);
        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(3, 3);
        map2.put(1, 2);
        List<Integer> list = new ArrayList<>();
        for (Integer key : map2.keySet()) {
            if (map1.containsKey(key)) {
                map1.put(key, map1.get(key) + map2.get(key));
            } else {
                map1.put(key, map2.get(key));
            }
        }
        for (Integer key : map1.keySet()) {
            list.add(key);
            list.add(map1.get(key));
        }
        Collections.reverse(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size() - 1; i++) {
            stringBuilder.append(list.get(i)).append("x").append("^").append(list.get(i + 1));
            i++;
            if (i != list.size() - 1) {
                stringBuilder.append(" + ");
            }
        }
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(stringBuilder.append(" = 0"));
    }
}
