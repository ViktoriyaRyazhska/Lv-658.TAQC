package tasks;

import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
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
             case "taskIllegalArgumentExceptionSizeTest":
                 return new Object[][]{{-2}, {-5}, {-11}, {-4}};
             case "taskInputArrayTest":
                 String line4 = "4\n3\n-9\n7\n2\n-1";
                 String line5 = "2\n-3\n1\n1\n2\n-4";
                 String line6 = "-2\n-11\n13\n3\n-9\n5";
                 return new Object[][]{{6,line4},{6,line5},{6,line6}};
             default:
                 return null;
        }
    }
    BufferedReader reader = Mockito.mock(BufferedReader.class);
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
    @Test(expectedExceptions = IllegalArgumentException.class,dataProvider = "dataProvider")
    void taskIllegalArgumentExceptionSizeTest(int val) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(String.valueOf(val),null);
        CountPositive.task(reader);
    }
    @Test(dataProvider = "dataProvider")
    void taskInputArrayTest(int size,String data) throws IOException {
        Mockito.when(reader.readLine()).thenReturn(String.valueOf(size),data,null);
        CountPositive.task(reader);
    }

}