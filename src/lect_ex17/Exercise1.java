package lect_ex17;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[100];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(i);
        }
        int sum = 0;
        int count = 0;
        for (Integer integer : list) {
            if ((integer % 2 != 0) && (integer % 5 == 0)) {
                sum += integer;
                count++;
            }
        }
        System.out.println(sum/count);
    }
}
