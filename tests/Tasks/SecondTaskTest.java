package Tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Second;

import java.lang.reflect.Method;

public class SecondTaskTest {

    String negRes = "You should enter only positive values!";

    @DataProvider(name = "data2Provider")
    public Object[][] dpMethod(Method m) {
        return switch (m.getName()) {
            case "getIntegerVolumeOfCuboidTest" -> new Object[][]{{2, 4, 6, 48}, {3, 6, 9, 162}, {4, 8, 12, 384}};
            case "getDoubleVolumeOfCuboidTest" -> new Object[][]{{6.3, 2, 5, 63}, {4.4, 5.5, 6.6, 160}, {42.5, 74.3, 16.2, 51156}};
            case "getIncorrectVolumeOfCuboidTest" -> new Object[][]{{-2, 1, 3, negRes}, {0, 3, 4, negRes}, {-2, 0, 7, negRes}};
            default -> null;
        };
    }

    @Test(dataProvider = "data2Provider")
    public void getIntegerVolumeOfCuboidTest(double length, double width, double height, double result) {
        Assert.assertEquals(Second.getVolume(length, width, height), "Volume of a cuboid is " + result);
    }

    @Test(dataProvider = "data2Provider")
    public void getDoubleVolumeOfCuboidTest(double length, double width, double height, double result) {
        Assert.assertEquals(Second.getVolume(length, width, height), "Volume of a cuboid is " + result);
    }

    @Test(dataProvider = "data2Provider")
    public void getIncorrectVolumeOfCuboidTest(double length, double width, double height, String result) {
        Assert.assertEquals(Second.getVolume(length, width, height), result);
    }

}
