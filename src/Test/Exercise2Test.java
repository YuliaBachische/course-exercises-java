package Test;

import lect_ex30.Exercise2;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Exercise2Test {
    @Test
    public void plusMonthsTest(){
        LocalDate localDate = LocalDate.of(2020, 12, 31);
        Exercise2 exercise2 = new Exercise2();
        LocalDate localDate2 = LocalDate.of(2021, 1, 31);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate2);
        Assert.assertEquals(localDate2, exercise2.plusMonths(localDate, 1));
        Exercise2 exercise3 = new Exercise2();
        LocalDate localDate3 = LocalDate.of(2021, 2, 28);
        Assert.assertNotNull(localDate3);
        Assert.assertEquals(localDate3, exercise3.plusMonths(localDate2, 1));
    }
}
