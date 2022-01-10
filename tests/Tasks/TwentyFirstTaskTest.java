package Tasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.First;
import tasks.TwentyFirst;

import static org.testng.Assert.assertEquals;

public class TwentyFirstTaskTest {
    @DataProvider(name="data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { 0,0},
                { 1,6 },
                {2,12},
        };
    }

    @Test(dataProvider = "data-provider")
    void Test(int result,int input) {
        assertEquals(result, TwentyFirst.zeros(input));
    }
}
