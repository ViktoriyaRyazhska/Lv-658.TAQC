package tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class StringToNumberTest {

    @DataProvider(name = "dataProvider")
    public Object[][] dpMethodTrue(Method m){
        switch (m.getName()) {
            case "isNumericTrueTest","validateTrueTest":
                return new Object[][] {{"15"}, {"20"},{"1"}};
            case "isNumericFalseTest", "validateFalseTest":
                return new Object[][] {{"0/"}, {"*45"},{"1.2"}};
            case "convertIntPositiveTest":
                return new Object[][] {{"15",15}, {"0",0},{"12",12}};
            case "convertIntNegativeTest":
                return new Object[][] {{"-29",-29}, {"-1",-1},{"-1234",-1234}};

        }
        return null;

    }

    @Test(dataProvider = "dataProvider")
    public void isNumericTrueTest(String val) {
        Assert.assertTrue(StringToNumber.getIsNumeric(val));
    }
    @Test(dataProvider = "dataProvider")
    public void isNumericFalseTest(String val) {
        Assert.assertFalse(StringToNumber.getIsNumeric(val));
    }

    @Test(dataProvider = "dataProvider")
    void convertIntPositiveTest(String val, int res) {
        Assert.assertEquals(StringToNumber.getConvert(val), res);
    }

    @Test(dataProvider = "dataProvider")
    void convertIntNegativeTest(String val, int res) {
        Assert.assertEquals(StringToNumber.getConvert(val), res);
    }

    @Test(dataProvider = "dataProvider")
    void validateFalseTest(String val) {
        Assert.assertFalse(StringToNumber.getValidate(val));
    }

    @Test(dataProvider = "dataProvider")
    void validateTrueTest(String val) {
        Assert.assertTrue(StringToNumber.getValidate(val));
    }
}