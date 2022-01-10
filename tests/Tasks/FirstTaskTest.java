package Tasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.First;

import java.lang.reflect.Method;

import static org.testng.Assert.assertEquals;

public class FirstTaskTest {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod(Method m) {
        switch (m.getName()) {
            case "PositiveTest":
                return new Object[][]{
                        {1, 2},
                        {0, 0.97},
                        {7, 14.64},
                        {800, 1600.20},
                        {40, 80}

                };
            case "NegativeTest":
                return new Object[][]{
                        {"Please enter positive number", -2},
                        {"Please enter positive number", -4},
                };
            default:
                return null;
        }
    }

        @Test(dataProvider = "data-provider")
        void PositiveTest ( int result, double input){
            assertEquals(result, First.count(input));
        }
        @Test(dataProvider = "data-provider")
        void NegativeTest ( String result, double input){
            assertEquals(result, First.count(input));
        }
}
