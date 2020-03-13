package lections_exercises14;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
    private static Logger LOGGER = Logger.getLogger(Exercise2.class);

    public static void main(String[] args) {
        String str = "0x5A 45 20 0x4a 0x11ff";
        String [] array = str.split(" ");
        Pattern p = Pattern.compile("\\b0x[A-Fa-f0-9]{1,4}\\b");
        Matcher m;
        for (int i = 0; i < array.length; i++) {
            m = p.matcher(array[i]);
            if (m.find()) {
                LOGGER.setLevel(Level.INFO);
                LOGGER.info(array[i]);
            }
        }
    }
}
