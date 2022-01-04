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
        return isPrime(n) || (factorial(n - 1) + 1) % n * n == 0;
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

    private static boolean validate(int n) {
        boolean flag = true;
        if (n < 0) {
            flag = false;
            System.out.println("Error.. number must be positive, you inputed negative");
        }
       return flag;
    }

    public static void task(BufferedReader br) {

        System.out.println("Please, enter the number:");
        int number = 0;
        try {
            number = Integer.parseInt(br.readLine());
            if(validate(number))
            {
                boolean resIsWilson = isWilson(number);
                if(resIsWilson) {
                    System.out.println("This number is Wilson prime!");
                }
                else
                {
                    System.out.println("This number is not Wilson prime!");
                    task(br);
                }
            }
        } catch (IOException e) {
            System.out.println("Error.. try again");
            task(br);
        } catch (IllegalArgumentException e) {
            System.out.println("Error.. not a number");
            task(br);
        }

    }
}


