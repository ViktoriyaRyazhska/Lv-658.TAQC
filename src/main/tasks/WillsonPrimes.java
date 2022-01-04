package tasks;

import java.io.BufferedReader;
import java.io.IOException;


public class WillsonPrimes {


    public static boolean am_i_wilson(long n) {
        if (1 == n || 0 == n) {
            return false;
        }

        long modulus = n * n;
        long product = 1;
        for (long factor = 2; factor < n; factor++)
            product = (product * factor) % modulus;
        return product + 1 == modulus;
    }

    public static void runTask7(BufferedReader reader) throws IOException {

        System.out.println("Enter a number:");
        try {
            int number = Integer.parseInt(reader.readLine());
            if (number < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            boolean resIsWilson = am_i_wilson(number);
            if (resIsWilson) {
                System.out.println("This is Wilson prime number");
            } else {
                System.out.println("This is not Wilson prime number");
            }
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