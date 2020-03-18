/*
Написать программу, проверяющую, является ли введённая
строка адресом
электронного
почтового ящика.
В названии почтового ящика разрешить использование только
букв, цифр и нижних подчёркиваний, при этом оно
должно
начинаться с буквы.
Возможные домены верхнего уровня:.org.com
*/
package lections_exercises14;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Exercise1 {
    private static Logger LOGGER = Logger.getLogger(Exercise1.class);
    public static void main(String[] args) {
        String string = "Ach1";
        LOGGER.setLevel(Level.INFO);
        if(string.matches("^(([a-zA-Z])[\\w]+)|([a-zA-Z])[\\w]+(\\.org|\\.com)")){
            LOGGER.info("The address is correct");
        } else {
            LOGGER.info("The address is incorrect");
        }

    }
}
