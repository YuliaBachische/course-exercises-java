package lect_exs30;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise1 {
    private static Logger LOGGER = Logger.getLogger(Exercise1.class);
    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        LocalDate localDate = LocalDate.of(2020, 6, 25);
        exercise1.getDate(localDate);
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(exercise1.getDate(localDate));
    }
    @Test
    public String getDate(LocalDate localDate){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return localDate.format(dateTimeFormatter);
    }
}
