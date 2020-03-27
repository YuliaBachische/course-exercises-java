package Test;

import lect_ex30.Exercise1;
import org.junit.Assert;
import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Exercise1Test {
    @Test
    public void getQuantityOfWordsTest(){
        Exercise1 exercise1 = new Exercise1();
        LocalDate localDate = LocalDate.of(2020, 8, 25);
        Assert.assertEquals("25.08.2020", exercise1.getDate(localDate));
        LocalDate localDate3 = LocalDate.of(2020, 1, 25);
        Assert.assertEquals("25.01.2020", exercise1.getDate(localDate3));
        LocalDate localDate4 = LocalDate.of(2020, 12, 25);
        Assert.assertEquals("25.12.2020", exercise1.getDate(localDate4));
    }
    @Test(expected = DateTimeException.class)
    public void dateTimeExceptionTest(){
        Exercise1 exercise1 = new Exercise1();
        LocalDate localDate2 = LocalDate.of(2020, 1, 95);
        exercise1.getDate(localDate2);
    }
}
