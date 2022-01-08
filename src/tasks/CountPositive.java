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
            if (array == null) {
                newArray = new int[]{};
            }
            if (array[i] > 0) {
                newArray[0] = newArray[0] + 1;
            } else {
                newArray[1] = newArray[1] + array[i];
            }
        }
        return newArray;
    }

    private static boolean validateSize(int size) {
        boolean flag = true;
        if (size < 0) {
            flag = false;
            System.out.println("Only Positive Numbers!");
        }
        return flag;
    }
    public  static boolean getValidateSize(int size) {
        return validateSize(size);
    }
    public static int[] getArrayOutput(int sizeOfArray, int[] array, int[] newArray) {
    return arrayOutput(sizeOfArray,array,newArray);
    }
    public static int[] getArrayInput(BufferedReader br, int sizeOfArray , int[] array) throws IOException {
    return arrayInput(br,sizeOfArray,array);
    }

    public static void task(BufferedReader br) {
        System.out.println("Please, enter size of an array:");
        try {
            int sizeOfArray = Integer.parseInt(br.readLine());
            if (validateSize(sizeOfArray)) {
                System.out.print("Please, enter array: ");
                int array[] = new int[sizeOfArray];
                arrayInput(br, sizeOfArray, array);

                int[] newArray = new int[2];
                arrayOutput(sizeOfArray, array, newArray);
                System.out.print("New array is: ");
                for (int i = 0; i < 2; i++) {
                    System.out.printf(newArray[i] + "  ");
                }
                System.out.println();
            } else {
                task(br);
            }
        } catch (IOException e) {
            System.out.println("Error. Try again.");
            task(br);
        } catch (IllegalArgumentException e) {
            System.out.println("No Letters Please!");
            task(br);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong format! Write an array with spaces.");
            task(br);
        }
    }
}
