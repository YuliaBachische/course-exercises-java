package lect_exs30;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise4 {
    private static Logger LOGGER = Logger.getLogger(Exercise4.class);
    public static void main(String[] args){
        Exercise4 exercise4 = new Exercise4();
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(exercise4.getDate("09-09-2014"));
    }
    @Test
    public LocalDate getDate(String text){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(text, formatter);
    }
}
