package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TrailingZeros {
    private static int findZeros(int number) {
        int result = number / 5;

        return result;
    }

    private static void output(int number) {
        int result = findZeros(number);
        System.out.println("Result: " + result);
    }

    public static void task(BufferedReader reader) {
        System.out.print("Enter a number:\n> ");
        try {
            int number = Integer.parseInt(reader.readLine());
            if (number < 0) {
                throw new IllegalArgumentException("Error.. number can`t be negative");
            }
            output(number);
        } catch (IOException e) {
            System.out.println("Error.. try again");
            task(reader);
        } catch (NumberFormatException e) {
            System.out.println("Error.. not a number");
            task(reader);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            task(reader);
        }
    }
}
