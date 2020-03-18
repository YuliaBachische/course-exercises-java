/*
Написать код, который создаст, а затем отловит
ArrayIndexOutOfBoundsException
 */
package lections_exercises12;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Ex2 {
    private static Logger LOGGER = Logger.getLogger(Ex2.class);
    public static void main(String[] args) {
        int [] numbers = new int[5];
        try {
            for (int i = 0; i < 5+1; i++) {
                numbers[i] = i;
                LOGGER.setLevel(Level.INFO);
                LOGGER.info("Значение массива " + i + ": " + numbers[i]);
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            LOGGER.error("ArrayError");
        }

    }
}
