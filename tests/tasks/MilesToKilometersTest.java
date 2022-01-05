package tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class MilesToKilometersTest {
    @DataProvider(name = "dataProvider")
    public Object[][] dpMethodTrue(Method m){
        switch (m.getName()) {
            case "mpgToKPLTest":
                return new Object[][] {{1.5f,0.531009f}, {3f,1.062018f},{5.6f,1.9824337f}};
            case "roundFloatTest":
                return new Object[][] {{1.319f,2,1.32f}, {9.79999f,2,9.8f},{5.230f,2,5.23f}};
            case "validatePositiveTest":
                return new Object[][] {{1.5f}, {9.912f},{0.1f}};
            case "validateNegativeTest":
                return new Object[][] {{-0.1f}, {-31.343f},{-1234f}};

        }
        return null;

    }
    @Test(dataProvider = "dataProvider")
    public void mpgToKPLTest(float val, float res) {
        Assert.assertEquals(MilesToKilometers.getMpgToKPL(val),res);
    }

    @Test(dataProvider = "dataProvider")
    public void roundFloatTest(float val,int places, float res) {
        Assert.assertEquals(MilesToKilometers.getRoundFloat(val,places),res);
    }

    @Test(dataProvider = "dataProvider")
    public void validatePositiveTest(float val) {
        Assert.assertTrue(MilesToKilometers.getValidate(val));
    }
    @Test(dataProvider = "dataProvider")
    public void validateNegativeTest(float val) {
        Assert.assertFalse(MilesToKilometers.getValidate(val));
    }

}