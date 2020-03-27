package test1;

import lect_ex30.Exercise5;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Exercise5Test {
    @Test
    public void getDaysBetweenTest(){
        Exercise5 exercise5 = new Exercise5();
        LocalDate localDate = LocalDate.of(2017, 4, 4);
        LocalDate localDate1 = LocalDate.of(2020, 6, 25);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate1);
        Assert.assertEquals(1178, exercise5.getDaysBetween(localDate, localDate1));
    }
}
