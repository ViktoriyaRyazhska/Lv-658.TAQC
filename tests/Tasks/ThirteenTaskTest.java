package Tasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Thirteen;

import java.lang.reflect.Method;

import static org.testng.Assert.assertEquals;

public class ThirteenTaskTest {
    @DataProvider(name="data-provider")
    public Object[][] dataProviderMethod(Method m) {
        switch (m.getName()) {
            case "PositiveTest":
                return new Object[][] {
                        { 2022,4183059834009L},
                        { -1,24723578342962L },
                        {4824,135440716410000L},
                        {3568,40539911473216L},
                };
            case "NegativeTest":
                return new Object[][]{
                        {"You can enter only positive numbers!",-1231422142L},
                        {"You can enter only positive numbers!", -4L},
                };
            default:
                return null;
        }

    }

    @Test(dataProvider = "data-provider")
    void PositiveTest(int result,long input) {
        assertEquals(result, Thirteen.countAmount(input));
    }
    void NegativeTest(String result,long input) {
        assertEquals(result, Thirteen.countAmount(input));
    }
}
