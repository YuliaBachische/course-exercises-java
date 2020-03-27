package Test;

import lect_ex30.Exercise4;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Exercise4Test {
    @Test
    public void getDateTest(){
        Exercise4 exercise4 = new Exercise4();
        LocalDate localDate = LocalDate.of(2019, 4,23);
        Assert.assertNotNull(localDate);
        Assert.assertEquals(localDate, exercise4.getDate("23-04-2019"));
    }
    @Test(expected = DateTimeParseException.class)
    public void dateTimeParseExceptionTest(){
        Exercise4 exercise4 = new Exercise4();
        exercise4.getDate("23-04/2019");
    }
}
