package test.taskstest;

import com.company.Test4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;


public class FormattingDecimalPlacesTest {
    @Test
    public void Test4T(){
        Test4 T4T = new Test4();
        String res = T4T.FDP(-2.333);
        Assert.assertEquals("-2,33",res);
    }
}
