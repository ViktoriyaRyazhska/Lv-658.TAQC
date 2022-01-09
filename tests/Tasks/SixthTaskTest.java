package Tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Sixth;

import java.lang.reflect.Method;

public class SixthTaskTest {

    String exp1 = "The converted number is ";
    String exp2 = "Please, enter only integer numbers!";
    String exp3 = "Please, enter only numbers without any redundant symbols!";

    @DataProvider(name = "data6Provider")
    public Object[][] dpMethodTrue(Method m) {
        return switch (m.getName()) {
            case "conversionPositiveIntegersTest" -> new Object[][]{{"1234", exp1 + 1234}, {"605", exp1 + 605}, {"1405", exp1 + 1405}, {"0", exp1 + 0}};
            case "conversionNegativeIntegersTest" -> new Object[][]{{"-7", exp1 + -7}, {"-31", exp1 + -31}, {"-49", exp1 + -49}, {"-9876", exp1 + -9876}};
            case "conversionDoubleNumbersTest" -> new Object[][]{{"1.2", exp2}, {"1.5", exp2}, {"0.9", exp2}, {"23.25", exp2}};
            case "conversionNonNumericValuesTest" -> new Object[][]{{"0/", exp3}, {"*45", exp3}, {"12hello", exp3}};
            default -> null;
        };

    }

    @Test(dataProvider = "data6Provider")
    public void conversionDoubleNumbersTest(String val, String exp) {
        Assert.assertEquals(Sixth.conversion(val), exp);
    }

    @Test(dataProvider = "data6Provider")
    public void conversionNonNumericValuesTest(String val, String exp) {
        Assert.assertEquals(Sixth.conversion(val), exp);
    }

    @Test(dataProvider = "data6Provider")
    public void conversionPositiveIntegersTest(String val, String res) {
        Assert.assertEquals(Sixth.conversion(val), res);
    }

    @Test(dataProvider = "data6Provider")
    public void conversionNegativeIntegersTest(String val, String exp) {
        Assert.assertEquals(Sixth.conversion(val), exp);
    }
}
