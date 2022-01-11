package Tasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Eleventh;
import tasks.Third;

import static org.testng.Assert.assertEquals;

public class EleventhTaskTest {
    @DataProvider(name="data-provider")

    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {5,"1.57"},
                {9,"1.77"},
                {15,"1.94"}
        };
    }

    @Test(dataProvider = "data-provider")
    void Test(int input,String expectedResult) {
        assertEquals(expectedResult, Eleventh.seriesSum(input));
    }

}
