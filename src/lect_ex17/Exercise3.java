package lect_ex17;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("NumberOne", 1);
        map.put("Two", 2);
        map.put("Number", 78);
        map.put("Five", 5);
        map.put("Seven", 7);
        int sum = map.entrySet()
                .stream()
                .filter(entry-> entry.getKey().length()<7)
                .mapToInt(Map.Entry:: getValue)
                .sum();
        System.out.println(sum);
    }
}
