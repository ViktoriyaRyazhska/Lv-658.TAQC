package tasks;

import java.io.BufferedReader;
import java.io.IOException;

public class CountPositive {
    private static int[] arrayInput(BufferedReader br, int sizeOfArray, int[] array) throws IOException {
        String line = br.readLine();
        String[] str = line.trim().split("\\s+");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        return array;
    }

    private static int[] arrayOutput(int sizeOfArray, int[] array, int[] newArray) {
        for (int i = 0; i < sizeOfArray; i++) {
            if (array == null || sizeOfArray == 0) {
                newArray = new int[0];
            }
            if (array[i] >= 0) {
                newArray[0] = newArray[0] + 1;
            } else {
                newArray[1] = newArray[1] + array[i];
            }
        }
        return newArray;
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter size of an array:");
        try {
            int sizeOfArray = Integer.parseInt(br.readLine());
            if (sizeOfArray <= 0) {
                throw new IllegalArgumentException("Only Positive Numbers!");
            }
            System.out.printf("Please, enter array: ");
            int array[] = new int[sizeOfArray];
            arrayInput(br, sizeOfArray, array);

            int[] newArray = new int[2];
            arrayOutput(sizeOfArray, array, newArray);
            System.out.printf("New array is: ");
            for (int i = 0; i < 2; i++) {
                System.out.printf(newArray[i] + "  ");
            }
        } catch (IOException e) {
            e.printStackTrace();
            task(br);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            task(br);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong format! Write an array with spaces.");
            task(br);
        }
    }
}
