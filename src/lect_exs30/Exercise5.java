package lect_exs30;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise5 {
    private static Logger LOGGER = Logger.getLogger(Exercise5.class);
    public static void main(String[] args) {
        Exercise5 exercise5 = new Exercise5();
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2020, 6, 25);
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(exercise5.getDaysBetween(localDate, localDate1));
    }
    @Test
    public long getDaysBetween(LocalDate localDate1, LocalDate localDate2){
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }
}
