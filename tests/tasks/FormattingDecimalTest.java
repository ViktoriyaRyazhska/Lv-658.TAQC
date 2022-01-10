package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;

import static org.testng.Assert.*;

public class FormattingDecimalTest {
    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][] {
                {1, 1},
                {1, 1},
                {1, 1},
                {1, 1}
        };
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @Test(dataProvider = "dataProvider")
    public void formattingTest(double number, double expected) {
        double actual = FormattingDecimal.getFormatting(number);

        Assert.assertEquals(actual, expected);
    }
}