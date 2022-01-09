package Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.Twentieth;

import java.util.Arrays;

public class TwentiethTest {

    @Test
    public void test() {
        System.out.println("Fixed Tests");
        Assert.assertEquals(Arrays.toString(Twentieth.gap(2,100,110)), "[101, 103]");
        Assert.assertEquals(Arrays.toString(Twentieth.gap(4,100,110)),"[103, 107]");
        Assert.assertEquals(Arrays.toString(Twentieth.gap(8,300,400)),"[359, 367]");
        Assert.assertEquals(Arrays.toString(Twentieth.gap(10,300,400)),"[307, 317]");
    }
}
