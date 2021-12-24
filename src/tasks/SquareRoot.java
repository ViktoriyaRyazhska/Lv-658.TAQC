package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class SquareRoot {

    private static boolean isPerfectSquareWithOptimization(int n) {
        if (n < 0) {
            return false;
        }

        switch ((int) (n & 0xF)) {
            case 0: case 1: case 4: case 9:
                int tst = (int) Math.sqrt(n);
                return tst * tst == n;
            default:
                return false;
        }
    }

    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter size of an array:");
        int sizeOfArray = Integer.parseInt(br.readLine());

        System.out.printf("Please, enter array: ");
        int array[] = new int[sizeOfArray];
        String line = br.readLine();
        String[] str = line.trim().split("\\s+");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = Integer.parseInt(str[i]);
            if (array[i]<0){
                throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
            }
        }

        int[] newArray = array;
        for (int i = 0; i < array.length; i++) {
            if (isPerfectSquareWithOptimization(array[i])) {
                newArray[i] = (int) Math.sqrt((array[i]));
            } else {
                newArray[i] = array[i] * array[i];
            }
        }
        System.out.printf("New array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(newArray[i] + "  ");
        }
    }
}
