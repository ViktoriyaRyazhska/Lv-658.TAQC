package utill;
import static utill.ReadFromConsole.getTaskNumber;

public class MainMenu {

    public static void main(String[] args) {
        int numb;
        do {
            numb = getTaskNumber();

            switch (numb) {
                case (0) -> TasksDescriptions.EXIT.getDescription();
                case (1) -> TasksDescriptions.FIRST.getDescription();
                case (2) -> TasksDescriptions.SECOND.getDescription();
                case (3) -> TasksDescriptions.THIRD.getDescription();
                case (4) -> TasksDescriptions.FOURTH.getDescription();
                default -> System.out.println("Incorrect input!");
            }

        }while (numb !=0);
    }
}
