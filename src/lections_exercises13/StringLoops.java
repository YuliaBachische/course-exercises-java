/*
Написать два цикла, выполняющих многократное сложение строк, один с
помощью оператора сложения и String,
второй с помощью StringBuilder и метода append. Сравнить скорость их
выполнения
 */
package lections_exercises13;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class StringLoops {
    private static Logger LOGGER = Logger.getLogger(StringLoops.class);
    public static void main(String[] args) {
        LOGGER.setLevel(Level.INFO);

        long startTime = System.currentTimeMillis();
        String [] array = new String[8];
        String str = "";

        for(int i = 0; i < array.length-1;i++ ) {
            array[i] = "" + i;
            str += array[i];
        }
        LOGGER.info(str);
        long finishTime = System.currentTimeMillis() - startTime;
        LOGGER.info(finishTime + " ms");

        long startTime2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();    //через StringBuilder быстрее
        for(int i = 0; i < array.length-1; i++){
            stringBuilder.append(array[i]);
        }
        LOGGER.info(stringBuilder);
        long finishTime2 = System.currentTimeMillis() - startTime2;
        LOGGER.info(finishTime2 + " ms");
    }
}
