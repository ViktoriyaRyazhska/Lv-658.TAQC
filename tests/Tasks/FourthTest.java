package Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.Fourth;

import java.util.Arrays;

public class FourthTest {

    @Test
    public void basicTest() {
        int[] input = new int[] { 4, 3, 9, 7, 2, 1 };
        int[] expected = new int[] { 2, 9, 3, 49, 4, 1 };
        Assert.assertEquals(Arrays.toString(Fourth.squareOrSquareRoot(input)), Arrays.toString(expected));

        input = new int[] { 100, 101, 5, 5, 1, 1 };
        expected = new int[] { 10, 10201, 25, 25, 1, 1 };
        Assert.assertEquals(Arrays.toString(Fourth.squareOrSquareRoot(input)), Arrays.toString(expected));

        input = new int[] { 1, 2, 3, 4, 5, 6 };
        expected = new int[] { 1, 4, 9, 2, 25, 36 };
        Assert.assertEquals(Arrays.toString(Fourth.squareOrSquareRoot(input)), Arrays.toString(expected));
    }
}
