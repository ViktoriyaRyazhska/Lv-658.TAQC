package taskstest;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FindNumbersWhichAreDivisibleByGivenNumberTest {
    @Test
    public void Test4T(){
        FindDivisibleBy T4T = new FindDivisibleBy();
        ArrayList x = new ArrayList<>();
        ArrayList y = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        y.add(2);
        ArrayList res = T4T.funct(x,y);
        Assert.assertEquals("[2,4]",res);
    }
}
