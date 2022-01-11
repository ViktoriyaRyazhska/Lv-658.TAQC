package Tasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Seventh;

import static org.testng.Assert.assertEquals;

public class SeventhTaskTest {
    @DataProvider(name="data-provider")

    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {1,false},
                {3,false},
                {5,true},
                {7,false},
                {13,true},
                {83,false},
                {111,false},
                {377,false},
                {563,true}
        };
    }

    @Test(dataProvider = "data-provider")
    void Test(int input,boolean expectedResult) {
        assertEquals(expectedResult, Seventh.am_i_wilson(input));
    }

}
