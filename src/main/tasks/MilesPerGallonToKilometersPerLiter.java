package tasks;

import runapp.RunApp;

import java.io.BufferedReader;
import java.io.IOException;

public class MilesPerGallonToKilometersPerLiter {

    public static void conditionOfTask() {
        System.out.println("Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.\n" +
                "Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).\n" +
                "Make sure to round off the result to two decimal points. If the answer ends with a 0, it should be rounded off without the 0. So instead of 5.50, we should get 5.5.\n" +
                "Some useful associations relevant to this kata: 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres");
    }

    public static float milesToKilometers(float mpg) {
        float gallon = 4.54609188f;
        float mile = 1.609344f;

        float out = (mpg * mile) / gallon;
        return (float) Math.round(out * 100) / 100;
    }

    public static void runTask3(BufferedReader reader) throws IOException {
        conditionOfTask();
        try {
            System.out.println("Set miles per gallon ");
            final float mpg = Float.parseFloat(reader.readLine());
            if (mpg < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Number of kilometers per liter " + milesToKilometers(mpg));
            RunApp.repeat(reader);
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
