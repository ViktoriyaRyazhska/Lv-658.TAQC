package tasks;

import runapp.RunApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ToSquareRootOrNoToSquare {

    public static void conditionOfTask() {
        System.out.println("To square(root) or not to square(root)\n" +
                "Write a method, that will get an integer array as parameter and will process every number from this array.\n" +
                "Return a new array with processing every number of the input-array like this:");
    }


    public static int[] toSquareOrNot(int[] array) {
        for (int i = 0; i < array.length; i++) {

            double sqr = Math.sqrt(array[i]);
            if (sqr == Math.round(sqr)) {
                array[i] = (int) sqr;
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }

    private static int[] extractIntegersFromText() throws IOException {
        String string1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String[] integersAsText = string1.split(",");
        int[] arrayOfInt = new int[integersAsText.length];
        int i = 0;
        for (String textValue : integersAsText) {
            arrayOfInt[i] = Integer.parseInt(textValue);
            i++;
        }
        return arrayOfInt;
    }

    public static void runTask4(BufferedReader reader) throws IOException {
        conditionOfTask();
        try {
            System.out.println("Set array of integers");
            System.out.println("New array" + Arrays.toString(toSquareOrNot(extractIntegersFromText())));
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask4(reader);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong value: Set a non-negative number");
            runTask4(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Do you want another? Type 'Yes' or 'No'");
        final String answer = reader.readLine();
        if (answer.equals("Yes")) {
            RunApp.runApp(reader);
        }
        if (answer.equals("No")) {
            System.out.println("Have a nice day!");
        }
    }
}
