package lections_exercises10_2;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BlackBox {
    private static Logger LOGGER = Logger.getLogger(BlackBox.class);
    static List<Integer> list = Stream.of(22,23,2234,131,121,1,-234,55).collect(Collectors.toList());
    public static void main(String[] args) {
        addNumber((int)(Math.random()*100-1));
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(list);
        LOGGER.info(minK(3));
        LOGGER.info(maxN(6));
    }
    public static void addNumber(int num){
        list.add(num);
        Collections.sort(list);
    }
    public static int minK(int k){
        return list.get(k-1);
    }
    public static int maxN(int n){
        Collections.reverse(list);
        return list.get(n-1);
    }
}
