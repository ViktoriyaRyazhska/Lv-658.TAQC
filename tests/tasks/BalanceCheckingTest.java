package tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BalanceCheckingTest {

    @DataProvider(name = "Test-Data-for-SystemDouble-BC")
    public Object[][] dataProviderSystemDouble() {
        return new Object[][]{
                {87.41, 87.41},
                {-996.5, -996.5},
                {856, 856},
                {0, 0}};
    }

    @Test(dataProvider = "Test-Data-for-SystemDouble-BC")
    public void testSystemDoubleBC(double input, double result) {
        Assert.assertEquals(BalanceChecking.getSystemDouble(input), result);
    }

    @DataProvider(name = "Test-Data-for-DeleteSymbols-BC")
    public Object[][] dataProviderDeleteSymbols() {
        return new Object[][]{
                {"87___41", "8741"},
                {"125 Market 125.45\n126 Hardware 34.95", "125 Market 125.45126 Hardware 34.95"}};
    }

    @Test(dataProvider = "Test-Data-for-DeleteSymbols-BC")
    public void testDeleteSymbolsBC(String input, String result) {
        Assert.assertEquals(BalanceChecking.getDeleteNotUsableSymbols(input), result);
    }

    @DataProvider(name = "Test-Data-for-Balance-BC")
    public Object[][] dataProviderBalance() {
        return new Object[][]{
                {"1000.00\n125 Market 125.45\n126 Hardware 34.95\n127 Video 7.45",
                        "Original Balance: 1000.0\n" +
                                "125 Market 125.45 Balance 874.55\n" +
                                "126 Hardware 34.95 Balance 839.6\n" +
                                "127 Video 7.45 Balance 832.15\n" +
                                "Total expense 167.85\n" +
                                "Average expense 55.95"}};
    }

    @Test(dataProvider = "Test-Data-for-Balance-BC")
    public void testBalanceBC(String input, String result) {
        Assert.assertEquals(BalanceChecking.getBalance(input), result);
    }
}