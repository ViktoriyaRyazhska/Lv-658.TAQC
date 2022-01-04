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

    private static boolean validate(int[] numbers, int div) {
        boolean flag = true;
        if (div == 0) {
            flag = false;
            System.out.println("Error.. divisor can not be 0");
        }
        if(numbers.length == 0)
        {
            flag = false;
            System.out.println("Error.. array with numbers is empty");
        }
        return flag;
    }

    public static void task(BufferedReader br)  {
        System.out.println("Please, enter number`s quantity:");
        int size = 0;
        try {
            size = Integer.parseInt(br.readLine());
            System.out.println("Please, enter numbers:");
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(br.readLine());
            }
            System.out.println("Please, enter divisor:");
            int divisor = Integer.parseInt(br.readLine());

            if(validate(array,divisor)) {
                int[] arrayRes = divisibleBy(array, divisor);
                System.out.println("Result is:");
                System.out.println(Arrays.toString(arrayRes));
            }
            else {
                task(br);
            }
        } catch (IOException e) {
            System.out.println("Error.. try again");
            task(br);
        } catch (IllegalArgumentException e) {
            System.out.println("Error.. not a number");
            task(br);
        }


    }
}
