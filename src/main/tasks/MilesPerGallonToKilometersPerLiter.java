package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class MilesPerGallonToKilometersPerLiter {

    public static float milesToKilometers(float mpg) {
        final float GALLON = 4.54609188f;
        final float MILE = 1.609344f;

        float out = (mpg * MILE) / GALLON;
        return (float) Math.round(out * 100) / 100;
    }

    public static void runTask3(BufferedReader reader) throws IOException {
        try {
            System.out.println("Set miles per gallon ");
            final float mpg = Float.parseFloat(reader.readLine());
            if (mpg < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Number of kilometers per liter: " + milesToKilometers(mpg));
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask3(reader);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runTask3(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
