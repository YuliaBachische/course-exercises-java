/*
Написать функцию, заменяющую несколько последовательных
одинаковых символов в строке одним
 */
package lections_exercises13;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Exercise6 {
    private static Logger LOGGER = Logger.getLogger(Exercise3.class);
    public static StringBuilder replaceSameSymbols(char[]chars){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length-1; i++){
            if(chars[i]!=chars[i+1]){
                str.append(chars[i]);
            }
        }
        str.append(chars[chars.length-1]);
        return str;
    }

    public static void main(String[] args) {
        String txt = "hhoijuyyyyyy";
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(replaceSameSymbols(txt.toCharArray()));
    }
}
