import java.util.Scanner;

public class MainMenu {
    public static int getTaskNumber()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of task(Input 0 to exit): ");
        int number ;
        try {
            number = Integer.parseInt(in.nextLine());
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage() + "   Enter only numbers!");
            number = getTaskNumber();
        }
        return number;
    }

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
