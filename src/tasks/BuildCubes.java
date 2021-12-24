package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuildCubes {

    private static long findNb(long m) {
        int n = 0;
        do {
            long temp = (long) Math.pow(n+1d, 3d);
            n++;
            m = m - temp;
        } while (m > 0);

        if (m==0){
            return n;
        }
        else {
            return -1;
        }
        //return (m == 0) ? n : -1;
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter number m:");
        try {
            long m = Long.parseLong(br.readLine());
            System.out.println("The result n = " + findNb(m));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        task(br);
    }
}
