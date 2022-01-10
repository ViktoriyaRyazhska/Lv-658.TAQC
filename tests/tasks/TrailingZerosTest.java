package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;

public class TrailingZerosTest {

    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod(Method m){
        switch (m.getName()) {
            case "findZerosTest":
                return new Object[][] {{5,1}, {12,2}, {25,6},{531,131}};
        }
        return null;
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @Test(dataProvider = "dataProvider")
    public void findZerosTest(int number, int res) {
        Assert.assertEquals(TrailingZeros.getFindZeros(number),res);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void incorrectData1() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("0",  null);
        TrailingZeros.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void incorrectData2() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("-10",  null);
        TrailingZeros.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void incorrectData3() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("uyfg",  null);
        TrailingZeros.task(reader);
    }
}