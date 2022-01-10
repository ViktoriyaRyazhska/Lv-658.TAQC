package Tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Fourteenth;


import java.lang.reflect.Method;
import java.util.Arrays;

public class FourteenthTaskTest {

    String b1 = "125 Market !=:125.45 \\n126 Hardware =34.95 \\n127 Video! 7.45 \\n128 Book :14.32 \\n129 Gasoline ::16.10 ";
    String b1sol = "\"Original Balance: 1000.00\n125 Market 125.45 Balance 874.55\n126 Hardware 34.95 Balance 839.60\n127 Video 7.45 Balance 832.15\n128 Book 14.32 Balance 817.83\n129 Gasoline 16.10 Balance 801.73\nTotal expense  198.27\nAverage expense  39.65\"";

    String b2 = "125 Hardware;! 24.80? \\n123 Flowers 93.50; \\n127 Meat 120.90 \\n120 Picture 34.00 \\n124 Gasoline 11.00 \\n" +
            "123 Photos;! 71.40? \\n122 Picture 93.50 \\n132 Tyres;! 19.00,?; \\n129 Stamps; 13.60 \\n129 Fruits{} 17.60 \\n129 Market;! 128.00? \\n121 Gasoline;! 13.60? ";
    String b2sol = "\"Original Balance: 1233.00\n125 Hardware 24.80 Balance 1208.20\n123 Flowers 93.50 Balance 1114.70\n127 Meat 120.90 Balance 993.80\n120 Picture 34.00 Balance 959.80\n124 Gasoline 11.00 Balance 948.80\n123 Photos 71.40 Balance 877.40\n122 Picture 93.50 Balance 783.90\n132 Tyres 19.00 Balance 764.90\n129 Stamps 13.60 Balance 751.30\n129 Fruits 17.60 Balance 733.70\n129 Market 128.00 Balance 605.70\n121 Gasoline 13.60 Balance 592.10\nTotal expense  640.90\nAverage expense  53.41\"";
    String b3 = "";
    String ex1 = " No data for making a report";

    @DataProvider(name = "data14Provider")
    public Object[][] dpMethod(Method m) {
        return switch (m.getName()) {
            case "testPositiveOriginalBalanceTest" -> new Object[][]{{1000}, {1233.258}, {1614.30}};
            case "testNegativeOriginalBalanceTest" -> new Object[][]{{-1000}, {-1233.00}, {-1614.30}, {0}};
            case "test1Test" -> new Object[][]{{1000, b1, b1sol}};
            case "test2Test" -> new Object[][]{{1233.00, b2, b2sol}};
            case "test3Test" -> new Object[][]{{b3, ex1}};
            default -> null;
        };
    }

    @Test(dataProvider = "data14Provider")
    public void testPositiveOriginalBalanceTest(double originalBalance) {
        Assert.assertEquals(Fourteenth.getOriginalBalance(originalBalance),
                "\"Original Balance: " + String.format("%.2f", originalBalance).replace(",", "."));
    }

    @Test(dataProvider = "data14Provider")
    public void testNegativeOriginalBalanceTest(double originalBalance) {
        Assert.assertEquals(Fourteenth.getOriginalBalance(originalBalance), "Please enter only positive numbers!");
    }


    @Test(dataProvider = "data14Provider")
    public void test1Test(double originalBalance, String book, String b1sol) {
        String str1 = Fourteenth.getOriginalBalance(originalBalance) + "\n";
        String[] values = Fourteenth.deleteRedundantSymbolsFromArr(Fourteenth.getElementsOfCheckBookFromUserInput(book));
        String[] checkAmounts = Fourteenth.createCheckAmountList(values);
        double[] doubleValues = Arrays.stream(checkAmounts)
                .mapToDouble(Double::parseDouble)
                .toArray();
        StringBuilder str2 = new StringBuilder();
        String str3;
        for (int i = 0; i < values.length; i++) {
            str2.append(Fourteenth.deleteRedundantSymbolsFromArr(values)[i]);
            str2.append(Fourteenth.getNewBalance(doubleValues, originalBalance)[i]);
            str2.append("\n");
        }
        str3 = Fourteenth.calculateTotalAndAverageExpenses(doubleValues);
        Assert.assertEquals(str1 + str2 + str3, b1sol);

    }

    @Test(dataProvider = "data14Provider")
    public void test2Test(double originalBalance, String book, String b2sol) {
        String str1 = Fourteenth.getOriginalBalance(originalBalance) + "\n";
        String[] values = Fourteenth.deleteRedundantSymbolsFromArr(Fourteenth.getElementsOfCheckBookFromUserInput(book));
        String[] checkAmounts = Fourteenth.createCheckAmountList(values);
        double[] doubleValues = Arrays.stream(checkAmounts)
                .mapToDouble(Double::parseDouble)
                .toArray();
        StringBuilder str2 = new StringBuilder();
        String str3;
        for (int i = 0; i < values.length; i++) {
            //  for (int j = 0; j < doubleValues.length; j++)
            str2.append(Fourteenth.deleteRedundantSymbolsFromArr(values)[i]);
            str2.append(Fourteenth.getNewBalance(doubleValues, originalBalance)[i]);
            str2.append("\n");
        }
        str3 = Fourteenth.calculateTotalAndAverageExpenses(doubleValues);
        Assert.assertEquals(str1 + str2 + str3, b2sol);

    }

    @Test(dataProvider = "data14Provider")
    public void test3Test(String book, String b3sol) {
        String[] values = Fourteenth.deleteRedundantSymbolsFromArr(Fourteenth.getElementsOfCheckBookFromUserInput(book));
        Assert.assertEquals(values[0], b3sol);

    }
}
