package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class FloatingPoint {

    private static double f(double x) {
        return Math.expm1(Math.log1p(x) / 2);
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter x for approximation of function:");
        try {
            double x = Double.parseDouble(br.readLine());

            System.out.println("F(x) = "+ f(x));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
