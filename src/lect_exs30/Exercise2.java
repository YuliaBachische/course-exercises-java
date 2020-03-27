package lect_exs30;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.time.LocalDate;

public class Exercise2 {
    private static Logger LOGGER = Logger.getLogger(Exercise2.class);
    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        LocalDate localDate = LocalDate.now();
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(exercise2.plusMonths(localDate, 3));
    }
    @Test
    public LocalDate plusMonths(LocalDate localDate, int months){
        return localDate.plusMonths(months);
    }
}
