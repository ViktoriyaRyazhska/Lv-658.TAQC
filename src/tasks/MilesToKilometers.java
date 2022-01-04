package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MilesToKilometers {

    static final float kmPerMile = 1.609344f;
    static final float literToGallon = 4.54609188f;

    private static float mpgToKPL(float mpg) {
        float kpl;
        kpl = mpg * (kmPerMile / literToGallon);
        return kpl;
    }

    private static float roundFloat(float f, int places) {
        BigDecimal bigDecimal = new BigDecimal(Float.toString(f));
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.floatValue();
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter the number of miles per imperial gallon :");
        try {
            float numberMPG = Float.parseFloat(br.readLine());
            if (numberMPG < 0) {
                throw new IllegalArgumentException("Only Positive Numbers!");
            }
            float numberLPK = mpgToKPL(numberMPG);
            System.out.println("Miles per Gallon = " + roundFloat(numberMPG, 2));
            System.out.println("Kilometers per Liter = " + roundFloat(numberLPK, 2));
        } catch (IOException e) {
            e.printStackTrace();
            task(br);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            task(br);
        }
    }
}
