package utility;

import tasks.*;

import java.io.BufferedReader;
import java.io.IOException;

public class ChooseTask extends Constants {
    private static int TASK;
    private static int LIST = 1;

    public static int getTASK() {
        return TASK;
    }

    public static int chooseTask(BufferedReader reader) throws IOException, NumberFormatException {
        switch (LIST) {
            case 1:
                System.out.println(ListOfTasks.getFirstList());
                break;
            case 2:
                System.out.println(ListOfTasks.getSecondList());
                break;
            case 3:
                System.out.println(ListOfTasks.getThirdList());
                break;
        }
        System.out.print("Choose option:\n> ");

        int option = Integer.parseInt(reader.readLine());
        TASK = option;

        return option;
    }

    private static void select(BufferedReader reader) throws IOException {
        System.out.print("Y for continue\nN for exit\n> ");
        String option = reader.readLine().toLowerCase();
        if (option.equals("y")) {
            switch (LIST) {
                case 1:
                    runTaskFirst(reader, chooseTask(reader));
                case 2:
                    runTaskSecond(reader, chooseTask(reader));
                case 3:
                    runTaskThird(reader, chooseTask(reader));
            }
        } else if (option.equals("n")) {
            System.exit(1);
        } else {
            System.out.println("Error.. this option doesn`t exist");
            select(reader);
        }
    }


    public static void runTaskFirst(BufferedReader reader, int task) throws IOException {
        try {
            switch (task) {
                default:
                    throw new IllegalArgumentException("Error.. this option doesn`t exist");
                case NEXT:
                    LIST++;
                    runTaskSecond(reader, chooseTask(reader));
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
        } catch (IOException e) {
            System.err.println("Error.. try again");
            runTaskFirst(reader, TASK);

        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            runTaskFirst(reader, TASK);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            runTaskFirst(reader, chooseTask(reader));
        }
    }

    public static void runTaskSecond(BufferedReader reader, int task) throws IOException {
        try {
            switch (task) {
                default:
                    throw new IllegalArgumentException("Error.. this option doesn`t exist");
                case NEXT:
                    LIST++;
                    runTaskThird(reader, chooseTask(reader));
                    break;
                case PREV:
                    LIST--;
                    runTaskFirst(reader, chooseTask(reader));
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
                    // WhichX.task(reader);
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
        } catch (IOException e) {
            System.err.println("Error.. try again");
            runTaskSecond(reader, TASK);

        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            runTaskSecond(reader, TASK);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            runTaskSecond(reader, chooseTask(reader));
        }
    }

    public static void runTaskThird(BufferedReader reader, int task) throws IOException {
        try {
            switch (task) {
                default:
                    throw new IllegalArgumentException("Error.. this option doesn`t exist");
                case PREV:
                    LIST--;
                    runTaskSecond(reader, chooseTask(reader));
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
        } catch (IOException e) {
            System.err.println("Error.. try again");
            runTaskThird(reader, TASK);

        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            runTaskThird(reader, TASK);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            runTaskThird(reader, chooseTask(reader));
        }
    }
}