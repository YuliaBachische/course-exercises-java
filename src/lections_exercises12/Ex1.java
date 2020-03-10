package lections_exercises12;

import org.apache.log4j.Logger;

public class Ex1 {
    private static Logger LOGGER = Logger.getLogger(Ex1.class);
    public static void main(String[] args) {
        Integer i = null;
        try {
            i.doubleValue();
        } catch (NullPointerException ex){
            LOGGER.error("Null");
        }
    }
}
