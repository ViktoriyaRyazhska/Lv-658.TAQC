package utill;

import tasks.*;

import java.util.Arrays;

import static tasks.Fifth.count;
import static tasks.Nineteenth.minUmbrellas;

public class MainMenu {

    public static void main(String[] args) {
        int numb;
        do {
            numb = ReadFromConsole.getTaskNumber();

            switch (numb) {
                case (0) -> TasksDescriptions.EXIT.getDescription();
                case (1) -> {
                    TasksDescriptions.FIRST.getDescription();
                    float time = ReadFromConsole.getFloatNumber();
                    System.out.println(First.count(time));
                }
                case (2) -> TasksDescriptions.SECOND.getDescription();
                case (3) -> {
                    TasksDescriptions.THIRD.getDescription();
                    System.out.println(Third.mpgToKPM(ReadFromConsole.getFloatNumber()));
                }
                case (4) -> TasksDescriptions.FOURTH.getDescription();
                case (5) -> {
                    TasksDescriptions.FIFTH.getDescription();
                    System.out.println("Input array length");
                    int arrayLength = ReadFromConsole.getIntNumber();
                    int[] array = new int[arrayLength];
                    for (int i = 0; i < arrayLength; i++) {
                        System.out.println("Input value " + i);
                        array[i] = ReadFromConsole.getIntNumber();
                    }
                    System.out.println(Arrays.toString(count(array)));
                }
                case (7) -> {
                    TasksDescriptions.SEVENTH.getDescription();
                    System.out.println(Seventh.am_i_wilson(ReadFromConsole.getFloatNumber()) ? "Yes" : "No");
                }
                case (11) -> {
                    TasksDescriptions.ELEVENTH.getDescription();
                    System.out.println(Eleventh.seriesSum(ReadFromConsole.getIntNumber()));
                }
                case (15) -> {
                    TasksDescriptions.FIFTEENTH.getDescription();
                    System.out.println("Enter double number with exponential part(e.g 1e-16): ");
                    double number = ReadFromConsole.getDoubleNumber();
                    Fifteenth.f(number);
                }
                case (19) -> {
                    TasksDescriptions.NINETEENTH.getDescription();
                    System.out.println("Count of needed umbrellas is "
                            + minUmbrellas(ReadFromConsole.getArrayOfWeather()));
                }

                default -> System.out.println("Incorrect input!");
            }

        } while (numb != 0);
    }
}
