
package Tasks;

        import org.testng.annotations.DataProvider;
        import org.testng.annotations.Test;
        import tasks.Fifth;
        import tasks.First;

        import static org.testng.Assert.assertEquals;

public class FifthTaskTest {

    @DataProvider(name="data-provider")

    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {new int[] {10, -65},new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}},
                {new int[] {8, -50},new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}},
                {new int[] {},new int[] {}}
        };
    }

    @Test(dataProvider = "data-provider")
    void Test(int [] result,int[] input) {
        assertEquals(result, Fifth.count(input));
    }


}