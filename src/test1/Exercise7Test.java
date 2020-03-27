package test1;

import lect_ex30.Exercise7;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Exercise7Test {
    @Test
    public void adjustInto(){
        Exercise7 exercise7 = new Exercise7();
        LocalDate localDate = LocalDate.of(2017, 7, 9);
        LocalDate localDate2 = LocalDate.of(2017, 8, 20);
        Assert.assertNotNull(localDate);
        Assert.assertNotNull(localDate2);
        Assert.assertEquals(localDate2, exercise7.adjustInto(localDate));
    }
}
