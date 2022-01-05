package tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class GapPrimesTest {
    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod(Method m){
        switch (m.getName()) {
            case "outputTest":
                return new Object[][] {{2,100,110,"Result: [101, 103]"},{4,100,110,"Result: [103, 107]"}, {2,100,103, "Result: [101, 103]"}, {8,300,400, "Result: [359, 367]"}, {10,300,400, "Result: [337, 347]"}};
            case "validatePositiveTest":
                return new Object[][] {{3, 6, 5}, {5, 12, 10},{25, 30, 25}};
            case "validateNegativeTest":
                return new Object[][] {{1, -1, 0}, {-10, -15, -10},{-25, -30, -25}};
        }
        return null;
    }

    @Test(dataProvider = "dataProvider")
    public void outputTest(int from, int to, int gap, String res) {
        Assert.assertEquals(GapPrimes.getOutput(from, to, gap),res);
    }

    @Test(dataProvider = "dataProvider")
    public void validatePositiveTest(int from, int to, int gap) {
        Assert.assertTrue(GapPrimes.getValidate(from, to, gap));
    }

    @Test(dataProvider = "dataProvider")
    public void validateNegativeTest(int from, int to, int gap) {
        Assert.assertFalse(GapPrimes.getValidate(from, to, gap));
    }
}