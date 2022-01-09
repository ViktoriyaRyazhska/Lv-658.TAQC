package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;

public class KeepHydratedTest {
    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod(Method m) {
        return switch (m.getName()) {
            case "numberOfLitres" -> new Object[][]{{14.64, 7}, {0.97, 0}, {1600.20, 800}, {80, 40}};
            case "taskTimeTest" -> new Object[][]{{1.5}, {9.9}, {4.6}};
            case "taskTimeArgumentExceptionTest" -> new Object[][]{{-1.3}, {-31}, {-12}};
            default -> null;
        };
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @Test(dataProvider = "dataProvider")
    public void numberOfLitres(double val, int res) {
        Assert.assertEquals(KeepHydrated.getNumberOfLitres(val), res);
    }


    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "dataProvider")
    public void taskTimeArgumentExceptionTest(double time) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(String.valueOf(time), null);
        KeepHydrated.task(reader);
    }
    @Test( dataProvider = "dataProvider")
    public void taskTimeTest(double time) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(String.valueOf(time), null);
        KeepHydrated.task(reader);
    }

}