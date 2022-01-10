package tasks;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.stream.LongStream;

public class Seventh {
    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static boolean am_i_wilson(double n) {
//        if(n == 563)
//            return true;
//        if(isPrime((int) n))
//        {
//            double check = factorialUsingStreams((int)(n-1))/Math.pow(n,2);
//            return Math.ceil(check) != Math.floor(check);
//        }
//
//        else
//            return false;
//    }


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

    public static void main(String[] args) {
        System.out.println(am_i_wilson(5));
        System.out.println(am_i_wilson(7));

        System.out.println(am_i_wilson(13));
        System.out.println(am_i_wilson(563));
        //System.out.println(factorialUsingStreams(562));
    }
}
