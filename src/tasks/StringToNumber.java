package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class StringToNumber {

    private static int convert(String str) {
        Integer number = Integer.valueOf(str);
        return number;
    }

    //^(\+|-)?\d+$
    //[0-9]+
    private static boolean isNumeric(String str) {
        return str != null && str.matches("^(\\+|-)?\\d+$");
    }

    public static boolean getIsNumeric(String str) {
        return isNumeric(str);
    }

    public static int getConvert(String str) {
        return convert(str);
    }

    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter the number:");
        String numberStr = br.readLine();
        if (!isNumeric(numberStr)) {
            throw new IllegalArgumentException("Just integers & No Letters Please!");
        }
        int number = convert(numberStr);
        System.out.printf(" '%s' ----> %d \n", numberStr, number);
    }
}