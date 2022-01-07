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

    private static boolean validate(int number) {
        boolean flag = true;
        if (number <= 0) {
            flag = false;
            System.out.println("Error.. number must be positive");
        }

        return flag;
    }

    public static int getFindZeros(int number) {
        return findZeros(number);
    }
    public static boolean getValidate(int number){
        return validate(number);
    }

    public static void task(BufferedReader reader) {
        System.out.print("Enter a positive number:\n> ");
        try {
            int number = Integer.parseInt(reader.readLine());

            if (validate(number)) {
                System.out.println(output(number));
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