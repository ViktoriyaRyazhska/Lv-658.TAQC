package runapp;

import details.Description;
import tasks.*;

import java.io.BufferedReader;
import java.io.IOException;

public class RunApp {

    public static void runApp(BufferedReader reader) throws IOException {
        System.out.println("Hi, solve some tasks. Please enter number of tasks from 1 to 21");
        try {
            int numberOfTasks = Integer.parseInt(reader.readLine());
            switch (numberOfTasks) {
                case (1) -> {
                    Description.conditionOfTask1();
                    KeepHydrated.runTask1(reader);
                    repeat(reader);
                }
                case (2) -> {
                    Description.conditionOfTask2();
                    VolumeOfACuboid.runTask2(reader);
                    repeat(reader);
                }
                case (3) -> {
                    Description.conditionOfTask3();
                    MilesPerGallonToKilometersPerLiter.runTask3(reader);
                    repeat(reader);
                }
                case (4) -> {
                    Description.conditionOfTask4();
                    ToSquareRootOrNoToSquare.runTask4(reader);
                    repeat(reader);
                }
                case (5) -> {
                    Description.conditionOfTask5();
                    CountOfPositivesSumOfNegatives.runTask5(reader);
                    repeat(reader);
                }
                case (6) -> {
                    Description.conditionOfTask6();
                    ConvertAStringToANumber.runTask6(reader);
                    repeat(reader);
                }
                case (7) -> {
                    Description.conditionOfTask7();
                    WillsonPrimes.runTask7(reader);
                    repeat(reader);
                }
                case (8) -> {
                    Description.conditionOfTask8();
                    FormattingDecimalPlaces.runTask8(reader);
                    repeat(reader);
                }
                case (9) -> {
                    Description.conditionOfTask9();
                    FindNumbersWhichAreDivisibleByGivenNumber.runTask9(reader);
                    repeat(reader);
                }
                case (10) -> {
                    Description.conditionOfTask10();
                    LookingForABenefactor.runTask10(reader);
                    repeat(reader);
                }
                case (11) -> {
                    Description.conditionOfTask11();
                    SumOfTheFirstNthTermOfSeries.runTask11(reader);
                    repeat(reader);
                }
                case (12) -> {
                    Description.conditionOfTask12();
                    BuildAPileOfCubes.runTask12(reader);
                    repeat(reader);
                }
                case (13) -> {
                    Description.conditionOfTask13();
                    EasyBalanceChecking.runTask13(reader);   // - modify
                    repeat(reader);
                }
                case (14) -> {
                    Description.conditionOfTask14();
                    FloatingPointApproximation.runTask14(reader);
                    repeat(reader);
                }
                case (15) -> {
                    Description.conditionOfTask15();
                    Rainfall.runTask15(reader);
                    repeat(reader);
                }
                case (16) -> {
                    Description.conditionOfTask16();
                    RankingNBA.runTask16(reader);
                    repeat(reader);
                }
                case (17) -> {
                    Description.conditionOfTask17();
                    HelpTheBookseller.runTask17(reader);    // - doesn't work
                    repeat(reader);
                }
                case (18) -> {
                    Description.conditionOfTask18();
                    GapInPrimes.runTask18(reader);
                    repeat(reader);
                }
                case (19) -> {
                    Description.conditionOfTask19();
                    TrailingZerosInFactorial.runTask19(reader);
                    repeat(reader);
                }
                case (20) -> {
                    Description.conditionOfTask20();
                    PerimeterOfSquaresInARectangle.runTask20(reader);
                    repeat(reader);
                }
                case (21) -> {
                    Description.conditionOfTask21();
                    WhichXForThatSum.runTask21(reader);
                    repeat(reader);
                }
            }
            if (numberOfTasks < 1 || numberOfTasks > 21) {
                throw new IllegalArgumentException("Wrong value: Please enter number of tasks from 1 to 21");
            }
        } catch (
                NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runApp(reader);

        } catch (
                IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runApp(reader);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static void repeat(BufferedReader reader) throws IOException {
        System.out.println("Do you want another? For continue type 'y' or 'n' for exit");
        final String answer = reader.readLine();
        if (answer.equals("y")) {
            RunApp.runApp(reader);
        } else if (answer.equals("n")) {
            System.out.println("Have a nice day!");
        } else {
            System.out.println("Only 'y' or 'n'");
            repeat(reader);
        }
    }
}
