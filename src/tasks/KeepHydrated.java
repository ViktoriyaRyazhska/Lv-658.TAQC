package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class KeepHydrated {

    public static int numberOfLitres(double time) {
        int litres;
        litres = (int)time /2;
        return litres;
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter the time:");
        try {
            double time = Float.parseFloat(br.readLine());
            int litres = numberOfLitres(time);
            System.out.printf("time = %f ----> litres = %d", time, litres);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("You are expected to enter time with a number.");
        }
    }

}
