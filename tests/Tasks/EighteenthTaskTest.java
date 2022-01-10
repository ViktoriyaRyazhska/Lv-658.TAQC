package Tasks;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tasks.Eighteenth;

import java.lang.reflect.Method;
import java.util.HashMap;

public class EighteenthTaskTest {

    String chBook1 = "ABAR 200, CDXE 500, BKWR 250, BTSQ 890, DRTY 600";
    String chBook2 = "ABAR 200, AKWR 250, CDXE 500, BTSQ 890, DRTY 600";
    String cat1 = "A, D, B";
    String ex1 = "Your result looks like:  (A : 200) - (D : 600) - (B : 1140)";
    String ex11 = "Your result looks like:  (A : 450) - (D : 600) - (B : 890)";
    String cat2 = "A, B, W";
    String ex2 = "Your result looks like:  (A : 200) - (B : 1140) - (W : 0)";
    String ex22 = "Your result looks like:  (A : 450) - (B : 890) - (W : 0)";
    String cat3 = "Z, B, C";
    String ex3 = "Your result looks like:  (Z : 0) - (B : 1140) - (C : 500)";
    String ex33 = "Your result looks like:  (Z : 0) - (B : 890) - (C : 500)";
    String cat4 = "A, B, C, D, Z";
    String ex4 = "Your result looks like:  (A : 200) - (B : 1140) - (C : 500) - (D : 600) - (Z : 0)";
    String ex44 = "Your result looks like:  (A : 450) - (B : 890) - (C : 500) - (D : 600) - (Z : 0)";
    String emptyChBook = "";
    String emptyCat = "";
    String chBook3 = "ABAR 200, CDXE 500, BKWR 250, BTSQ 890, DRTY 600";
    String cat5 = "A, B";
    String ex5 = "No data for making a report!";
    String[] arr = new String[0];

    @DataProvider(name = "data18Provider")
    public Object[][] dpMethod(Method m) {
        return switch (m.getName()) {
            case "before_test" -> new Object[][]{{chBook1}, {chBook2}, {chBook3}};
            case "before" -> new Object[][]{{cat1}, {cat2}, {cat3}, {cat4}, {cat5}};
            case "test1Test" -> new Object[][]{{chBook1, cat1, ex1}, {chBook1, cat2, ex2}, {chBook1, cat3, ex3}, {chBook1, cat4, ex4}};
            case "test2Test" -> new Object[][]{{chBook2, cat1, ex11}, {chBook2, cat2, ex22}, {chBook2, cat3, ex33}, {chBook2, cat4, ex44}};
            case "test3Test" -> new Object[][]{{arr, ex5}};
            case "test4Test" -> new Object[][]{{emptyChBook, emptyCat, ex5}, {emptyChBook, cat5, ex5}, {chBook3, emptyCat, ex5}};

            default -> null;
        };
    }

    @Test(dataProvider = "data18Provider")
    public HashMap<String, Integer> before_test(String checkbook1) {
        String[] stockListValues = Eighteenth.getElementsOfStockListFromUserInput(checkbook1);
        String[] firstLettersFromStockList = Eighteenth.getFirstLettersFromStockList(stockListValues);
        String[] bookQuantities = Eighteenth.createListOfQuantities(stockListValues);
        return Eighteenth.codeQuantityPairs(firstLettersFromStockList, bookQuantities);
    }

    @Test(dataProvider = "data18Provider")
    public String[] before(String cc) {
        return Eighteenth.getCategoriesListFromUserInput(cc);
    }

    @Test(dataProvider = "data18Provider")
    public void test1Test(String checkbook1, String cc, String exp) {
        HashMap<String, Integer> pairs = before_test(checkbook1);
        String[] categoriesValues = before(cc);
        Assert.assertEquals("Your result looks like:  " + Eighteenth.stockSummary(pairs, categoriesValues),
                exp);
    }

    @Test(dataProvider = "data18Provider")
    public void test2Test(String checkbook2, String cc, String exp) {
        HashMap<String, Integer> pairs = before_test(checkbook2);
        String[] categoriesValues = before(cc);
        Assert.assertEquals("Your result looks like:  " + Eighteenth.stockSummary(pairs, categoriesValues),
                exp);
    }

    @Test(dataProvider = "data18Provider")
    public void test3Test(String[] lstOfArt, String exp) {
        Assert.assertEquals("" + Eighteenth.getFirstLettersFromStockList(lstOfArt)[0],
                exp);
    }

    @Test(dataProvider = "data18Provider")
    public void test4Test(String art, String cc, String exp) {
        HashMap<String, Integer> pairs = before_test(art);
        String[] categoriesValues = before(cc);
        Assert.assertEquals("" + Eighteenth.stockSummary(pairs, categoriesValues),
                exp);
    }

}
