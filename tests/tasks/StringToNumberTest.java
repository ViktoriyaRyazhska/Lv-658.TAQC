package tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringToNumberTest {

    @Test
    void isNumericTrueTest()
    {
        Assert.assertEquals(StringToNumber.isNumeric("15"), true);
    }
    @Test
    void isNumericFalseTest()
    {
        Assert.assertEquals(StringToNumber.isNumeric("1;"), false);
    }
    @Test
    void convertIntPositiveTest()
    {
        Assert.assertEquals(StringToNumber.convert("15"), 15);
    }
    @Test
    void convertIntNegativeTest()               // fail
    {
        Assert.assertEquals(StringToNumber.convert("-19"), -19);
    }

    @Test(expectedExceptions  = NumberFormatException.class)
    void convertWithCharactersTest()
    {
        StringToNumber.convert("19/");
    }



}