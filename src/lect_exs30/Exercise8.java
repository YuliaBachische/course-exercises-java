/*
Написать свою реализацию интерфейса
TemporalAdjuster, которая бы изменяла дату на ближайшее (в
днях) 1 января
*/
package lect_exs30;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Exercise8 implements TemporalAdjuster {
    private static Logger LOGGER = Logger.getLogger(Exercise8.class);
    LocalDate localDate;

    public Exercise8(LocalDate localDate) {
        this.localDate = localDate;
    }
    @Test
    public Temporal adjustInto(Temporal temporal) {
        if(localDate.getMonthValue()<=6){
            return temporal.with(TemporalAdjusters.firstDayOfYear());
        }
        return temporal.with(TemporalAdjusters.firstDayOfNextYear());
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Exercise8 exercise8 = new Exercise8(localDate);
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(exercise8.adjustInto(localDate));
    }
}
