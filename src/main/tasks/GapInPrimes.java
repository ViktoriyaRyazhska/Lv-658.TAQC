package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    return new long[]{last, i};
                }
                last = i;
            }
        }
        return null;
    }
    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(Arrays.toString(gap(3,10,50)));
    }

    public static void runTask18(BufferedReader reader) throws IOException {
        try {
            System.out.println("Set the gap we are looking for ");
            final int gap = Integer.parseInt(reader.readLine());
            if (gap < 2) {
                throw new IllegalArgumentException("Wrong value: Must be >= 2");
            }
            System.out.println("Set start of the search ");
            final long startOfSearch = Long.parseLong(reader.readLine());
            if (startOfSearch < 3) {
                throw new IllegalArgumentException("Wrong value: Must be > 2");
            }
            System.out.println("Set the end of the search ");
            final long endOfSearch = Long.parseLong(reader.readLine());
            if (endOfSearch <= startOfSearch) {
                throw new IllegalArgumentException("Error");
            }
            System.out.println("GAP in primes: " + Arrays.toString(gap(gap, startOfSearch, endOfSearch)));
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask18(reader);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runTask18(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


