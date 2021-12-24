package tasks;

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
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean am_i_wilson(double n) {
        if(isPrime((int)n))
        {
            double check = factorialUsingStreams((int)(n-1))/Math.pow(n,2);
            return Math.ceil(check) != Math.floor(check) &&Math.floor(check)!=0;
        }
        else
            return false;
    }
}
