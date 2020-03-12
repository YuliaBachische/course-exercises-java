/*
Заменить все грустные смайлы
:(
в строке на весёлые
:)
 */
package lections_exercises13;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Exercise2 {
    private static Logger LOGGER = Logger.getLogger(Exercise2.class);
    public static void main(String[] args) {
        String sadFace = "I don't know how to do my hw:( :( :(";
        sadFace = sadFace.replace(":(", ":)");
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(sadFace);
    }
}
