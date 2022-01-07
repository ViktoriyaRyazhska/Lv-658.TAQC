package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuildCubes {

    private static long findNb(long m) {
        int n = 0;
        do {
            long temp = (long) Math.pow(n + 1d, 3d);
            n++;
            m = m - temp;
        } while (m > 0);
        if (m == 0) {
            return n;
        } else {
            return -1;
        }
    }

    public static long getFindNb(long m) {
        return findNb(m);
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter number m:");
        try {
            long m = Long.parseLong(br.readLine());
            System.out.println("The result n = " + findNb(m));
        } catch (IOException e) {
            System.out.println("Error.. try again");
            task(br);
        } catch (IllegalArgumentException e) {
            System.out.println("Error.. Input should be only numbers, not letters, symbols or fractional values!");
            task(br);
        }
    }
}
