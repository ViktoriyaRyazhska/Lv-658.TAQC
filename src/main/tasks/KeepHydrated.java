package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class KeepHydrated {

    public static int litersPerHour(double time) {
        return (int) (time / 2);
    }

    public static void runTask1(BufferedReader reader) throws IOException {
        try {
            System.out.println("Set time in hours ");
            final double hourOfCycling = Double.parseDouble(reader.readLine());
            if (hourOfCycling < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Nathan will drink: " + litersPerHour(hourOfCycling) + " litres");
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