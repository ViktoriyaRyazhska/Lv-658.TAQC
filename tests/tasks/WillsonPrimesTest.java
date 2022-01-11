package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;

import static org.testng.Assert.*;

public class WillsonPrimesTest {
    @DataProvider
    private Object[][] dataProvider(Method method) {
        return switch(method.getName()) {
            default -> null;
            case "isPrimeTest" -> new Object[][]{
                    {2, true},
                    {5, true},
                    {373, true},
                    {4, false},
                    {1, false},
                    {-3, false}
            };

            case "factorialTest" -> new Object[][]{
                    {0, 1},
                    {3, 6},
                    {1, 1}
            };

            case "isWilsonTest" -> new Object[][]{
                    {5, true},
                    {13, true},
                    {563, false},
                    {3, false},
                    {0, false},
                    {-5, false}
            };
        };
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @Test(dataProvider = "dataProvider")
    public void isPrimeTest(int n, boolean expected) {
        boolean actual = WillsonPrimes.getIsPrime(n);

        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataProvider")
    public void factorialTest(int n, long expected) {
        long actual = WillsonPrimes.getFactorial(n);

        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataProvider")
    public void isWilsonTest(int n, boolean expected) {
        boolean actual = WillsonPrimes.getIsWilson(n);

        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void invalidDataTest1() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("hello", null);

        WillsonPrimes.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void invalidDataTest2() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("-2", null);

        WillsonPrimes.task(reader);
    }
}