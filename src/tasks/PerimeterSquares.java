package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class PerimeterSquares {
    private static int[] fibonacciSequence(int number) {
        int[] sequence = new int[number + 1];
        sequence[0] = 1;
        sequence[1] = 1;

        for (int i = 2; i < sequence.length; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence;
    }

    private static int calcPerimetr(int[] sequence) {
        int result = 0;
        for (int i: sequence) {
            result += i;
        }

        result *= 4;

        return result;
    }

    private static void output(int number) {
        int result = calcPerimetr(fibonacciSequence(number));
        System.out.println("Result: " + result);
    }

    public static void task(BufferedReader reader) {
        System.out.print("Enter a positive number:\n> ");
        try {
            int number = Integer.parseInt(reader.readLine());
            if (number <= 0) {
                throw new IllegalArgumentException("Error.. number can`t be <= 0");
            }
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
