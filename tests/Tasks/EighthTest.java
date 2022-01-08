package Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.Eighth;

public class EighthTest {

    @Test
    public void Test_01()
    {
        Assert.assertEquals(Eighth.TwoDecimalPlaces(4.659725356), 4.66, 0.00);
    }

    @Test
    public void Test_02()
    {
        Assert.assertEquals(Eighth.TwoDecimalPlaces(173735326.3783732637948948),173735326.38, 0.00);
    }
}
