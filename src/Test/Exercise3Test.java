package Test;

import lect_ex30.Exercise3;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Exercise3Test {
    @Test
    public void getDateTest(){
        Exercise3 exercise3 = new Exercise3();
        LocalDate localDate = LocalDate.of(2014, 5, 8);
        Assert.assertNotNull(localDate);
        Assert.assertEquals("08.05.2014", exercise3.getDate(localDate));
    }
}
