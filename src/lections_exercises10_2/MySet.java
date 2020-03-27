/*
Определить множество на основе множества целых чисел. Создать
методы для определения пересечения и объединения множеств.
 */
package lections_exercises10_2;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.*;

public class MySet {
    private static Logger LOGGER = Logger.getLogger(MySet.class);
    public static Set<Integer> unit(Set<Integer> s, ArrayList <Integer> s2){
        s.addAll(s2);
        return s;
    }
    public static Set<Integer> intersect(Set<Integer> s, ArrayList<Integer> s2){
        s.retainAll(s2);
        return s;
    }
    public static void main(String[] args) {
        Integer[] setFirst = new Integer[10];
        for (int i = 0; i < setFirst.length; i++) {
            setFirst[i] = (int) ((Math.random() * 20) + 1);
        }
        Integer[] setSecond = new Integer[10];
        for (int i = 0; i < setSecond.length; i++) {
            setSecond[i] = (int) ((Math.random() * 20) + 1);
        }
        Set<Integer> set1 = new HashSet<>(Arrays.asList(setFirst));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(setFirst));
        ArrayList<Integer> set2 = new ArrayList<>(Arrays.asList(setSecond));
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(set1);
        LOGGER.info(set2);
        LOGGER.info(intersect(set1, set2));
        LOGGER.info(unit(set1, set2));

    }

}
