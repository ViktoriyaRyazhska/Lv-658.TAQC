package tasks;

import java.io.BufferedReader;
import java.io.IOException;


public class ConvertAStringToANumber {

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void runTask6(BufferedReader reader) throws IOException {
        try {
            System.out.println("Set String of number");
            final String getString = reader.readLine();
            System.out.println("Number is: " + stringToNumber(getString));
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask6(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





