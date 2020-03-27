package test1;

import lect_ex30.Exercise6;
import org.junit.Assert;
import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise6Test {
    @Test
    public void getSecondsTest(){
        Exercise6 exercise6 = new Exercise6();
        LocalDate localDate = LocalDate.of(2020, 5, 25);
        LocalDate localDate1 = LocalDate.of(2020, 6, 25);
        LocalDateTime localDateTime1 = localDate.atTime(4, 0, 0);
        LocalDateTime localDateTime2 = localDate1.atTime(0, 9, 0);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate1);
        Assert.assertEquals(2664540, exercise6.getSeconds(localDateTime1, localDateTime2));
    }
    @Test(expected = DateTimeException.class)
    public void dateTimeExceptionTest(){
        Exercise6 exercise6 = new Exercise6();
        LocalDate localDate = LocalDate.of(2020, -5, 25);
        LocalDate localDate1 = LocalDate.of(2020, 6, 25);
        LocalDateTime localDateTime1 = localDate.atTime(4, 0, 0);
        LocalDateTime localDateTime2 = localDate1.atTime(0, 9, 0);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate1);
        exercise6.getSeconds(localDateTime1, localDateTime2);
    }

}
