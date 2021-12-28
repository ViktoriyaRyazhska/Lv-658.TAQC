package tasks;

import runapp.RunApp;

import java.io.BufferedReader;
import java.io.IOException;

public class KeepHydrated {

    public static int litersPerHour(double time) {
        return (int) (time / 2);
    }

    public static void conditionOfTask() {
        System.out.println("Nathan loves cycling.\n" +
                "Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.\n" +
                "You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.");
    }


    public static void runTask1(BufferedReader reader) throws IOException {
        conditionOfTask();
        try {
            System.out.println("Set time in hours ");
            final double hourOfCycling = Double.parseDouble(reader.readLine());
            if (hourOfCycling < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Nathan will drink " + litersPerHour(hourOfCycling) + " litres");
            RunApp.repeat(reader);
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask1(reader);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runTask1(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}