package taskstest;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class TrailingZerosInFactorialTest {
    @Test
    public void testZeros() throws Exception {
        assertThat(TrailingZerosInFactorial.zeros(0), is(0));
        assertThat(TrailingZerosInFactorial.zeros(6), is(1));
        assertThat(TrailingZerosInFactorial.zeros(14), is(2));
    }
}