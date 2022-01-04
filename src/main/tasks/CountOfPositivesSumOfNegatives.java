package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0, sum = 0;
        for (int i : input) {
            if (i > 0) count++;
            if (i < 0) sum += i;
        }
        return new int[]{count, sum};
    }

    private static int[] extractIntegersFromText(String string) throws IOException {
        String[] integersAsText = string.split(",");
        int[] arrayOfInt = new int[integersAsText.length];
        int i = 0;
        for (String textValue : integersAsText) {
            arrayOfInt[i] = Integer.parseInt(textValue);
            i++;
        }
        return arrayOfInt;
    }


    public static void runTask5(BufferedReader reader) throws IOException {
        try {
            System.out.println("Set array of integers in the format '1,2,3,-1,-2,-3'");
            final String stringFromConsole = reader.readLine();
            System.out.println("New array, " + Arrays.toString(countPositivesSumNegatives(extractIntegersFromText(stringFromConsole))));
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask5(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

