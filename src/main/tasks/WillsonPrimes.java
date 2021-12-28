package tasks;

import runapp.RunApp;

import java.io.BufferedReader;
import java.io.IOException;

public class WillsonPrimes {

    public static void conditionOfTask() {
        System.out.println("Wilson primes satisfy the following condition. Let P represent a prime number.\n" +
                "Then ((P-1)! + 1) / (P * P) should give a whole number.\n" +
                "Your task is to create a function that returns true if the given number is a Wilson prime.");
    }

    public static boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long factorial(int p) {
        long factorial = 1;
        for (int i = 2; i <= p; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static boolean isWilson(int p) {
        return isPrime(p) || (factorial(p - 1) + 1) % p * p == 0;
    }

    public static void runTask7(BufferedReader reader) throws IOException {

        System.out.println("Enter a number:");
        conditionOfTask();
        try {
            int number = Integer.parseInt(reader.readLine());
            if (number < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            boolean resIsWilson = isWilson(number);

            if (resIsWilson) {
                System.out.println("This is Wilson prime number");
            } else {
                System.out.println("This is not Wilson prime number");
            }
            RunApp.repeat(reader);
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask7(reader);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runTask7(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}