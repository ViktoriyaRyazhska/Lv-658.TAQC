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

public class LookingBenefactorTest {
    @DataProvider
    private Object[][] dataProvider(Method method){
        return switch(method.getName()) {
            default -> null;
            case "expectedAmountOfMoneyTest" -> new Object[][]{
                    {new double[]{14, 30, 5, 7, 9, 11, 15}, 30, 149},
                    {new double[]{1, 1, 1, 1}, 5, 21}
            };

            case "expectedAmountOfMoneyTestInvalid" -> new Object[][]{
                    {new double[]{2, 2, 2, 2}, 1},
                    {new double[]{1, 1, 1, 1}, 1}
            };
        };
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);

    @Test(dataProvider = "dataProvider")
    public void expectedAmountOfMoneyTest(double[] arr, double averageAmountDonations, double expected) {
        double actual = LookingBenefactor.getExpectedAmountOfMoney(arr, averageAmountDonations);

        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataProvider", expectedExceptions = IllegalArgumentException.class)
    public void expectedAmountOfMoneyTestInvalid(double[] arr, double averageAmountDonations) {
        double actual = LookingBenefactor.getExpectedAmountOfMoney(arr, averageAmountDonations);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void invalidInputTest() throws IOException {
        Mockito.when(reader.readLine()).thenReturn("3", "qwerty", null);

        LookingBenefactor.task(reader);
    }
}