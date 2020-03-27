/*
Даны два объекта LocalDate из предыдущего задания.
Подсчитать количество секунд между полуночью первой даты и
полуночью второй даты
*/
package lect_exs30;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exercise6 {
    private static Logger LOGGER = Logger.getLogger(Exercise6.class);
    public static void main(String[] args) {
        Exercise6 exercise6 = new Exercise6();
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2020, 6, 25);
        LocalDateTime localDateTime1 = localDate.atTime(0, 0, 0);
        LocalDateTime localDateTime2 = localDate1.atTime(0, 0, 0);
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(exercise6.getSeconds(localDateTime1, localDateTime2));
    }
    @Test
    public long getSeconds(LocalDateTime localDate1, LocalDateTime localDate2){
        return Duration.between(localDate1,localDate2).get(ChronoUnit.SECONDS);
    }
}
