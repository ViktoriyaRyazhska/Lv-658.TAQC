package Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.TwentyFourth;

import java.util.Arrays;

public class TwentyFourthTest {

    @Test
    public void test() {
        Assert.assertEquals(Arrays.toString(TwentyFourth.smallest(261235)), "[126235, 2, 0]");
        Assert.assertEquals(Arrays.toString(TwentyFourth.smallest(209917)), "[29917, 0, 1]");
        Assert.assertEquals(Arrays.toString(TwentyFourth.smallest(285365)), "[238565, 3, 1]");
        Assert.assertEquals(Arrays.toString(TwentyFourth.smallest(269045)), "[26945, 3, 0]");
        Assert.assertEquals(Arrays.toString(TwentyFourth.smallest(296837)), "[239687, 4, 1]");
    }
}
