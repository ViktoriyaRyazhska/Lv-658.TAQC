package tasks;

import runapp.RunApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {

    public static void conditionOfTask() {
        System.out.println("Given an array of integers.\n" +
                "Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.\n" +
                "If the input array is empty or null, return an empty array.");
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

    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0, sum = 0;
        for (int i : input) {
            if (i > 0) count++;
            if (i < 0) sum += i;
        }
        return new int[]{count, sum};
    }

    public static void runTask5(BufferedReader reader) throws IOException {
        conditionOfTask();
        try {
            System.out.println("Set array of integers in the format '1,2,3,-1,-2,-3'");
            System.out.println("New array, where the first element is the count of positives numbers and the second element is sum of negative numbers" + Arrays.toString(countPositivesSumNegatives(extractIntegersFromText())));
            RunApp.repeat(reader);
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask5(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

