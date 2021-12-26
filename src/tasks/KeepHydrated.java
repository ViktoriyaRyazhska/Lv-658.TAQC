package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class KeepHydrated {

    public static int numberOfLitres(double time) {
        int litres;
        litres = (int)time /2;
        return litres;
    }

    public static void task(BufferedReader br) throws IOException{
        System.out.println("Please, enter the time:");
        try {
            double time = Float.parseFloat(br.readLine());
            if (time < 0 ){
                throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
            }
            int litres = numberOfLitres(time);
            System.out.printf("time = %.2f ----> litres = %d", time, litres);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
