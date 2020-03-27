/*
Задание. Создать список оценок учеников с помощью ListIterator,
заполнить случайными оценками. Удалить неудовлетворительные оценки
из списка
 */
package lections_exercises10;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.*;

public class Exercise1 {
    private static Logger LOGGER = Logger.getLogger(Exercise1.class);
    public static void main(String[] args) {
        LOGGER.setLevel(Level.INFO);
        Integer [] nums = new Integer[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=Random();
        }
        ArrayList<Integer> listOfMarks = new ArrayList<>(Arrays.asList(nums));
        LOGGER.info("All marks: " + listOfMarks);
        ListIterator<Integer> numListIter = listOfMarks.listIterator();
        while (numListIter.hasNext()) {
            if (numListIter.next() < 4) {
                numListIter.remove();
            }
        }
        LOGGER.info("Positive marks: " + listOfMarks);
    }
    public static int Random(){
        Random random = new Random();
        return random.nextInt(10);
    }
}
