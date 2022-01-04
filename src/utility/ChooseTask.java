package utility;

import tasks.*;

import java.io.BufferedReader;
import java.io.IOException;

public class ChooseTask extends Constants {
    private static int LIST = 1;

    public static int getLIST() {
        return LIST;
    }

    public static int chooseTask(BufferedReader reader) {
        System.out.println(listOfTasks(LIST));
        System.out.print("Choose task:\n> ");
        int task = -1;
        try {
            task = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error.. try again");
            chooseTask(reader);
        } catch (NumberFormatException e) {
            System.out.println("Error.. not a number");
            chooseTask(reader);
        }
        return task;
    }

    private static String listOfTasks(int list) {
        String result = "";
        switch (list) {
            case 1:
                result = ListOfTasks.getFirstList();
                break;
            case 2:
                result = ListOfTasks.getSecondList();
                break;
            case 3:
                result = ListOfTasks.getThirdList();
                break;
        }

        return result;
    }


    private static void select(BufferedReader reader) {
        System.out.print("Y for continue\nN for exit\n> ");
        try {
            String choice = reader.readLine().toUpperCase();
            if (choice.equals("Y")) {
                switch (LIST) {
                    case 1:
                        runFirst(reader, chooseTask(reader));
                        break;
                    case 2:
                        runSecond(reader, chooseTask(reader));
                        break;
                    case 3:
                        runThird(reader, chooseTask(reader));
                        break;
                }
            } else if (choice.equals("N")) {
                System.exit(0);
            } else {
                System.out.println("Error.. this option doesn`t exist");
                select(reader);
            }
        } catch (IOException e) {
            System.out.println("Error.. try again");
            select(reader);
        }
    }


    public static void runFirst(BufferedReader reader, int task) {
        switch (task) {
            default:
                System.out.println("Error.. this option doesn`t exist");
                chooseTask(reader);
                break;
            case NEXT:
                LIST++;
                runSecond(reader, chooseTask(reader));
                break;
            case EXIT:
                break;
            case 1:
                //ArtificialRain.task(reader);
                select(reader);
                break;
            case 2:
                LookingBenefactor.task(reader);
                select(reader);
                break;
            case 3:
                TrailingZeros.task(reader);
                select(reader);
                break;
            case 4:
                StringToNumber.task(reader);
                select(reader);
                break;
            case 5:
                TheSmallest.task(reader);
                select(reader);
                break;
            case 6:
                PerimeterSquares.task(reader);
                select(reader);
                break;
            case 7:
                KeepHydrated.task(reader);
                select(reader);
                break;
            case 8:
                MilesToKilometers.task(reader);
                select(reader);
                break;
            case 9:
                WillsonPrimes.task(reader);
                select(reader);
                break;
        }
    }

    public static void runSecond(BufferedReader reader, int task) {
        switch (task) {
            default:
                System.out.println("Error.. this option doesn`t exist");
                runSecond(reader, chooseTask(reader));
                break;
            case PREV:
                LIST--;
                runFirst(reader, chooseTask(reader));
                break;
            case NEXT:
                LIST++;
                runThird(reader, chooseTask(reader));
                break;
            case EXIT:
                break;
            case 1:
                Rainfall.task(reader);
                select(reader);
                break;
            case 2:
                FormattingDecimal.task(reader);
                select(reader);
                break;
            case 3:
                SquareRoot.task(reader);
                select(reader);
                break;
            case 4:
                VolumeCuboid.task(reader);
                select(reader);
                break;
            case 5:
                //WhichX.task(reader);
                select(reader);
                break;
            case 6:
                BuildCubes.task(reader);
                select(reader);
                break;
            case 7:
                CountSalutes.task(reader);
                select(reader);
                break;
            case 8:
                BalanceChecking.task(reader);
                select(reader);
                break;
            case 9:
                SumOfTerm.task(reader);
                select(reader);
                break;
        }
    }

    public static void runThird(BufferedReader reader, int task) {
        switch (task) {
            default:
                System.out.println("Error.. this option doesn`t exist");
                runThird(reader, chooseTask(reader));
                break;
            case PREV:
                LIST--;
                runSecond(reader, chooseTask(reader));
                break;
            case EXIT:
                break;
            case 1:
                GapPrimes.task(reader);
                select(reader);
                break;
            case 2:
                HelpBookseller.task(reader);
                select(reader);
                break;
            case 3:
                CountPositive.task(reader);
                select(reader);
                break;
            case 4:
                IsDivisible.task(reader);
                select(reader);
                break;
            case 5:
                RankingNBA.task(reader);
                select(reader);
                break;
            case 6:
                FloatingPoint.task(reader);
                select(reader);
                break;
        }
    }
}
