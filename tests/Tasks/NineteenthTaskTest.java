package Tasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Nineteenth;

import static org.testng.Assert.assertEquals;

public class NineteenthTaskTest {
    @DataProvider(name="data-provider")

    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {new String[] {"rainy", "clear", "rainy", "cloudy"},2},
                {new String[] {"sunny", "windy", "sunny", "clear"},0},
                {new String[] {"rainy", "rainy", "rainy", "rainy", "thunderstorms", "rainy"},1}
        };
    }

    @Test(dataProvider = "data-provider")
    void Test(String [] input,int expectedResult) {

        assertEquals(Nineteenth.minUmbrellas(input), expectedResult);
    }


}
