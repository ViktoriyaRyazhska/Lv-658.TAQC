package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class IsDivisible {

    private static int[] divisibleBy(int[] numbers, int div) {
        return Arrays.stream(numbers).filter(i -> (i % div) == 0).toArray();
    }

    public static int[] getDivisibleBy(int[] numbers, int div) {
        return divisibleBy(numbers, div);
    }

    public static void task(BufferedReader br) throws IOException, IllegalArgumentException {
        System.out.println("Please, enter number`s quantity:");
        int size = 0;
        size = Integer.parseInt(br.readLine());

        if (size <= 0) {
            throw new IllegalArgumentException("Error.. array with numbers is empty");
        }
        System.out.println("Please, enter numbers:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Please, enter divisor:");
        int divisor = Integer.parseInt(br.readLine());
        if (divisor == 0) {
            throw new IllegalArgumentException("Error.. divisor can not be 0");
        }

        int[] arrayRes = divisibleBy(array, divisor);
        System.out.println("Result is:");
        System.out.println(Arrays.toString(arrayRes));

    }
}
