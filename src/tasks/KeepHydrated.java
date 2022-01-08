package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class KeepHydrated {

    private static int numberOfLitres(double time) {
        int litres;
        litres = (int) time / 2;
        return litres;
    }

    public static int getNumberOfLitres(double time) {
        return numberOfLitres(time);
    }

    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter the time:");
        double time = Float.parseFloat(br.readLine());
        if (time < 0) {
            throw new IllegalArgumentException("Only Positive Numbers!");
        }
        int litres = numberOfLitres(time);
        System.out.printf("time = %.2f ----> litres = %d \n", time, litres);
    }
}
