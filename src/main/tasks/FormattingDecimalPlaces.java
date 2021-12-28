package tasks;
import java.util.Scanner;


public class FormattingDecimalPlaces {
    public static void main(String args[]) {

        double i;
        String str = null;
        while (true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter you number 'like 2,22 of 21,8889'");
            try {
                i = scn.nextDouble();
                System.out.println(String.format("%.2f",i));

            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
            System.out.println("Press q for exit or some to continue: ");
            str = scn.next();
            if (str.equals("q")) {
                System.out.println("Выход");
                return;
            }
        }
    }
}
