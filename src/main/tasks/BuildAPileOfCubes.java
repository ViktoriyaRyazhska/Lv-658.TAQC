package tasks;

import java.util.Scanner;

public class BuildAPileOfCubes {


    public static long findNb(long m) {
        long mm = 0;
        long n = 0;
        while (mm < m) {
            n = n + 1;
            mm = mm + n * n * n;
        }
        if (mm == m) {
            return n;
        }
        return -1;
    }

    public static void runTask12(BufferedReader reader)throws IOException {
        System.out.println("enter you volume :");
        Scanner Scan = new Scanner(System.in);
        int i = Integer.parseInt(reader.readLine());
//        findNb(10);
        System.out.println("Number of cubes are "+findNb(i));
        System.out.println("Thanks");
    }
}
