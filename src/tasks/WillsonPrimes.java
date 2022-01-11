package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class WillsonPrimes {

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    private static boolean isWilson(int n) {
        return isPrime(n) && (factorial(n - 1) + 1) % ((long) n * n ) == 0;
    }

    public static boolean getIsWilson(int n) {
        return isWilson(n);
    }

    public static long getFactorial(int n) {
        return factorial(n);
    }

    public static boolean getIsPrime(int n) {
        return isPrime(n);
    }

    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter the number:");

        int number = Integer.parseInt(br.readLine());
        if (number <= 0) {
            throw new IllegalArgumentException("Error.. number must be positive, you entered negative");
        }
        boolean resIsWilson = isWilson(number);
        if(resIsWilson) {
            System.out.println("This number is Wilson prime!");
        }
        else {
            System.out.println("This number is not Wilson prime!");
        }

    }
}


