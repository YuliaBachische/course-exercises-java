package test1;

import lect_ex30.Exercise8;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Exercise8Test {
    @Test
    public void adjustIntoTest() {
        LocalDate localDate = LocalDate.of(2020, 12, 2);
        Exercise8 exercise8 = new Exercise8(localDate);
        LocalDate localDate2 = LocalDate.of(2021, 1, 1);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate2);
        Assert.assertEquals(localDate2, exercise8.adjustInto(localDate));
    }
}
