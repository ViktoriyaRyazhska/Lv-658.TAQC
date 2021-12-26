package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class StringToNumber {

    public static int convert(String str) {
        boolean flag;
        Integer number = Integer.valueOf(str);
        flag = isNumeric(str);
        if (flag) {
            return number;
        } else {
            throw new NumberFormatException("No Letters Please!");
        }
    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }

    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter the number:");
        String numberStr = br.readLine();
        int number = convert(numberStr);
        System.out.printf(" '%s' ----> %d ", numberStr, number);
    }
}