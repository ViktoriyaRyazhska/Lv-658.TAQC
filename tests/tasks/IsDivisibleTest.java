package tasks;

import org.mockito.Mock;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;

import org.mockito.Mockito;

import static org.testng.Assert.*;

public class IsDivisibleTest {
    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {new int[]{1, 1, 1, 1}, 1, new int[]{1, 1, 1, 1}},
                {new int[]{1, 1, 1, 1}, 2, new int[]{}},
                {new int[]{2, 1, 2, 1}, 2, new int[]{2, 2}},
                {new int[]{0, 1, 2, 3}, 3, new int[]{0, 3}}
        };
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @Test(dataProvider = "dataProvider")
    public void divisibleByTest(int[] numbers, int div, int[] expected) {
        int[] actual = IsDivisible.getDivisibleBy(numbers, div);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void incorrectData1() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("1", "2", "0", null);

        IsDivisible.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void incorrectData2() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("0", "2", "1", null);

        IsDivisible.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void invalidDataTest1() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("1", "1", "hello", null);

        IsDivisible.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void invalidDataTest2() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("1", "hello", "1", null);

        IsDivisible.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void invalidDataTest3() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("hello", "1", "1", null);

        IsDivisible.task(reader);
    }

}