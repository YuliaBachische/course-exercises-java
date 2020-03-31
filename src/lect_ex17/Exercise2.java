package lect_ex17;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bed");
        list.add("Properties");
        list.add("Sad");
        list.add("Property");
        list.add("Properties");
        long count = list.stream()
                .filter((string) -> string.length() > 8)
                .distinct()
                .count();
        System.out.println(count);
    }
}
