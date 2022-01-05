package tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TrailingZerosTest {

    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod(Method m){
        switch (m.getName()) {
            case "findZerosTest":
                return new Object[][] {{5,1}, {12,2}, {25,6},{531,131}};
            case "validatePositiveTest":
                return new Object[][] {{5}, {25},{531}};
            case "validateNegativeTest":
                return new Object[][] {{-5}, {-25},{0}};
        }
        return null;
    }
    @Test(dataProvider = "dataProvider")
    public void findZerosTest(int number, int res) {
        Assert.assertEquals(TrailingZeros.getFindZeros(number),res);
    }
    @Test(dataProvider = "dataProvider")
    public void validatePositiveTest(int number) {
        Assert.assertTrue(TrailingZeros.getValidate(number));
    }
    @Test(dataProvider = "dataProvider")
    public void validateNegativeTest(int number) {
        Assert.assertFalse(TrailingZeros.getValidate(number));
    }


}