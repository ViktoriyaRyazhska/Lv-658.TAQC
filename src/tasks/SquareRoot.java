package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class SquareRoot {

    private static int[] arrayInput(BufferedReader br, int sizeOfArray, int[] array) throws IOException {
        String line = br.readLine();
        String[] str = line.trim().split("\\s+");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = Integer.parseInt(str[i]);
            if (array[i] < 0) {
                throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
            }
        }
        return array;
    }

    private static boolean isPerfectSquare(int n) {
        if (n < 0) {
            return false;
        }
        switch ((int) (n & 0xF)) {
            case 0:
            case 1:
            case 4:
            case 9:
                int tst = (int) Math.sqrt(n);
                return tst * tst == n;
            default:
                return false;
        }
    }

    private static int[] arrayOutput(int sizeOfArray, int[] array, int[] newArray) {
        for (int i = 0; i < sizeOfArray; i++) {
            if (isPerfectSquare(array[i])) {
                newArray[i] = (int) Math.sqrt((array[i]));
            } else {
                newArray[i] = array[i] * array[i];
            }
        }
        return newArray;
    }

    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter size of an array:");
        int sizeOfArray = Integer.parseInt(br.readLine());

        System.out.printf("Please, enter array: ");
        int array[] = new int[sizeOfArray];
        arrayInput(br, sizeOfArray, array);

        int[] newArray = new int[sizeOfArray];
        arrayOutput(sizeOfArray, array, newArray);
        System.out.printf("New array is: ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.printf(newArray[i] + "  ");
        }
    }
}
