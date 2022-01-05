package tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static org.testng.Assert.*;

public class PerimeterSquaresTest {

    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod(Method m){
        switch (m.getName()) {
            case "outputTest":
                return new Object[][] {{5,"Result:80"}, {7,"Result:216"}};
            case "validatePositiveTest":
                return new Object[][] {{5}, {7},{531}};
            case "validateNegativeTest":
                return new Object[][] {{-5}, {-7},{0}};
        }
        return null;
    }

    @Test(dataProvider = "dataProvider")
    public void outputTest(int number, String res) {
        Assert.assertEquals(PerimeterSquares.getOutput(number),res);
    }

    @Test(dataProvider = "dataProvider")
    public void validatePositiveTest(int number) {
        Assert.assertTrue(PerimeterSquares.getValidate(number));
    }

    @Test(dataProvider = "dataProvider")
    public void validateNegativeTest(int number) {
        Assert.assertFalse(PerimeterSquares.getValidate(number));
    }
}