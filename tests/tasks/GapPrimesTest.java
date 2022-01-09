package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;

public class GapPrimesTest {
    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod(Method m){
        switch (m.getName()) {
            case "outputTest":
                return new Object[][] {{100,110,2,"Result: [101, 103]"},{100,110,4,"Result: [103, 107]"}, {100,103,2, "Result: [101, 103]"}, {300,400,8, "Result: [359, 367]"}, {300,400,10, "Result: [337, 347]"}};
        }
        return null;
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @Test(dataProvider = "dataProvider")
    public void outputTest(int from, int to, int gap, String res) {
        Assert.assertEquals(GapPrimes.getOutput(from, to, gap),res);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void incorrectData1() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("1", "2", "0", null);
        GapPrimes.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void incorrectData2() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("10", "2", "0", null);
        GapPrimes.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void incorrectData3() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("100", "110", "0", null);
        GapPrimes.task(reader);
    }
}