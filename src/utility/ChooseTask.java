package utility;

import tasks.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseTask extends Constants {
    public static void chooseFirst(BufferedReader reader) {
        System.out.println("Choose task: ");
        System.out.println(ListOfTasks.getFirstList());
        System.out.print("> ");
        int task = -1;
        try {
            task = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error.. try again");
            chooseFirst(reader);
        } catch (NumberFormatException e) {
            System.out.println("Error.. not a number");
            chooseFirst(reader);
        }

        switch (task) {
            default:
                System.out.println("Error.. this option doesn`t exist");
                chooseFirst(reader);
                break;
            case NEXT:
                chooseSecond(reader);
                break;
            case EXIT:
                break;
            case 1:
               // ArtificialRain.task(reader);
                selectFirst(reader);
                break;
            case 2:
                LookingBenefactor.task(reader);
                selectFirst(reader);
                break;
            case 3:
                TrailingZeros.task(reader);
                selectFirst(reader);
                break;
            case 4:
               // StringToNumber.task(reader);
                selectFirst(reader);
                break;
            case 5:
                TheSmallest.task(reader);
                selectFirst(reader);
                break;
            case 6:
              //  PerimeterSquares.task(reader);
                selectFirst(reader);
                break;
            case 7:
             //   KeepHydrated.task(reader);
                selectFirst(reader);
                break;
            case 8:
              //  MilesToKilometers.task(reader);
                selectFirst(reader);
                break;
            case 9:
                WillsonPrimes.task(reader);
                selectFirst(reader);
                break;
        }
    }

    public static void chooseSecond(BufferedReader reader) {
        System.out.println("Choose task: ");
        System.out.println(ListOfTasks.getSecondList());
        System.out.print("> ");
        int task = -1;
        try {
            task = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error.. try again");
            chooseFirst(reader);
        } catch (NumberFormatException e) {
            System.out.println("Error.. not a number");
            chooseFirst(reader);
        }

        switch (task) {
            default:
                System.out.println("Error.. this option doesn`t exist");
                chooseFirst(reader);
                break;
            case PREV:
                chooseFirst(reader);
                break;
            case NEXT:
                chooseThird(reader);
                break;
            case EXIT:
                break;
            case 1:
              //  Rainfall.task(reader);
                selectSecond(reader);
                break;
            case 2:
                FormattingDecimal.task(reader);
                selectSecond(reader);
                break;
            case 3:
              //  SquareRoot.task(reader);
                selectSecond(reader);
                break;
            case 4:
                VolumeCuboid.task(reader);
                selectSecond(reader);
                break;
            case 5:
             //   WhichX.task(reader);
                selectSecond(reader);
                break;
            case 6:
                BuildCubes.task(reader);
                selectSecond(reader);
                break;
            case 7:
                CountSalutes.task(reader);
                selectSecond(reader);
                break;
            case 8:
                BalanceChecking.task(reader);
                selectSecond(reader);
                break;
            case 9:
                SumOfTerm.task(reader);
                selectSecond(reader);
                break;
        }
    }

    public static void chooseThird(BufferedReader reader) {
        System.out.println("Choose task: ");
        System.out.println(ListOfTasks.getThirdList());
        System.out.print("> ");
        int task = -1;
        try {
            task = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error.. try again");
            chooseFirst(reader);
        } catch (NumberFormatException e) {
            System.out.println("Error.. not a number");
            chooseFirst(reader);
        }

        switch (task) {
            default:
                System.out.println("Error.. this option doesn`t exist");
                chooseFirst(reader);
                break;
            case PREV:
                chooseSecond(reader);
                break;
            case EXIT:
                break;
            case 1:
                GapPrimes.task(reader);
                selectThird(reader);
                break;
            case 2:
              //  HelpBookseller.task(reader);
                selectThird(reader);
                break;
            case 3:
              // CountPositive.task(reader);
                selectThird(reader);
                break;
            case 4:
                IsDivisible.task(reader);
                selectThird(reader);
                break;
            case 5:
                RankingNBA.task(reader);
                selectThird(reader);
                break;
            case 6:
                FloatingPoint.task(reader);
                selectThird(reader);
                break;
        }
    }



    private static void selectFirst(BufferedReader reader) {
        System.out.println("Y for continue\nN for exit");
        System.out.print("> ");
        try {
            String choice = reader.readLine().toUpperCase();
            switch (choice) {
                default:
                    System.out.println("Error.. this option doesn`t exist");
                    selectFirst(reader);
                    break;
                case "Y":
                    chooseFirst(reader);
                    break;
                case "N":
                    break;
            }
        } catch (IOException e) {
            System.out.println("Error.. try again");
            selectFirst(reader);
        }
    }

    private static void selectSecond(BufferedReader reader) {
        System.out.println("Y for continue\nN for exit");
        System.out.print("> ");
        try {
            String choice = reader.readLine().toUpperCase();
            switch (choice) {
                default:
                    System.out.println("Error.. this option doesn`t exist");
                    selectSecond(reader);
                    break;
                case "Y":
                    chooseSecond(reader);
                    break;
                case "N":
                    break;
            }
        } catch (IOException e) {
            System.out.println("Error.. try again");
            selectSecond(reader);
        }
    }

    private static void selectThird(BufferedReader reader) {
        System.out.println("Y for continue\nN for exit");
        System.out.print("> ");
        try {
            String choice = reader.readLine().toUpperCase();
            switch (choice) {
                default:
                    System.out.println("Error.. this option doesn`t exist");
                    selectThird(reader);
                    break;
                case "Y":
                    chooseThird(reader);
                    break;
                case "N":
                    break;
            }
        } catch (IOException e) {
            System.out.println("Error.. try again");
            selectSecond(reader);
        }
    }



    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        chooseFirst(reader);
    }
}
