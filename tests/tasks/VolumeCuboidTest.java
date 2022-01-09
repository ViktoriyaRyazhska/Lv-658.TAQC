package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;

public class VolumeCuboidTest {
    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod(Method m) {
        return switch (m.getName()) {
            case "calculateVolume" -> new Object[][]{{6, 3, 9, 162}, {21, 9, 6, 1134}, {14, 2, 5, 140}};
            case "taskOuputTest" -> new Object[][]{{3.1, 6, 2.}, {6, 4, 12}, {34.8, 98.2, 367.2}};
            case "taskNegativeValueInputArgumentExceptionTest" -> new Object[][]{{3.7, 0, 8}, {-3, 6.1, 15}, {0, 14.4, -8}};
            default -> null;
        };
    }
    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);
    @Test(dataProvider = "dataProvider")
    public void calculateVolume(double length, double width, double height,double res) {
        Assert.assertEquals(VolumeCuboid.getCalculateVolume(length,width,height),res);
    }
    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "dataProvider")
    public void taskNegativeValueInputArgumentExceptionTest(double length, double width, double height) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(String.valueOf(length), String.valueOf(width),String.valueOf(height),null);
        VolumeCuboid.task(reader);
    }
    @Test(dataProvider = "dataProvider")
    public void taskOuputTest(double length, double width, double height) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(String.valueOf(length), String.valueOf(width),String.valueOf(height),null);
        VolumeCuboid.task(reader);
    }

}