package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class SquareRoot {

    private static int[] arrayInput(BufferedReader br, int sizeOfArray, int[] array) throws IOException {
        String line = br.readLine();
        String[] str = line.trim().split("\\s+");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = Integer.parseInt(str[i]);
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


    public static boolean getIsPerfectSquare(int n) {
        return isPerfectSquare(n);
    }

    public static int[] getArrayOutput(int sizeOfArray, int[] array, int[] newArray) {
        return arrayOutput(sizeOfArray, array, newArray);
    }

    public static void task(BufferedReader br) throws IOException {
        System.out.println("Please, enter size of an array:");
        int sizeOfArray = Integer.parseInt(br.readLine());
        if (sizeOfArray <= 0) {
            throw new IllegalArgumentException("Only Positive Numbers!");
        }

        System.out.print("Please, enter array: ");
        int array[] = new int[sizeOfArray];
        arrayInput(br, sizeOfArray, array);
        for (int i = 0; i < sizeOfArray; i++) {
            if (array[i] < 0) {
                throw new IllegalArgumentException("Only Positive Numbers!");
            }
        }

        int[] newArray = new int[sizeOfArray];
        arrayOutput(sizeOfArray, array, newArray);
        System.out.print("New array is: ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(newArray[i] + "  ");
        }
        System.out.println();
    }
}
