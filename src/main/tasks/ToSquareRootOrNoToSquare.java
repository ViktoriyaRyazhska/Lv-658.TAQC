package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ToSquareRootOrNoToSquare {

    public static int[] toSquareOrNot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                throw new IllegalArgumentException("Only Positive Numbers!");
            }
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
    }
}
