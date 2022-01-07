package tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class CountPositiveTest {
    @DataProvider(name = "dataProvider")
    public Object[][] dpMethodTrue(Method m){
         switch (m.getName()){
            case "arrayOutputTest":
                 int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
                 int[] arrayExpected = new int[]{10, -65};
                 int[] array2 = new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14};
                 int[] arrayExpected2 = new int[]{8, -50};
                 return new Object[][]{{array,arrayExpected},{array2,arrayExpected2}};
             case "validateSizePositiveTest":
                 return new Object[][]{{2}, {5}, {11}, {4}};
             case "validateSizeNegativeTest":
                 return new Object[][]{{-3}, {-1}, {-12}};
             default:
                 return null;
        }
    }
    @Test
    public void arrayOutputNullTest() {
        int[] arrEmpty = new int[]{};
        int[] arrActualRes = new int[]{};
        int[] arrExpected = new int[]{};
        CountPositive.getArrayOutput(arrEmpty.length,arrEmpty,arrActualRes);
        Assert.assertEquals(arrActualRes,arrExpected);
    }
    @Test(dataProvider = "dataProvider")
    public void arrayOutputTest(int[]arr, int[]arrRes) {
        int[] arrOutput = new int[2];
        CountPositive.getArrayOutput(arr.length,arr,arrOutput);
        Assert.assertEquals(arrOutput,arrRes);
    }
    @Test(dataProvider = "dataProvider")
    public void validateSizePositiveTest(int size) {
        Assert.assertTrue(CountPositive.getValidateSize(size));
    }
    @Test(dataProvider = "dataProvider")
    public void validateSizeNegativeTest(int size) {
        Assert.assertFalse(CountPositive.getValidateSize(size));
    }







}