package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class WillsonPrimes {

    public static boolean isPrime(int n) {
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

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static boolean isWilson(int n) {
        return isPrime(n) || (factorial(n - 1) + 1) % n * n == 0;
    }

    public static void task(BufferedReader br) {

        System.out.println("Please, enter the number:");
        try {
            int number = Integer.parseInt(br.readLine());
            boolean resIsWilson = isWilson(number);
            if(resIsWilson) {
                System.out.println("This number is Wilson prime!");
            }
            else
            {
                System.out.println("This number is not Wilson prime!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}


