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

public class PerimeterSquaresTest {

    @DataProvider(name = "dataProvider")
    public Object[][] dpMethod(){
        return new Object[][] {{5,"Result:80"}, {7,"Result:216"}};
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @Test(dataProvider = "dataProvider")
    public void outputTest(int number, String res) {
        Assert.assertEquals(PerimeterSquares.getOutput(number),res);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void incorrectData1() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("0",  null);
        PerimeterSquares.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void incorrectData2() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("-10",  null);
        PerimeterSquares.task(reader);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void incorrectData3() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("uyfg",  null);
        PerimeterSquares.task(reader);
    }
}