package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class MilesToKilometers {

    static final float kmPerMile = 1.609344f;
    static final float litresPerGallon = 4.54609188f;

    public static float mpgToKPL(float mpg) {
        float lpk;
        lpk = litresPerGallon / (mpg * kmPerMile);
        return lpk;
    }

    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter the number of miles per imperial gallon :");
        try {
            float numberMPG = Float.parseFloat(br.readLine());
            if (numberMPG < 0) {
                throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
            }
            double numberLPK = mpgToKPL(numberMPG);
            System.out.println("Miles per Gallon = " + numberMPG);
            System.out.println("Kilometers per Liter = " + numberLPK);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
