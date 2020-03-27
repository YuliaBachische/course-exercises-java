package lect_exs30;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class Exercise7 implements TemporalAdjuster{
    private static Logger LOGGER = Logger.getLogger(Exercise7.class);
    @Override
    @Test
    public Temporal adjustInto(Temporal temporal) {
        return (temporal.plus(Period.ofDays(42)));
    }
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Exercise7 adjuster = new Exercise7();
        LOGGER.setLevel(Level.INFO);
        LOGGER.info(adjuster.adjustInto(localDate));;
    }
}
