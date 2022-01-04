package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class StringToNumber {

    private static int convert(String str) {
        Integer number = Integer.valueOf(str);
        return number;
    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter the number:");
        try {
            String numberStr = br.readLine();
            if (!isNumeric(numberStr)) {
                throw new IllegalArgumentException("No Letters Please!");
            }
            int number = convert(numberStr);
            System.out.printf(" '%s' ----> %d ", numberStr, number);
        } catch (IOException e) {
            e.printStackTrace();
            task(br);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            task(br);
        }
    }
}