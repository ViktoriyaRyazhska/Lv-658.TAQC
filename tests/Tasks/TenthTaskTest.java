package Tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Tenth;

import java.lang.reflect.Method;

public class TenthTaskTest {

    double[] a = new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0};
    double[] b = new double[]{14, 30, 5, 7, 9, 11, 15};
    String ex2 = "Next donation from the benefactor to the association should be: ";
    String ex1 = "VALUE ERROR! The expected donation has negative value. ";

    @DataProvider(name = "data10Provider")
    public Object[][] dpMethod(Method m) {
        return switch (m.getName()) {
            case "test1Test" -> new Object[][]{{a, 90, ex2 + 628}, {b, 92, ex2 + 645}};
            case "test2Test" -> new Object[][]{{a, 2, ex1}, {b, 2, ex1}};
            default -> null;
        };
    }


    @Test(dataProvider = "data10Provider")
    public void test1Test(double[] donations, double average, String nextDonation) {
        Assert.assertEquals(Tenth.newAverage(donations, average), nextDonation);
    }

    @Test(dataProvider = "data10Provider")
    public void test2Test(double[] donations, double average, String nextDonation) {
        Assert.assertEquals(Tenth.newAverage(donations, average), nextDonation);
    }
}
