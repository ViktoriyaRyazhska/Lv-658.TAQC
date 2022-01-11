package Tasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Fifth;
import tasks.Third;

import static org.testng.Assert.assertEquals;

public class ThirdTaskTest {
    @DataProvider(name="data-provider")

    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {10,3.54f},
                {20,7.08f},
                {30,10.62f}
        };
    }

    @Test(dataProvider = "data-provider")
    void Test(float input,float expectedResult) {
        assertEquals(expectedResult, Third.mpgToKPM(input));
    }

}
