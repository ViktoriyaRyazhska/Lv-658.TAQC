package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class WhichXForThatSum {

    public static double solve(double m) {
        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);
    }

    public static void main(String[] args) {
        System.out.println(solve(8.0));
    }
    public static void runTask21(BufferedReader reader) throws IOException {
        try {
            System.out.println("Set number");
            final double number = Double.parseDouble(reader.readLine());
            if (number < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Answer: " + solve(number));
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask21(reader);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runTask21(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


