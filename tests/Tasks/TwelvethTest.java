package Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.Twelve;

public class TwelvethTest {

    @Test
    public void testSum() {
        byte a = 1;
        byte b = 2;
        Assert.assertEquals(Twelve.sum(a, b), 3);
    }
}
