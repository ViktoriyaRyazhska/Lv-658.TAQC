package Tasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Third;
import tasks.TwentyThird;

import static org.testng.Assert.assertEquals;

public class TwentyThirdTaskTest {
    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    private void assertFuzzy(double m, double expect)
    {
        double merr = 1e-12;
        System.out.println("Testing " + m);
        double actual = TwentyThird.solve(m);
        System.out.println("Actual: " + actual);
        System.out.println("Expect: " + expect);
        boolean inrange = Math.abs(actual - expect) <= merr;
        if (inrange == false)
        {
            System.out.println("Expected must be near " + expect +", got " + actual);
        }
        System.out.println("-");
        assertEquals(true, inrange);
    }
    @DataProvider(name="data-provider")

    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {2.00, 5.000000000000e-01},
                {4.00, 6.096117967978e-01},
                {5.00, 6.417424305044e-01}
        };
    }

    @Test(dataProvider = "data-provider")
    void Test(double input,double expectedResult) {
        assertFuzzy(input, expectedResult);
    }

}
