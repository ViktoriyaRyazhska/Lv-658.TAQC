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

    private static boolean validate(int number) {
        boolean flag = true;

        if (number <= 0) {
            System.out.println("Error.. number must be positive");
            flag = false;
        }

        return flag;
    }

    private static String output(int number) {
        String result = "Result:" + calcPerimetr(fibonacciSequence(number));

        return result;
    }

    public static String getOutput(int number){
        return output(number);
    }

    public static boolean getValidate(int number){
        return validate(number);
    }

    public static void task(BufferedReader reader) {
        System.out.print("Enter a positive number:\n> ");
        try {
            int number = Integer.parseInt(reader.readLine());
            if(validate(number)) {
                output(number);
            } else {
                task(reader);
            }
        } catch (IOException e) {
            System.out.println("Error.. try again");
            task(reader);
        } catch (IllegalArgumentException e) {
            System.out.println("Error.. not a number");
            task(reader);
        }
    }
}
