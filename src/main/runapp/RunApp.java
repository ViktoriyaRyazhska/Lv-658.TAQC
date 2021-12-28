package runapp;

import tasks.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RunApp {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        runApp(reader);
    }
    public static void runApp (BufferedReader reader) throws IOException {
        try {
        System.out.println("Hi, solve some tasks. Please enter number of tasks from 1 to 21");
        int numberOfTasks = Integer.parseInt(reader.readLine());
            switch (numberOfTasks) {
                case 1 -> KeepHydrated.runTask1(reader);
                case 2 -> VolumeOfACuboid.runTask2(reader);
                case 3 -> MilesPerGallonToKilometersPerLiter.runTask3(reader);
                case 4 -> ToSquareRootOrNoToSquare.runTask4(reader);
                case 5 -> CountOfPositivesSumOfNegatives.runTask5(reader);
                case 6 -> ConvertAStringToANumber.runTask6(reader);
                case 7 -> WillsonPrimes.runTask7(reader);
            }
            if (numberOfTasks < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runApp(reader);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runApp(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void repeat(BufferedReader reader) throws IOException {
        System.out.println("Do you want another? Type 'Yes' or 'No'");
        final String answer = reader.readLine();
        while (answer.equals("Yes")) {
            RunApp.runApp(reader);
        }
        if (answer.equals("No")) {
            System.out.println("Have a nice day!");
        }
        else {
            System.out.println("Only Yes or No");
            repeat(reader);
        }
    }
}
