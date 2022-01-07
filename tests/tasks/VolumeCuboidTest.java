package tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class VolumeCuboidTest {
    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod(Method m) {
        return switch (m.getName()) {
            case "calculateVolume" -> new Object[][]{{6, 3, 9, 162}, {21, 9, 6, 1134}, {14, 2, 5, 140}};
            case "validatePositiveTest" -> new Object[][]{{3.1, 6, 2.}, {6, 4, 12}, {34.8, 98.2, 367.2}};
            case "validateNegativeTest" -> new Object[][]{{3, 0, 8}, {-3, 6, 15}, {0, 14, -8}};
            default -> null;
        };
    }
    @Test(dataProvider = "dataProvider")
    public void calculateVolume(double length, double width, double height,double res) {
        Assert.assertEquals(VolumeCuboid.getCalculateVolume(length,width,height),res);
    }
    @Test(dataProvider = "dataProvider")
    public void validatePositiveTest(double length, double width, double height) {
        Assert.assertTrue(VolumeCuboid.getValidate(length,width,height));
    }
    @Test(dataProvider = "dataProvider")
    public void validateNegativeTest(double length, double width, double height) {
        Assert.assertFalse(VolumeCuboid.getValidate(length,width,height));
    }

}