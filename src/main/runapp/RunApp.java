package runapp;

import tasks.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RunApp {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        runApp(reader);
    }

    public static void runApp(BufferedReader reader) throws IOException {

        System.out.println("Hi! Let's play! Set a number from 1 to 21 and get the task");
        try {
            final int numberOfTask = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            if (numberOfTask < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Your task is = " + numberOfTask);
            switch (numberOfTask) {
                case 1 -> KeepHydrated.runTask1(reader);
                case 2 -> VolumeOfACuboid.runTask2(reader);
                case 3 -> MilesPerGallonToKilometersPerLiter.runTask3(reader);
                case 4 -> ToSquareRootOrNoToSquare.runTask4(reader);
                case 5 -> CountOfPositivesSumOfNegatives.runTask5(reader);
                case 6 -> ConvertAStringToANumber.runTask6(reader);
                case 7 -> WillsonPrimes.runTask7(reader); // change class and method after creation
                case 8 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 9 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 10 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 11 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 12 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 13 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 14 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 15 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 16 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 17 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 18 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 19 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 20 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
                case 21 -> VolumeOfACuboid.runTask2(reader); // change class and method after creation
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runApp(reader);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runApp(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

