package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MilesToKilometers {

    private static final float kmPerMile = 1.609344f;
    private static final float literToGallon = 4.54609188f;

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

    private static boolean validate(float numberMPG) {
        boolean flag = true;
        if (numberMPG < 0) {
            flag = false;
            System.out.println("Only Positive Numbers!");
        }
        return flag;
    }

    public static float getMpgToKPL(float mpg) {
        return mpgToKPL(mpg);
    }

    public static float getRoundFloat(float f, int places) {
        return roundFloat(f, places);
    }

    public static boolean getValidate(float numberMPG) {
        return validate(numberMPG);
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter the number of miles per imperial gallon :");
        try {
            float numberMPG = Float.parseFloat(br.readLine());
            if (validate(numberMPG)) {
                float numberLPK = mpgToKPL(numberMPG);
                System.out.println("Miles per Gallon = " + roundFloat(numberMPG, 2));
                System.out.println("Kilometers per Liter = " + roundFloat(numberLPK, 2));
            } else {
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
