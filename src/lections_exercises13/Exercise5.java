/*
Подсчитать количество слов в тексте. Учесть, что слова могут разделяться
несколькими пробелами
 */
package lections_exercises13;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

public class Exercise5 {
    private static Logger LOGGER = Logger.getLogger(Exercise5.class);
    public static void main(String[] args) {
        LOGGER.setLevel(Level.INFO);
        String txt = "It's raining    outside";
        LOGGER.info(getQuantityOfWords(txt));
    }
    @Test
    public static int getQuantityOfWords(String txt){
        String str;
        char[]chars = txt.toCharArray();
        int count = 0;
        for(int i = 0; i<chars.length; i++) {
            if ((chars[i] == ' ')&&(chars[i + 1] != ' ')) {
                count += 1;
            }
        }
        if(chars[0]== ' '){
            count-=1;
        }
            return count+1;
    }
}
