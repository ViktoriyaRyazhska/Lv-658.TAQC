package tasks;

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
    private Object[][] dataProvider(Method method) {
        return switch(method.getName()) {
            default -> null;
            case "divisibleByTest" -> new Object[][]{
                    {new int[]{1, 1, 1, 1}, 1, new int[]{1, 1, 1, 1}},
                    {new int[]{1, 1, 1, 1}, 2, new int[]{}},
                    {new int[]{2, 1, 2, 1}, 2, new int[]{2, 2}},
                    {new int[]{0, 1, 2, 3}, 3, new int[]{0, 3}}
            };

            case "validateTrueTest" -> new Object[][]{
                    {new int[]{1, 1, 1, 1}, 1},
                    {new int[]{1, 1, 1, 1}, 2},
                    {new int[]{2, 1, 2, 1}, 2},
                    {new int[]{0, 1, 2, 3}, 3}
            };

            case "validateFalseTest" -> new Object[][]{
                    {new int[]{1, 1, 1, 1}, 0},
                    {new int[]{}, 2},
                    {new int[]{}, 0},
            };
        };
    }

    @Test(dataProvider = "dataProvider")
    public void divisibleByTest(int[] numbers, int div, int[] expected) {
        int[] actual = IsDivisible.getDivisibleBy(numbers, div);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataProvider")
    public void validateTrueTest(int[] numbers, int div) {
        boolean actual = IsDivisible.getValidate(numbers, div);
        Assert.assertTrue(actual);
    }

    @Test(dataProvider = "dataProvider")
    public void validateFalseTest(int[] numbers, int div) {
        boolean actual = IsDivisible.getValidate(numbers, div);
        Assert.assertFalse(actual);
    }


}