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

    public static boolean isPrimeNumber(int p) {
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
        return isPrimeNumber(p) || (factorial(p - 1) + 1) % p * p == 0;
    }

    public static void runTask7(BufferedReader reader) throws IOException {
        conditionOfTask();
        System.out.println("Set the number:");
        try {
            int number = Integer.parseInt(reader.readLine());
            boolean wilson = isWilson(number);
            if (wilson) {
                System.out.println("This is Wilson prime number");
            } else {
                System.out.println("This is not Wilson prime number");
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask7(reader);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong value: Set a non-negative number");
            runTask7(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Do you want another? Type 'Yes' or 'No'");
        String answer = reader.readLine();
        if (answer.equals("Yes")) {
            RunApp.runApp(reader);
        }
        if (answer.equals("No")) {
            System.out.println("Have a nice day!");
        }
        else
            System.out.println("Only Yes or No");
        answer = reader.readLine();
    }
}


