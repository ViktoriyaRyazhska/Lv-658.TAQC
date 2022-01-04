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

    private static boolean validateSize(int size) {
        boolean flag = true;
        if (size <= 0) {
            flag = false;
            System.out.println("Only Positive Numbers!");
        }
        return flag;
    }

    private static boolean validateArrayInput(int size, int[] array) {
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                System.out.println("Only Positive Numbers!");
                flag = false;
            }
        }
        return flag;
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter size of an array:");
        try {
            int sizeOfArray = Integer.parseInt(br.readLine());
            if (validateSize(sizeOfArray)) {
                System.out.print("Please, enter array: ");
                int array[] = new int[sizeOfArray];
                arrayInput(br, sizeOfArray, array);
                if (validateArrayInput(sizeOfArray, array)) {
                    int[] newArray = new int[sizeOfArray];
                    arrayOutput(sizeOfArray, array, newArray);
                    System.out.print("New array is: ");
                    for (int i = 0; i < sizeOfArray; i++) {
                        System.out.print(newArray[i] + "  ");
                    }
                    System.out.println();
                } else {
                    task(br);
                }
            } else {
                task(br);
            }
        } catch (IOException e) {
            System.out.println("Error. Try again.");
            task(br);
        } catch (IllegalArgumentException e) {
            System.out.println("No Letters Please!");
            task(br);
        }
    }
}
