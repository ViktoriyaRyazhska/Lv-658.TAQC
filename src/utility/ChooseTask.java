package utility;

import tasks.*;

import java.io.BufferedReader;
import java.io.IOException;

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

            case EXIT:
                break;
            case 1:
                ArtificialRain.task(reader);
                break;
            case 2:
                LookingBenefactor.task(reader);
                break;
            case 3:
                TrailingZeros.task(reader);
                break;
            case 4:
                StringToNumber.task(reader);
                break;
            case 5:
                TheSmallest.task(reader);
                break;
            case 6:
                PerimeterSquares.task(reader);
                break;
            case 7:
                KeepHydrated.task(reader);
                break;
            case 8:
                MilesToKilometers.task(reader);
                break;
            case 9:
                WillsonPrimes.task(reader);
                break;
        }
    }
}
