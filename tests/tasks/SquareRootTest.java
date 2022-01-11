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

    @DataProvider(name = "ProviderPerfectSquareNegativeTest")
    public Object[][] dpPerfectSquareNegativeTest() {
        return new Object[][]{{-2}, {-5}, {-3}, {-10}};
    }
    @DataProvider(name = "ProviderPerfectSquareTrueTest")
    public Object[][] dpPerfectSquareTrueTest() {
        return new Object[][]{{0}, {1}, {4}, {9}};
    }
    @DataProvider(name = "ProviderArrayOutputTest")
    public Object[][] dpArrayOutputTest() {
        int[] input = new int[] { 4, 3, 9, 7, 2, 1 };
        int[] expected = new int[] { 2, 9, 3, 49, 4, 1 };
        int[]  input2 = new int[] { 100, 101, 5, 5, 1, 1 };
        int[]  expected2 = new int[] { 10, 10201, 25, 25, 1, 1 };
        int[]  input3 = new int[] { 1, 2, 3, 4, 5, 6 };
        int[]  expected3 = new int[] { 1, 4, 9, 2, 25, 36 };
        return new Object[][]{{input, expected},{input2,expected2},{input3,expected3}};
    }
    @DataProvider(name = "ProviderSizeArrayArgumentExceptionTest")
    public Object[][] dpSizeArrayArgumentExceptionTest() {
        return new Object[][]{{"-2"}, {"-5"}, {"-3"}, {"-10"}};
    }
    @DataProvider(name = "ProviderArrayInputArgumentExceptionTest")
    public Object[][] dpArrayInputArgumentExceptionTest() {
        String line = "4\n3\n-9\n7\n-2\n1";
        String line2 = "2\n3\n1\n1\n2\n-4";
        String line3 = "-2\n-11\n-13\n3\n9\n5";
        return new Object[][]{{6,line},{6,line2},{6,line3}};
    }
    @DataProvider(name = "ProviderTaskArrayOutputTest")
    public Object[][] dptaskArrayOutputTest() {
        String line4 = "4\n3\n9\n7\n2\n1";
        String line5 = "2\n3\n1\n1\n2\n4";
        String line6 = "2\n11\n13\n3\n9\n5";
        return new Object[][]{{6,line4},{6,line5},{6,line6}};
    }

    @Mock
    BufferedReader reader = Mockito.mock(BufferedReader.class);
    @Test(dataProvider = "ProviderPerfectSquareNegativeTest")
    public static void isPerfectSquareNegativeTest(int value) {
        Assert.assertFalse(SquareRoot.getIsPerfectSquare(value));
    }
    @Test(dataProvider = "ProviderPerfectSquareTrueTest")
    public static void isPerfectSquareTrueTest(int value) {
        Assert.assertTrue(SquareRoot.getIsPerfectSquare(value));
    }
    @Test(dataProvider = "ProviderArrayOutputTest")
    public static void arrayOutputTest(int[]value, int[] expectRes) {
        int[] output = new int[value.length];
        SquareRoot.getArrayOutput(value.length,value,output);
        Assert.assertEquals(output,expectRes);
    }
    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "ProviderSizeArrayArgumentExceptionTest")
    public void taskSizeArrayArgumentExceptionTest(String size) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(size, null);
        SquareRoot.task(reader);
    }
    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "ProviderArrayInputArgumentExceptionTest")
    public void taskArrayInputArgumentExceptionTest(int size,String data) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(String.valueOf(size),data,null);
        SquareRoot.task(reader);
    }
    @Test(dataProvider = "ProviderTaskArrayOutputTest")
    public void taskArrayOutputTest(int size,String data) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(String.valueOf(size),data,null);
        SquareRoot.task(reader);
    }

}
