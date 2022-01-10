package Tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.TwentySecond;

import java.lang.reflect.Method;

public class TwentySecondTaskTest {

    String ex1 = "The perimeter of squares in a rectangle =  ";
    String ex2 = "Number of squares should be positive number!";

    @DataProvider(name = "data22Provider")
    public Object[][] dpMethod(Method m) {
        return switch (m.getName()) {
            case "calculatePerimeterPositiveTest" -> new Object[][]{{5, ex1 + 80}, {7, ex1 + 216}, {30, ex1 + 14098308}};
            case "calculatePerimeterNegativeTest" -> new Object[][]{{-5, ex2}, {-7, ex2}, {0, ex2}};
            default -> null;
        };
    }

    @Test(dataProvider = "data22Provider")
    public void calculatePerimeterPositiveTest(int number, String res) {
        Assert.assertEquals(TwentySecond.perimeter(number), res);
    }

    @Test(dataProvider = "data22Provider")
    public void calculatePerimeterNegativeTest(int number, String res) {
        Assert.assertEquals(TwentySecond.perimeter(number), res);
    }

}
