package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class KeepHydrated {

    private static int numberOfLitres(double time) {
        int litres;
        litres = (int) time / 2;
        return litres;
    }

    private static boolean validate(double time) {
        boolean flag = true;
        if (time < 0) {
            flag = false;
            System.out.println("Only Positive Numbers!");
        }
        return flag;
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter the time:");
        try {
            double time = Float.parseFloat(br.readLine());
            if(validate(time)){
                int litres = numberOfLitres(time);
                System.out.printf("time = %.2f ----> litres = %d \n", time, litres);
            }
            else {
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
