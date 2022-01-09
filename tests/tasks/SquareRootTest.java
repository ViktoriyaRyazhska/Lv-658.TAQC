package tasks;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class SquareRootTest {

    @DataProvider(name = "dataProvider")
    public Object[][] dpMethodTrue(Method m){
        switch (m.getName()){
            case "isPerfectSquareNegativeTest":
                return new Object[][]{{-2}, {-5}, {-3}, {-10}};
            case "isPerfectSquareTrueTest":
                return new Object[][]{{0}, {1}, {4}, {9}};
            case "arrayOutputTest":
                int[] input = new int[] { 4, 3, 9, 7, 2, 1 };
                int[] expected = new int[] { 2, 9, 3, 49, 4, 1 };
                int[]  input2 = new int[] { 100, 101, 5, 5, 1, 1 };
                int[]  expected2 = new int[] { 10, 10201, 25, 25, 1, 1 };
                int[]  input3 = new int[] { 1, 2, 3, 4, 5, 6 };
                int[]  expected3 = new int[] { 1, 4, 9, 2, 25, 36 };
                return new Object[][]{{input, expected},{input2,expected2},{input3,expected3}};
            case "taskSizeArrayArgumentExceptionTest":
                return new Object[][]{{"-2"}, {"-5"}, {"-3"}, {"-10"}};
            case "taskArrayInputArgumentExceptionTest":
                int[] input4 = new int[] { 4, 3, -9, 7, -2, 1 };
                int[]  input5 = new int[] { 100, -101, 5, 5, -1, 1 };
                int[]  input6 = new int[] { 1, -2, 3, 4, 5, 6 };
                return new Object[][]{{"6",input4},{"6",input5},{"6",input6}};
            default:
                return null;
        }

    }
    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);
    @Test(dataProvider = "dataProvider")
    public static void isPerfectSquareNegativeTest(int value)
    {
        Assert.assertFalse(SquareRoot.getIsPerfectSquare(value));
    }
    @Test(dataProvider = "dataProvider")
    public static void isPerfectSquareTrueTest(int value)
    {
        Assert.assertTrue(SquareRoot.getIsPerfectSquare(value));
    }

    @Test(dataProvider = "dataProvider")
    public static void arrayOutputTest(int[]value, int[] expectRes)
    {
        int[] output = new int[value.length];
        SquareRoot.getArrayOutput(value.length,value,output);
        Assert.assertEquals(output,expectRes);
    }
    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "dataProvider")
    public void taskSizeArrayArgumentExceptionTest(String size) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(size, null);
        SquareRoot.task(reader);
    }
    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "dataProvider")
    public void taskArrayInputArgumentExceptionTest(String size,int [] data) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(size, null);
        Mockito.when(reader.readLine()).thenReturn(Arrays.toString(data), null);
        SquareRoot.task(reader);
    }

}