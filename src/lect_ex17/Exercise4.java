package lect_ex17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,54,3,5,7);
        String res = list.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(res);
    }
}
