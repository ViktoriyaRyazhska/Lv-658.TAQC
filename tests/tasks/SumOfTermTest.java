package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.testng.Assert.*;

public class SumOfTermTest {
    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {0, "0.00"},
                {15, "1.94"},
                {9, "1.77"}
        };
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @Test(dataProvider = "dataProvider")
    public void sumOfTermTest(int n, String expected) {
        String actual = SumOfTerm.getSumOfTerm(n);

        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void invalidData1() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("-1", null);

        SumOfTerm.task(reader);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void invalidData2() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("hello", null);

        SumOfTerm.task(reader);
    }
}



















