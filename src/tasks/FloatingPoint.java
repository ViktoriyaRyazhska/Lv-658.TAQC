package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Double.NaN;

public class FloatingPoint {

    private static double f(double x) {
        return Math.expm1(Math.log1p(x) / 2);
    }

    public static double getF(double x) {
        return f(x);
    }

    public static void task(BufferedReader br) throws IOException, IllegalArgumentException {
        System.out.println("Please, enter x for approximation of function:");
            double x = Double.parseDouble(br.readLine());
        if (x < -1) {
            throw new IllegalArgumentException("If the argument is less than -1, then the result is NaN!");
        } else if (x == 0) {
            throw new IllegalArgumentException("If the argument is 0, then the result is 0!");
        }
            System.out.println("F(x) = " + f(x));
    }
}
