package tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SquareRootTest {

    @DataProvider(name = "dataProvider")
    public Object[][] dpMethodTrue(Method m){
        switch (m.getName()){
            case "isPerfectSquareNegativeTest":
                return new Object[][]{{-2}, {-5}, {-3}, {-10}};
            case "isPerfectSquareTrueTest":
                return new Object[][]{{0}, {1}, {4}, {9}};
            case "validateSizePositiveTest":
                return new Object[][]{{2}, {5}, {11}, {4}};
            case "validateSizeNegativeTest":
                return new Object[][]{{-3}, {-1}, {-12}};
            case "validateArrayInputPositiveTest":
                int[]arr1 = new int[]{1,3,8,0};
                int[]arr2 = new int[]{2,12,9,3,1,6};
                int[]arr3 = new int[]{};
                return new Object[][]{{arr1},{arr2},{arr3}};
            case "validateArrayInputNegativeTest":
                int[]arr4 = new int[]{1,3,-8,0};
                int[]arr5 = new int[]{2,-12,9,3,1,6};
                int[]arr6 = new int[]{-1,1,2,3};
                return new Object[][]{{arr4},{arr5},{arr6}};
            case "arrayOutputTest":
                int[] input = new int[] { 4, 3, 9, 7, 2, 1 };
                int[] expected = new int[] { 2, 9, 3, 49, 4, 1 };
                int[]  input2 = new int[] { 100, 101, 5, 5, 1, 1 };
                int[]  expected2 = new int[] { 10, 10201, 25, 25, 1, 1 };
                int[]  input3 = new int[] { 1, 2, 3, 4, 5, 6 };
                int[]  expected3 = new int[] { 1, 4, 9, 2, 25, 36 };
                return new Object[][]{{input, expected},{input2,expected2},{input3,expected3}};
            default:
                return null;
        }

    }
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
    public static void validateSizePositiveTest(int value)
    {
        Assert.assertTrue(SquareRoot.getValidateSize(value));
    }
    @Test(dataProvider = "dataProvider")
    public static void validateSizeNegativeTest(int value)
    {
        Assert.assertFalse(SquareRoot.getValidateSize(value));
    }
    @Test(dataProvider = "dataProvider")
    public static void validateArrayInputPositiveTest(int[]value)
    {
        Assert.assertTrue(SquareRoot.getValidateArrayInput(value.length,value));
    }
    @Test(dataProvider = "dataProvider")
    public static void validateArrayInputNegativeTest(int[]value)
    {
        Assert.assertFalse(SquareRoot.getValidateArrayInput(value.length,value));
    }
    @Test(dataProvider = "dataProvider")
    public static void arrayOutputTest(int[]value, int[] expectRes)
    {
        int[] output = new int[value.length];
        SquareRoot.getArrayOutput(value.length,value,output);
        Assert.assertEquals(output,expectRes);
    }

}