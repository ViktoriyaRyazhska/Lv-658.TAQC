package tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelpBooksellerTest {

    @DataProvider(name = "Test-Data-for-StockSummary-HB")
    public Object[][] dataProviderStockSummaryHB() {
        String[] lstOfArt = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] lstOf1stLetter = new String[]{"A", "B"};
        String[] lstOf1stLetter2 = new String[]{"A", "B", "C"};
        return new Object[][]{{lstOfArt, lstOf1stLetter, "(A : 200) - (B : 1140)"},
                {lstOfArt, lstOf1stLetter2, "(A : 200) - (B : 1140) - (C : 500)"}};
    }

    @Test(dataProvider = "Test-Data-for-StockSummary-HB")
    public void testStockSummaryHB(String[] lstOfArt, String[] lstOf1stLetter, String expected) {
        Assert.assertEquals(HelpBookseller.getStockSummary(lstOfArt, lstOf1stLetter), expected);
    }
}