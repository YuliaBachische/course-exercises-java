/*
Написать метод countUnique, который принимает целочисленный список 
в качестве параметра и возвращает количество уникальных
целых чисел в этом списке.
При получении пустого списка метод должен возвращать 0.
Пример:
[3, 7, 3,-1, 2, 3, 7, 2, 15, 15]
вернёт 5
*/
package lections_exercises10_2;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Unique {
    private static Logger LOGGER = Logger.getLogger(Unique.class);
    public static void main(String[] args) {
        Integer[] integAr = new Integer[10];
        for (int i = 0; i < integAr.length; i++) {
            integAr[i] = (int)(Math.random()*10+1);
        }
        ArrayList<Integer> myArray = new ArrayList<>(Arrays.asList(integAr));
        ArrayList<Integer> myArray1 = new ArrayList<>();
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(myArray);
        LOGGER.info(countUnique(myArray));
    }
    public static int countUnique(ArrayList<Integer> list){
        if(list == null){
            return 0;
        }
        Set<Integer> set = new HashSet<>(list);
        return set.size();
    }
}
