package tasks;

import runapp.RunApp;

import java.io.BufferedReader;
import java.io.IOException;


public class ConvertAStringToANumber {

    public static void conditionOfTask() {
        System.out.println("We need a function that can transform a string into a number. What ways of achieving this do you know?\n" +
                "Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.");
    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void runTask6(BufferedReader reader) throws IOException {
        conditionOfTask();
        try {
            System.out.println("Set String of number");
            final String getString = reader.readLine();
            System.out.println("Number is: " + stringToNumber(getString));
            RunApp.repeat(reader);
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask6(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





