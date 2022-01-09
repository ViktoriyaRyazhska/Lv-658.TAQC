package tasks;

public class Twentieth {

    public static long[] gap(int g, long m, long n) {
        long[] result = new long[2];
        for (long i = m, j = m + g; j <= n; i++, j++) {

            boolean primeNumberFirst = true;
            boolean primeNumberSecond = true;

            for (long k = 2; k <= i/2; k++) {

                if (i % k == 0) {
                    primeNumberFirst = false;
                    break;
                }
            }

            if(!primeNumberFirst) {
                continue;
            }

            for (int l = 2; l < j/2; l++) {

                if (j % l == 0) {
                    primeNumberSecond = false;
                    break;
                }
            }

            if (primeNumberFirst && primeNumberSecond) {
                result[0] = i;
                result[1] = j;
                break;
            }

        }

        return result;
    }
}
