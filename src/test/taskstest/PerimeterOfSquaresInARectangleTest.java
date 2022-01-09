package taskstest;

import static org.junit.Assert.*;
import java.math.BigInteger;
import java.util.Random;

import com.company.PerimeterOfSquaresInARectangle;
import org.junit.Test;


public class PerimeterOfSquaresInARectangleTest {

    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(80), PerimeterOfSquaresInARectangle.perimeter(BigInteger.valueOf(5)));
    }
    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(216), PerimeterOfSquaresInARectangle.perimeter(BigInteger.valueOf(7)));
    }
    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(14098308), PerimeterOfSquaresInARectangle.perimeter(BigInteger.valueOf(30)));
    }
}

