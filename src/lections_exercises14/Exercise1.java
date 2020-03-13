package lections_exercises14;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Exercise1 {
    private static Logger LOGGER = Logger.getLogger(Exercise1.class);
    public static void main(String[] args) {
        String string = "ach1";
        LOGGER.setLevel(Level.INFO);
        if(string.matches("^(([a-zA-Z])[\\w]+)|([a-zA-Z])[\\w]+(\\.org|\\.com)")){
            LOGGER.info("The address is correct");
        } else {
            LOGGER.info("The address is incorrect");
        }

    }
}
