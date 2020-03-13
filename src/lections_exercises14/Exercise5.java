/*
.
Написать метод, который проверяет, является ли строка адресомIPv4.
Пример корректных IPv4
0.0.0.0
0.0.1.0
255.0.0.1
255.55.255.255
192.168.0.1
Не корректный
001.0.0.0
256.1.1.1
1.1.1.1.
-1.0.-1.1
*/
package lections_exercises14;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise5 {

    private static Logger LOGGER = Logger.getLogger(Exercise5.class);
    private boolean isIPv4(String str) {
        Pattern p = Pattern.compile("^(((0)|([1-9]\\d?)|(1\\d\\d)|(2[0-5]{2}))\\.){3}((0)|([1-9]\\d?)|(1\\d\\d)|(2[0-5]{2}))$");
        Matcher m = p.matcher(str);
        return m.matches();
    }
    public static void main(String[] args) {
        Exercise5 ex = new Exercise5();
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(ex.isIPv4("0.0.0.0"));
        LOGGER.info(ex.isIPv4("0.0.0.0."));
        LOGGER.info(ex.isIPv4("0.0.1.0"));
        LOGGER.info(ex.isIPv4("0.0.-1.0"));
        LOGGER.info(ex.isIPv4("255.0.0.1"));
        LOGGER.info(ex.isIPv4("192.168.0.1.4"));
        LOGGER.info(ex.isIPv4("256.1.1.1"));
        LOGGER.info(ex.isIPv4("001.0.0.0"));
        LOGGER.info(ex.isIPv4("255.55.255.255"));
    }
}
