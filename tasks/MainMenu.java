import java.util.Scanner;

public class MainMenu {
    public static int getTaskNumber()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of task(Input 0 to exit): ");
        int number = 0;
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
                case (0):
                    System.out.println("The End! Thank You!");
                    break;
                case (1):
                    System.out.println("Task 1");
                    break;

                default:
                    System.out.println("Incorrect input!");
                    break;
            }

        }while (numb !=0);
    }
}
