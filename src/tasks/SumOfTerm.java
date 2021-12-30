package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class SumOfTerm {
    private static String sumOfTerm(int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (3 * i + 1);

        return String.format("%.2f", sum);
    }

    public static void task(BufferedReader br) {
        try {
            System.out.println("Please, enter the quantity of numbers by which we find the sum: ");
            int inputQuantityNumbers = Integer. parseInt(br.readLine());
            System.out.println("Sum is: " +  sumOfTerm(inputQuantityNumbers));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
