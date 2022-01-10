package Tasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Fifth;
import tasks.Ninth;

import static org.testng.Assert.assertEquals;

public class NinthTaskTest {
    @DataProvider(name="data-provider")

    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {new int[] {2,4,6},new int[] {1,2,3,4,5,6},2},
                {new int[] {3,6},new int[] {1,2,3,4,5,6},3},
                {new int[] {0,4},new int[] {0,1,2,3,4,5,6},4},
                {new int[] {0,4},new int[] {0,1,2,3,4,5,6},2},
                {new int[] {},new int[] {},4}
        };
    }

    @Test(dataProvider = "data-provider")
    void Test(int [] result,int[] numbers,int divisor) {
        assertEquals(result, Ninth.divideBy(numbers,divisor));
    }
}
