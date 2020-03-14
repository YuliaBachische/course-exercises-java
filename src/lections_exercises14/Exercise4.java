/*
Написать программу, выполняющую поиск в строке мобильных
телефонных номеров в формате
+375XX
YYYYYYY
и заменяющую каждый телефон на тот же, но в формате
+375 (XX)YYY-YY-YY 
X -код оператора
Y-номер телефона
*/
package lections_exercises14;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
    private static Logger LOGGER = Logger.getLogger(Exercise4.class);
    public static void main(String[] args) {
        String str = "+375293651474 +37529365147 +37529365 +3752793651474 +375293651474 +3752936514748 +9803288909";
        Pattern p = Pattern.compile("^\\+375(\\d{2})\\d{3}(\\d{2})\\d{2}$");
        Matcher m;
        String [] array = str.split(" ");
        for(int i = 0; i < array.length; i++){
            m = p.matcher(array[i]);
            if(m.matches()){
                array[i] = array[i].replaceAll(m.group(1), "\\(" + m.group(1) + "\\)");
                array[i] = array[i].replaceAll(m.group(2), "\\-" + m.group(2) + "\\-");
                LOGGER.setLevel(Level.INFO);
                LOGGER.info(array[i]);
            }
        }
    }
}
