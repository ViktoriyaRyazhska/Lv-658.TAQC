package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class TrailingZerosInFactorial {

    public static int zeros(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res += n / i;
        }
        return res;
    }

    public static void runTask19(BufferedReader reader) throws IOException {
        try {
            System.out.println("Set number");
            final int number = Integer.parseInt(reader.readLine());
            if (number < 0) {
                throw new IllegalArgumentException("Wrong value: Set a non-negative number");
            }
            System.out.println("Number of trailing zeros: " + zeros(number));
        } catch (NumberFormatException e) {
            System.out.println("Wrong value: Set digits");
            runTask19(reader);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            runTask19(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

