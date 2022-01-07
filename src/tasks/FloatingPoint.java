package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Double.NaN;

public class FloatingPoint {

    private static double f(double x) {
        return Math.expm1(Math.log1p(x) / 2);
    }

    private static boolean validate(double x) {
        boolean flag;
        if (x < -1) {
            System.err.println("If the argument is less than -1, then the result is NaN!");
            flag = false;
        } else if (x == 0) {
            System.err.println("If the argument is 0, then the result is 0!");
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }

    public static double getF(double x) {
        return f(x);
    }

    public static boolean getValidate(double x) {
        return validate(x);
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter x for approximation of function:");
        try {
            double x = Double.parseDouble(br.readLine());
            if (validate(x)) {
                System.out.println("F(x) = " + f(x));
            } else {
                task(br);
            }
        } catch (IOException e) {
            System.out.println("Error.. try again");
            task(br);
        } catch (NumberFormatException e) {
            System.out.println("Error.. Input should be only numbers, not letters or symbols!");
            task(br);
        }
    }
}
