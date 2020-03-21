package lections_exercises10_2;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise7 {
    private static Logger LOGGER = Logger.getLogger(Exercise7.class);
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] =(int) ((Math.floor((Math.random() * 2)) > 0 ? 1 : -1) * Math.ceil((Math.random() * 32767)));
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.sort(list);
        Collections.reverse(list);
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(list);
    }
}
