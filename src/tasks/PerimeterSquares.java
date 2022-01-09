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

    private static String output(int number) {
        String result = "Result:" + calcPerimetr(fibonacciSequence(number));

        return result;
    }

    public static String getOutput(int number){
        return output(number);
    }

    public static void task(BufferedReader reader) throws IOException, IllegalArgumentException {
        System.out.print("Enter a positive number:\n> ");
        int number = Integer.parseInt(reader.readLine());
        if (number <= 0) {
            throw new IllegalArgumentException("Error.. number must be positive");
        }

        System.out.println(output(number));
    }
}
