package lect_ex17;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 5, 8, 12, 25);
        double result = list.stream()
                .filter((number) -> number!=null && number%2!=0 && number%5==0)
                .mapToLong(num -> num)
                .average()
                .orElse(0);
        System.out.println(result);
    }
}
