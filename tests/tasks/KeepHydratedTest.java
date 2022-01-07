package tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class KeepHydratedTest {
    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod(Method m){
        return switch (m.getName()) {
            case "numberOfLitres" -> new Object[][]{{14.64,7}, {0.97,0}, {1600.20,800},{80,40}};
            case "validatePositiveTest" -> new Object[][]{{1.5}, {9.9}, {4.6}};
            case "validateNegativeTest" -> new Object[][]{{-0.1}, {-31}, {-12}};
            default -> null;
        };
    }
    @Test(dataProvider = "dataProvider")
    public void numberOfLitres(double val, int res) {
        Assert.assertEquals(KeepHydrated.getNumberOfLitres(val),res);
    }
    @Test(dataProvider = "dataProvider")
    public void validatePositiveTest(double val) {
        Assert.assertTrue(KeepHydrated.getValidate(val));
    }
    @Test(dataProvider = "dataProvider")
    public void validateNegativeTest(double val) {
        Assert.assertFalse(KeepHydrated.getValidate(val));
    }
}