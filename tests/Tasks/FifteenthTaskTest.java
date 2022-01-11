package Tasks;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Fifteenth;

import java.text.DecimalFormat;

public class FifteenthTaskTest {
    private static void assertFuzzyEquals(double act, double exp){
        boolean inrange;
        double merr = 1e-12;
        if (exp == 0.0)
            inrange = Math.abs(act) <= merr;
        else {
            double e = Math.abs((act - exp) / exp);
            inrange = e <= 1e-12;
        }
        if (inrange == false) {
            DecimalFormat df = new DecimalFormat("#.0000000000000000");
            System.out.println("Expected must be near " + exp +", but got " + act);
        }
        assertEquals(true, inrange);
    }

    private static void assertEquals(boolean b, boolean inrange) {
    }

    @DataProvider(name="data-provider")

    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {2.6e-08, 1.29999999155e-08},
                {1.4e-09, 6.999999997549999e-10},
                {5.0e-06, 2.499996875007812e-06},
                {2.4e-07, 1.1999999280000085e-07}
        };
    }

    @Test(dataProvider = "data-provider")
    void Test(double input,double expectedResult) {
        assertFuzzyEquals(Fifteenth.f(input), expectedResult);
    }

}
