package tasks;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Seventh {
    public static boolean am_i_wilson(double n) {
        int input = (int) n;
        if (!BigInteger.valueOf(input).isProbablePrime(100)) {
            return false;
        }
        return fact(input - 1).add(BigDecimal.ONE).divide(BigDecimal.valueOf(input * input), 1, RoundingMode.HALF_UP)
                .remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0;
    }

    private static BigDecimal fact(int n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigDecimal.valueOf(i));
        }
        return result;
    }
}
