package tasks;

import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;


public class TrailingZeros {
    private static int findZeros(int number) {
        int result = number / 5;

        return result;
    }

    private static String output(int number) {
        String result = "Result: " + findZeros(number);

        return result;
    }

    public static int getFindZeros(int number) {
        return findZeros(number);
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