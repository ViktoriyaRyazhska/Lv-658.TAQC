package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;

public class FloatingPointTest {

    @DataProvider(name = "Test-Data-for-F-FP")
    public Object[][] dataProviderF() {
        return new Object[][]{
                {2.6e-08, 1.2999999915500002e-08},
                {1.4e-09, 6.99999999755e-10},
                {5.0e-06, 2.4999968750078126e-06},
                {2.4e-07, 1.1999999280000085e-07}};
    }

    @Test(dataProvider = "Test-Data-for-F-FP")
    public void testPositiveFFP(double input, double result) {
        Assert.assertEquals(FloatingPoint.getF(input), result);
    }

    @DataProvider(name = "Test-Data-for-Validate-FP")
    public Object[][] dataProviderValidateFP() {
        return new Object[][]{
                {-3},
                {-1566},
                {0}};
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "Test-Data-for-Validate-FP")
    void taskIllegalArgumentExceptionXTest(int x) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(String.valueOf(x), null);
        FloatingPoint.task(reader);
    }
}