/*
Написать функцию, принимающую 2 параметра: строку и слово
- и возвращающую true, если строка начинается и заканчивается этим словом
 */
package lections_exercises13;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Exercise3 {
    private static Logger LOGGER = Logger.getLogger(Exercise3.class);
    public boolean getStringAndAWord(String str, String word) {  //если без учета регистра
        return ((str.toLowerCase().startsWith(word.toLowerCase())) && (str.toLowerCase().endsWith(word.toLowerCase())));
    }

    public static void main(String[] args) {
        Exercise3 ex = new Exercise3();
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(ex.getStringAndAWord("please give a ten, pLease", "please"));
    }


}
