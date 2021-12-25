package utill;

import tasks.Seventh;
import tasks.Third;
import tasks.TwentySecond;

public class MainMenu {

    public static void main(String[] args) {
        int numb;
        do {
            numb = ReadFromConsole.getIntNumber();

            switch (numb) {
                case (0) -> TasksDescriptions.EXIT.getDescription();
                case (1) -> TasksDescriptions.FIRST.getDescription();
                case (2) -> TasksDescriptions.SECOND.getDescription();
                case (3) -> {
                    TasksDescriptions.THIRD.getDescription();
                    float mpg = ReadFromConsole.getFloatNumber();
                    System.out.println(Third.mpgToKPM(mpg));
                }
                case (4) -> TasksDescriptions.FOURTH.getDescription();
                case (7) -> {
                    TasksDescriptions.SEVENTH.getDescription();
                    double n = ReadFromConsole.getFloatNumber();
                    System.out.println(Seventh.am_i_wilson(n) ? "Yes" : "No");
                }
                case (22) -> {
//                    TasksDescriptions.
                    System.out.println(TwentySecond.perimeter(ReadFromConsole.getIntNumber()));
                }
                default -> System.out.println("Incorrect input!");
            }

        } while (numb != 0);
    }
}
