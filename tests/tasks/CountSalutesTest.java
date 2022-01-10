package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.nio.BufferOverflowException;

import static org.testng.Assert.*;

public class CountSalutesTest {
    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {">-->--<--<", 8},
                {"---", 0},
                {">->->", 0},
                {">>--", 0},
                {">--<", 2},
                {">-->--<", 4}
        };
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @Test(dataProvider = "dataProvider")
    public void countSalutesTest(String linePeople, long expected) {
        long actual = CountSalutes.getCountSalutes(linePeople);

        Assert.assertEquals(actual, expected);
    }


}