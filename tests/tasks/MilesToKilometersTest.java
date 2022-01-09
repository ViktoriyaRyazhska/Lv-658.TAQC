package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;

public class MilesToKilometersTest {
    @DataProvider(name = "dataProvider")
    public Object[][] dpMethodTrue(Method m){
        return switch (m.getName()) {
            case "mpgToKPLTest" -> new Object[][]{{1.5f, 0.531009f}, {3f, 1.062018f}, {5.6f, 1.9824337f}};
            case "roundFloatTest" -> new Object[][]{{1.319f, 2, 1.32f}, {9.79999f, 2, 9.8f}, {5.230f, 2, 5.23f}};
            case "taskIllegalArgumentExceptionTest" -> new Object[][]{{"-2"}, {"-5"}, {"-3"}, {"-10"}};
            default -> null;
        };

    }
    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);
    @Test(dataProvider = "dataProvider")
    public void mpgToKPLTest(float val, float res) {
        Assert.assertEquals(MilesToKilometers.getMpgToKPL(val),res);
    }
    @Test(dataProvider = "dataProvider")
    public void roundFloatTest(float val,int places, float res) {
        Assert.assertEquals(MilesToKilometers.getRoundFloat(val,places),res);
    }
    @Test(expectedExceptions = IllegalArgumentException.class,dataProvider = "dataProvider")
    public void taskIllegalArgumentExceptionTest(String size) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(size, null);
        MilesToKilometers.task(reader);
    }
}