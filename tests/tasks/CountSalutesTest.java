package tasks;

import com.sun.source.tree.ModuleTree;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
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

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void invalidDataTest1() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("", null);

        CountSalutes.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void invalidDataTest2() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("-><-))", null);

        CountSalutes.task(reader);
    }

}