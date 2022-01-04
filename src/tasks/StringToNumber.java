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

    private static boolean validate(String str) {
        boolean flag = true;
        if (!isNumeric(str)) {
            flag = false;
            System.out.println("Just integers & No Letters Please!");
        }
        return flag;
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter the number:");
        try {
            String numberStr = br.readLine();
            if (validate(numberStr)) {
                int number = convert(numberStr);
                System.out.printf(" '%s' ----> %d \n", numberStr, number);
            }
            else{
                task(br);
            }
        } catch (IOException e) {
            System.out.println("Error. Try again.");
            task(br);
        } catch (IllegalArgumentException e) {
            System.out.println("No letters! You should enter number.");
            task(br);
        }
    }
}